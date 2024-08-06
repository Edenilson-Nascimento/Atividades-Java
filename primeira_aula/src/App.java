// import Animales.Cachorro;
// import Animales.Gato;

import Pessoas.Aluno;
import Pessoas.Professor;

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


        System.out.println("Aluno");
        Aluno aluno = new Aluno("Jose", 15, "programação");
        aluno.apresentar();
    

        System.out.println("\nProfessor");
        Professor professor = new Professor("Maria", 45, "programação");
        professor.apresentar();
        
    }
}