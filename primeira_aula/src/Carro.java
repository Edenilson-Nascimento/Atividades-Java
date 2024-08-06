//Classe carro e seus atributos[caracteristicas] 

public class Carro{
    String cor;
    String modelo;
    String marca;


public Carro(String cor, String modelo, String marca) {
    this.cor = cor;
    this.modelo = modelo;
    this.marca= marca;
}

public String getCor(){
    return cor;
}

public String getModelo(){
    return modelo;
}

public String getMarca(){
    return marca;
}

       void acelerar() {
        System.out.println("Carro está acelerando");
    }

    void frear() {
        System.out.println("O carro está freando");
    }

    void virar(String direcao) {
        System.out.println("O carro virou para " + direcao + ".");
    }

    public static void main(String[] args) {

        Carro meuCarro = new Carro("azul","Sedan","Toyota");

    
        System.out.println("Meu carro é um " + meuCarro.getMarca() + "do modelo " + meuCarro.getModelo() + "e sua cor é "
         + meuCarro.getCor());
 
        meuCarro.acelerar();
        meuCarro.frear();
        meuCarro.virar("direita");
    
    }
}

