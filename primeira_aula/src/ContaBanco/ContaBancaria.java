package ContaBanco;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void exibirDetalhes(){
        System.out.printf("Número da Conta: %s \n", numeroConta);
        System.out.printf("Saldo: %4f \n", saldo);
    }

    public String gitNomeConta(){
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public double gitSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
}
