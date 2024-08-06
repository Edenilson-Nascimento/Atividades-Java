// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

public class Cadastro {
    String nome;
    int idade;
    String endereço;
    String telefone;
    String email;
    String cpf;
    String sexo;
    String estadoCivil;
    String profissão;
    double salário;
    String nacionalidade;
    String filhos;
    
    public Cadastro(String nome,int idade,String endereço,String telefone,String email,String cpf,String sexo, String estadoCivil,String profissão,double salário,String nacionalidade,String filhos){
        this.nome = nome;
        this.idade = idade;
        this.endereço = endereço;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.profissão = profissão;
        this.salário = salário;
        this.nacionalidade = nacionalidade;
        this.filhos = filhos;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        if ( nome == null || nome == " " || nome == "") {
            System.out.println("O nome não pode ser vazio ou nulo.");
            this.nome = nome;  
        }
            System.out.println("Nome: " + this.getNome());

    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        if (idade <= 0) {
            System.out.println("A idade não pode ser negativa.");
            this.idade = idade;
        }else{
            System.out.println("Idade: " + this.getIdade());
        }
    }

    public String getEndereço(){
        return endereço;
    }

    public void setEndereço(String endereço){
        
        if (endereço.isEmpty()) {
            System.out.println("Add um endereço");
            
        }else{
            System.out.println("Endereço: " + this.getEndereço());
            this.endereço = endereço;
        }
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        if(telefone.length() == 10) {
        System.out.println("Telefone: " + this.getTelefone());

        } else {
        System.out.println("O teleone deve conter apenas dígitos e ter pelo menos 10 caracteres.");
        }
        
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        // ^\S+@\S+\.\S+$	Regex para validar um endereço de e-mail padrão.
        // Pattern pattern = Pattern.compile("^\\S+@\\S+$");
        // Matcher matcher = pattern.matcher(email);
        // boolean matchFound = matcher.matches();
        if(email.contains("@")) {
        System.out.println("Email: " + this.getEmail());

        } else {
        System.out.println("O email Deve conter o símbolo '@'.");
        }
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
      
        if(cpf.length() != 11){
            System.out.println("O CPF deve conter 11 dígitos.");
        }
        if(!cpf.matches("[0-9]*")){  
            System.out.println("O CPF deve conter apenas numeros.");
        }else{
            System.out.println("CPF: " + this.getCpf());
        }
    
    }

    public String getSexo(){
        return sexo;
    }

    public void setSexo(String sexo){
        if (
            sexo.equalsIgnoreCase("masculino") ||
            sexo.equalsIgnoreCase("feminino") ||
            sexo.equalsIgnoreCase("outro")
        ){
            System.out.println("Sexo: " + this.getSexo());
        }else{
            System.out.println("Sexo inválido. Deve ser 'Masculino', 'Feminino' ou 'Outro'.");
        }
    }

    public String getEstadoCivil(){
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil){
        if (
            estadoCivil.equalsIgnoreCase("solteiro") ||
            estadoCivil.equalsIgnoreCase("casado") ||
            estadoCivil.equalsIgnoreCase("divorciado") ||
            estadoCivil.equalsIgnoreCase("viúvo")
        ){
            System.out.println("Estado Civil: " + this.getEstadoCivil());
        }else{
            System.out.println("Estado Civil inválido. Deve ser 'Solteiro', 'Casado', 'Divorciado', 'Viúvo' ou 'Separado'.");
        }
    }

    public String getProfissão(){
        return profissão;
    }

    public void setProfissão(String profissão){
    if (profissão.isEmpty()){
        System.out.println("Não pode ser vazia ou nula");
            
            } else{
                System.out.println("Profissão: " + this.getProfissão());
                this.profissão = profissão;
        }
    }

    public double getSalário(){
        return salário;
    }

    public void setSalário(double salário){
        if (salário <= 0) {
            System.out.println("Deve ser um valor positivo");
            this.salário = salário;
        } else{
            System.out.println("Salário: " + this.getSalário());
        }
    }

    public String getNacionalidade(){
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade){
        //Aceita qualquer string.
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        this.nacionalidade = nacionalidade;
    }

    public String getFilhos(){
        return filhos;
    }

    public void setFilhos(String filhos){
        if (
            filhos.equalsIgnoreCase("Nenhum") ||
            filhos.equalsIgnoreCase("Um") ||
            filhos.equalsIgnoreCase("Dois") ||
            filhos.equalsIgnoreCase("Três") ||
            filhos.equalsIgnoreCase("Quatro") ||
            filhos.equalsIgnoreCase("Cinco") ||
            filhos.equalsIgnoreCase("Seis")
        ){
            System.out.println("Filhos: " + this.getFilhos());
        }else{
            System.out.println("Número de filhos inválido. Deve ser 'Nenhum', 'Um', 'Dois', 'Três', 'Quatro', 'Cinco', 'Seis' ou 'Mais de seis'.");
        }
    }

    public void exibir(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Endereço: " + this.getEndereço());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Email: " + this.getEmail());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Estado Civil: " + this.getEstadoCivil());
        System.out.println("Profissão: " + this.getProfissão());
        System.out.println("Salário: " + this.getSalário());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Filhos: " + this.getFilhos());
    }

    public void atualizar(String endereço){
        this.setEndereço(endereço);
        System.out.println("Endereço Atualizado: " + this.getEndereço());  
    }
    

    public static void main(String[] args){
        Cadastro cadastroA = new Cadastro("Ede", 25, "Rua 123, 1234",
         "7592728439", "joao@email.com", "12345678977", "Masculino",
          "Casado", "Engenheiro", 5000.0, "Brasileiro", "um");
        cadastroA.exibir();
        cadastroA.atualizar("Rua 456, 4567");

        
        


       
        
    
    }

}
