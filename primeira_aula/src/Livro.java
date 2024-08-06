public class Livro {
    private String titulo;
    private String autor;
    private String publicadora;
    private String descricao;
    private int numeroPagina;

    public Livro(String titulo, String autor, String publicadora, String descricao, int numeroPagina){

        this.titulo = titulo;
        this.autor = autor;
        this.publicadora = publicadora;
        this.descricao = descricao;
        this.numeroPagina = numeroPagina;

    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }


    public String getPublicadora(){
        return publicadora;
    }

    public void setPublicadora(String publicadora){
        this.publicadora = publicadora;
    }


    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public int getNumeroPagina(){
        return numeroPagina;
    }


    public void setNumeroPagina(int numeroPagina){
        if (numeroPagina >= 10) {
            this.numeroPagina = numeroPagina;
            this.verInformacoes();
            
        }else{
            System.out.println("O numero de paginas precisa ser maior ou igual a 10");
            System.out.println("Numero atual de paginas e: " + this.getNumeroPagina());

        }
    } 

    public void verInformacoes(){

        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Publicadora: " + this.getPublicadora());
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Número de páginas: " + this.getNumeroPagina());
    }
    

    public static void main(String[] args) {
        Livro novoLivro = new Livro("Fazendo meu código", "Edenilson", 
        "Casa publcadora", "Um livro sobre meus códigos",66);

        novoLivro.setNumeroPagina(novoLivro.getNumeroPagina());
    
    }
}