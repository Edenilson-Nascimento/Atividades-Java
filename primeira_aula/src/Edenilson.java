public class Edenilson {
   private String nome;
    private int idade;
    private String endereco;
    private String cep;
    private String profissao;
    private String telefone;
    private String email;
    private boolean carro;
    private double salario;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getCep(){
        return cep;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    public String getProfissao(){
        return profissao;
    }

    public void setProfissao(String profissao){
        this.profissao = profissao;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public boolean getCarro(){
        return carro;
    }

    public void setCarro(boolean carro){
        this.carro = carro;
    }   

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }


    public static void main(String[] args) {
        
        Edenilson edenilson = new Edenilson();
        edenilson.setNome("Edenilson");
        edenilson.setIdade(25);
        edenilson.setEndereco("Taguatinga Centro - C1 Lote 3");
        edenilson.setCep("72010-010");
        edenilson.setProfissao("Desenvolvedor Java");
        edenilson.setTelefone("(75) 99272-8439");
        edenilson.setEmail("edenilson.dy@gmail.com");
        edenilson.setCarro(false);
        edenilson.setSalario(1600.00);

        System.out.println("Nome: " + edenilson.getNome());
        System.out.println("Idade: " + edenilson.getIdade());
        System.out.println("Endereço: " + edenilson.getEndereco());
        System.out.println("CEP: " + edenilson.getCep());
        System.out.println("Profissão: " + edenilson.getProfissao());
        System.out.println("Telefone: " + edenilson.getTelefone());
        System.out.println("Email: " + edenilson.getEmail());
        System.out.println("Tem carro: " + edenilson.getCarro());
        System.out.println("Salário: " + edenilson.getSalario());
    }

}