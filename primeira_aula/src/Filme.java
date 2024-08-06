public class Filme {
    // atributosda classe 
    String titulo;
    String ator;
    String diretor;
    String dataLancamento;
    String idioma;


//contrutor da classe
    public Filme(String titulo, String ator, String diretor, String dataLancamento, String idioma){
        this.titulo = titulo;
        this.ator = ator;
        this.diretor = diretor;
        this.dataLancamento = dataLancamento;
        this.idioma = idioma;
    }


    //Métodos getters para acessar os atributos
    public String getTitulo(){
        return titulo;
    }

    public String getAtor(){
        return ator;
    }

    public String getDiretor(){
        return diretor;
    }

    public String getDataLancamento(){
        return dataLancamento;
    }

    public String getIdioma(){
        return idioma;
    }


    //Método main para criar um objeto e definir os valores dos atributos
    public static void main(String[] args) {

        //Criando um objeto da classe Filme definindo os valores dos atributos
        Filme novoFilme = new Filme("The Shawshank Redemption", "Francis Ford Coppola", "Frank Darabont", "1994-09-15","Inglês");
       
        //Exibindo os valores dos atributos do objeto
        System.out.println("Título: " + novoFilme.getTitulo());
        System.out.println("Ator: " + novoFilme.getAtor());
        System.out.println("Diretor: " + novoFilme.getDiretor());
        System.out.println("Data de lançamento: " + novoFilme.getDataLancamento());
        System.out.println("Idioma: " + novoFilme.getIdioma());
    }
}
