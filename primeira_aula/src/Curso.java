
public class Curso {
    private String nome;
    private String horas;


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getHoras(){
        return horas;
    }

    public void setHoras(String horas){
        this.horas = horas;
        //timer.schedule(new HorarioAula(), 0, 60000); // Executa a cada 60 segundos
    }

    public static void main(String[] args){
        Curso cursoA = new Curso();
        cursoA.setNome("React");
        cursoA.setHoras("44h");
     
        System.out.println("O nome do curso é: " + cursoA.getNome());
        System.out.println("O curso tem duração de: " + cursoA.getHoras());
    }
}
