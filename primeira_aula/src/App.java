import Veiculos.Carro;
import Veiculos.Moto;

// import ContaBanco.ContaCorrente;
// import ContaBanco.ContaPoupanca;

// import Animales.Cachorro;
// import Animales.Gato;

// import Pessoas.Aluno;
// import Pessoas.Professor;

public class App {

    public static void main(String[] args) throws Exception {

        // System.out.println("Meu cachorro");
        // Cachorro cachorro = new Cachorro("rex");
        // cachorro.comer();
        // cachorro.beber();
        // cachorro.latir();
        // cachorro.lamber();

        // System.out.println("\nMeu gato");
        // Gato gato =new Gato("bixano");
        // gato.setNome("Tom");
        // gato.comer();
        // gato.beber();
        // gato.miar();


        // System.out.println("Aluno");
        // Aluno aluno = new Aluno("Jose", 15, "programação");
        // aluno.apresentar();
    

        // System.out.println("\nProfessor");
        // Professor professor = new Professor("Maria", 45, "programação");
        // professor.apresentar();
        
        // System.out.println("Conta Corrente");
        // ContaCorrente contaCorrenteA = new ContaCorrente("12345-0", 1.50000f, 800d);
        // contaCorrenteA.exibirDetalhes();

        // System.out.println("\nConta Poupança");
        // ContaPoupanca contaPoupancaA = new ContaPoupanca("67890-1", 2.0000d, 100d);
        // contaPoupancaA.exibirDetalhes();

        System.out.println("Carro");
        Carro meuCarro = new Carro("Toyota", 2024, 4);
        meuCarro.detalhes();

        System.out.println("\nMoto");
        Moto minhaMoto = new Moto("Honda", 2018, 2);
        minhaMoto.detalhes();
    }
}