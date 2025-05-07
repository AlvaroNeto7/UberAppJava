import java.io.*;
import java.util.*;

public class RelatorioFinanceiro {
    private static final String ARQUIVO_CSV = "ganhos.csv";

    public static void salvarDia(DiaTrabalho dia) {
        try (FileWriter fw = new FileWriter(ARQUIVO_CSV, true)) {
            fw.write(dia.toString() + "\n");
        } catch (IOException e) {
            System.out.println("Erro ao salvar no CSV: " + e.getMessage());
        }
    }

    public static List<DiaTrabalho> carregarDias() {
        List<DiaTrabalho> dias = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO_CSV))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length >= 3) {
                    double horas = Double.parseDouble(partes[0]);
                    double ganhos = Double.parseDouble(partes[1]);
                    double abastecimento = Double.parseDouble(partes[2]);
                    dias.add(new DiaTrabalho(horas, ganhos, abastecimento));
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o CSV: " + e.getMessage());
        }
        return dias;
    }

    public static void mostrarMedia(List<DiaTrabalho> dias) {
        if (dias.isEmpty()) {
            System.out.println("Nenhum dado encontrado.");
            return;
        }

        double totalHoras = 0, totalGanhos = 0, totalAbastecimento = 0, totalLucro = 0;

        for (DiaTrabalho dia : dias) {
            totalHoras += dia.getHorasTrabalhadas();
            totalGanhos += dia.getGanhosBrutos();
            totalAbastecimento += dia.getCustoAbastecimento();
            totalLucro += dia.calcularLucroLiquido();
        }

        int diasCount = dias.size();

        System.out.println("\n--- Média Financeira ---");
        System.out.printf("Dias Registrados: %d\n", diasCount);
        System.out.printf("Média de Horas: %.2f h\n", totalHoras / diasCount);
        System.out.printf("Média de Ganhos: R$%.2f\n", totalGanhos / diasCount);
        System.out.printf("Média de Abastecimento: R$%.2f\n", totalAbastecimento / diasCount);
        System.out.printf("Média de Lucro Líquido: R$%.2f\n", totalLucro / diasCount);
    }
}
