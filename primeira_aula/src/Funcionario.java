public class Funcionario {
    private String nome;
    private double salario;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
    public static void main(String[] args) {

        Funcionario funcionarioA = new Funcionario();

        funcionarioA.setNome("João");
        funcionarioA.setSalario(1500.00);

    System.out.println("O funcionario " + funcionarioA.getNome() + ", recebe um salario de " + funcionarioA.getSalario() + " R$");

    }
}