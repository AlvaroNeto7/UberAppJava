public class DiaTrabalho {
    private double horasTrabalhadas;
    private double ganhosBrutos;
    private double custoAbastecimento;

    public DiaTrabalho(double horasTrabalhadas, double ganhosBrutos, double custoAbastecimento) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.ganhosBrutos = ganhosBrutos;
        this.custoAbastecimento = custoAbastecimento;
    }

    public double calcularLucroLiquido() {
        return ganhosBrutos - custoAbastecimento;
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
        return horasTrabalhadas + "," + ganhosBrutos + "," + custoAbastecimento + "," + calcularLucroLiquido();
    }
}
