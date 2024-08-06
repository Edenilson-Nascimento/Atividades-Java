package Pessoas;

public class Aluno extends Pessoa{
    private String curso;

    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }


    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
        System.out.println("curso de "+ curso);
    }

    @Override
    public void apresentar(){
        super.apresentar();
        System.out.printf("Curso: %s\n ", curso);  
    }

}
