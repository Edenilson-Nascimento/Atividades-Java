package Veiculos;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, int ano, int numPortas) {
        super(marca, ano);
        this.numPortas = numPortas;
    }

    @Override
    public void detalhes(){
        super.detalhes();
        System.out.println("Número de portas: " + numPortas);
    }

    public int getNumPortas(){
        return numPortas;
    }

    public void setNumPortas(int numPortas){
        this.numPortas = numPortas;
    }

    
}
