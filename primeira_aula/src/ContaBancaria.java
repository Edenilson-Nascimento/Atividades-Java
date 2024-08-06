
import java.util.Date;

public class ContaBancaria {
    String numeroConta;
    double saldo;
    Date dataSaldo;

    // public ContaBancaria(String numeroConta, double saldo, Date dataSaldo){
    //     this.numeroConta = numeroConta;
    //     this.saldo = saldo;
    //     this.dataSaldo = dataSaldo;
    // }

    public String getNumeroConta(){
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public Date getDataSaldo(){
        return dataSaldo;
    }

    public void setDataSaldo(Date dataSaldo){
        this.dataSaldo = dataSaldo;
    }

    public static void main(String[] args) {

        // ContaBancaria contaA = new ContaBancaria("12345-6", 1000.0, new Date());

        ContaBancaria conta1 = new ContaBancaria();

        conta1.setNumeroConta("76545-4");
        conta1.setSaldo(1777.0);

        //Para declaração de datas usamos o: Date dataAtual = new Date();
        Date dataAtual = new Date();
        conta1.setDataSaldo(dataAtual);

        
        System.out.println("O número da Conta é : " + conta1.getNumeroConta());
        System.out.println("Saldo da sua Conta é : " + conta1.getSaldo());
        System.out.println("Data do Saldo da sua Conta é : " + conta1.getDataSaldo());
    }
}

