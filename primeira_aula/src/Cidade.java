public class Cidade {
    private String nome;
    private int populacao;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getPopulacao(){
        return populacao;
    }

    public void setPopulacao(int populacao){
        this.populacao = populacao;
    }

    public static void main(String[] args) {
        Cidade cidadeA = new Cidade();
        cidadeA.setNome("Salvador");
        cidadeA.setPopulacao(77_765);
        System.out.println("Cidade A: " + cidadeA.getNome() + ", " + cidadeA.getPopulacao() + " habitantes");
    }
}
