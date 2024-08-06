public class Nadador {
 private String nome;
 private int idade;


public Nadador(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
}

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
    if (idade < 18) {
        System.out.println("vc é menor de idade");
        this.idade = idade;
    }else{
        System.out.println("vc é maior de idade");
        this.idade = idade;
    }
}


    public void mostrarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

public static void main( String[] args){
    Nadador nadador1 = new Nadador("João", 11);
    nadador1.setIdade(19);
    nadador1.mostrarDados();
}


}