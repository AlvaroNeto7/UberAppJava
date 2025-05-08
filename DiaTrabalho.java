import java.time.LocalDate;

public class DiaTrabalho {
    private LocalDate data;
    private double horasTrabalhadas;
    private double ganhosBrutos;
    private double custoAbastecimento;

    public DiaTrabalho(double horasTrabalhadas, double ganhosBrutos, double custoAbastecimento) {
        this.data = LocalDate.now();
        this.horasTrabalhadas = horasTrabalhadas;
        this.ganhosBrutos = ganhosBrutos;
        this.custoAbastecimento = custoAbastecimento;
    }

    public double calcularLucroLiquido() {
        return ganhosBrutos - custoAbastecimento;
    }

    public double calcularGanhoPorHora() {
        return horasTrabalhadas > 0 ? calcularLucroLiquido() / horasTrabalhadas : 0;
    }

    public LocalDate getData() {
        return data;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getGanhosBrutos() {
        return ganhosBrutos;
    }

    public double getCustoAbastecimento() {
        return custoAbastecimento;
    }

    @Override
    public String toString() {
        return data + "," + horasTrabalhadas + "," + ganhosBrutos + "," + custoAbastecimento + "," +
               String.format("%.2f", calcularLucroLiquido()) + "," +
               String.format("%.2f", calcularGanhoPorHora());
    }
}
