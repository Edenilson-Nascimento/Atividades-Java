package Animales;

public class Cachorro extends Animal{

    public Cachorro(String nome) {
        super(nome);
    }

    public void latir(){
        System.out.println(getNome() + " Está latido " );
    }
    public void lamber(){
    System.out.println(getNome() + " Está lambendo ");
    }
    
}
