import java.util.*;

public class AppMotorista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Menu Uber Motorista ===");
            System.out.println("1 - Registrar novo dia");
            System.out.println("2 - Ver médias (semanais/mensais)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Horas trabalhadas: ");
                    double horas = scanner.nextDouble();

                    System.out.print("Ganhos brutos (R$): ");
                    double ganhos = scanner.nextDouble();

                    System.out.print("Gastos com abastecimento (R$): ");
                    double abastecimento = scanner.nextDouble();

                    DiaTrabalho dia = new DiaTrabalho(horas, ganhos, abastecimento);
                    RelatorioFinanceiro.salvarDia(dia);
                    System.out.println("Dia salvo com sucesso!");
                    break;

                case 2:
                    List<DiaTrabalho> dias = RelatorioFinanceiro.carregarDias();
                    RelatorioFinanceiro.mostrarMedia(dias);
                    break;

                case 0:
                    System.out.println("Encerrando aplicação...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
