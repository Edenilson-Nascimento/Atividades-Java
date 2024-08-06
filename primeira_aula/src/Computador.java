// classe computador 

public class Computador {

    String marca;
    String processador;
    String ran;
    String sistema;

    public Computador(String marca, String processador, String ran, String sistema) {
        // contrutor das classes
        this.marca = marca;
        this.processador = processador;
        this.ran = ran;
        this.sistema = sistema;
    }

    //Metodos gets

    public String getMarca(){
        return marca;
    }

    public String getProcessador(){
        return processador;
    }

    public String getRan(){
        return ran;
    }

    public String getSistema(){
        return sistema;
    }


    //Método main para criar um objeto e definir os valores dos atributos
    
    public static void main(String[] args) {
        //Criando um objeto da classe Computador e definindo os valores dos atributos
        Computador computadorA = new Computador("HP", "Intel(R) Core(TM) i5-3320M CPU", "8GB", "Sistema operacional de 64 bits");

        //Exibindo os valores dos atributos do objeto
        System.out.println("Marca: " + computadorA.getMarca());
        System.out.println("Processador: " + computadorA.getProcessador());
        System.out.println("RAM: " + computadorA.getRan());
        System.out.println("Sistema operacional: " + computadorA.getSistema());

        
    }

}