public class Produto{
    
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade){

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public static void main(String[] args) {

        Produto sorvete = new Produto("Chocolate", 4.75, 55);

        System.out.println("Nome: " + sorvete.getNome());
        System.out.println("Preço: " + sorvete.getPreco());
        System.out.println("Quantidade: " + sorvete.getQuantidade());
    }
}