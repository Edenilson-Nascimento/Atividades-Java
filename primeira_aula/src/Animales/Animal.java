package  Animales;

public class Animal {

    private String nome;
    
    public Animal(String nome) {
        this.nome = nome;
    }

    public void comer() {
    System.out.println(nome + " Está Comendo" );
    }
   
    public void beber() {
    System.out.println(nome + " Está babendo ");
    }
    public String getNome() {
    return nome;
    }
    public void setNome(String nome) {
    this.nome = nome;
    }

}
