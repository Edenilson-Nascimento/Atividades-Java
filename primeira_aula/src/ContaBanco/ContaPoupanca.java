package ContaBanco;

public class ContaPoupanca extends ContaBancaria {
    private double taxaDeJuros;

    public ContaPoupanca(String numeroConta, double saldo, double taxaDeJuros) {
        super(numeroConta, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.printf("Taxa de Juros: %.2f \n ", taxaDeJuros);
    }

    public double gitTaxaDejuros(){
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }
}
