package Animais;

public class Gato extends Animal{ 
    
    public Gato(String nome) {
        super(nome);
    }

    public void miar(){
        System.out.println(getNome() + " Está miando");
    }
}
