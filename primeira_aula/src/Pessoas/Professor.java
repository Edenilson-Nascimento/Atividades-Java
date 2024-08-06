package Pessoas;

public class Professor extends Pessoa{
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }


    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
        System.out.println("Disciplina do professor: " + disciplina);
    }

    @Override
    public void apresentar(){
        super.apresentar();
        System.out.printf("Disciplina: %s \n", disciplina);  
    }
}