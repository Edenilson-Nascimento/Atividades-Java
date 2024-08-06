public class ProdutoNovo {

        // Atributos privados
        
        private String nome;
        
        private int quantidade;
        
        // Construtor
        
        public ProdutoNovo(String nome, int quantidade) { this.nome = nome;
        this.quantidade = quantidade;
        
        }
        
        // Métodos públicos para acessar e modificar os atributos
        
        public String getNome() {
        
        return nome;
        
        }
        
        public void setNome(String nome) {
        
        this.nome = nome;
        
        }
        
        public int getQuantidade(){
        
        return quantidade;
        
        }
        
        public void setQuantidade(int quantidade) {
        
        // Podemos adicionar lógica para validação
        
        if (quantidade >= 1) {
        System.out.println("O estoque possui: " + quantidade);
        this.quantidade = quantidade;
        
        }else{
            System.out.println("Estoque zerado!");
            this.quantidade = quantidade;
        }
        
        }
        
        // Método para exibir as informações da pessoa
        
        public void exibirInformacoes() {
        
        System.out.println("Nome: " + this.nome);
        System.out.println("Quantidade: " + this.quantidade);
        }

        public static void main(String[] args) {

        ProdutoNovo produtoA= new ProdutoNovo("Limão", 0);
        
        produtoA.setNome("Limao");
        produtoA.setQuantidade(produtoA.getQuantidade());
        produtoA.exibirInformacoes();
        
        }
        
}
