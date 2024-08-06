import java.util.Scanner;


public class Filmes {
    private String titulo;
    private int classificacao;


    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getClassificacao(){
        return classificacao;
    }

    public void setClassificacao(int classificacao){


       if (classificacao >= 18) {
        this.classificacao = classificacao;
        System.out.println("Vamos assistir " + this.getTitulo());
           
       }else{
        System.out.println("Classificação inválida! voce é menor de idade");
        this.classificacao = 0;
       }
    }

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = leia.nextInt();
            
        Filmes filmeA = new Filmes();
            
        filmeA.setTitulo("A Hora do pesadelo");
        filmeA.setClassificacao(idade);
    }
}
