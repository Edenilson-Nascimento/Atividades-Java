public class Cachorro {
protected String nome;

public Cachorro(String nome) {
    this.nome = nome; 
}

public void comeu(){
    System.out.println(nome + " comeu!");
}

public void bebeu(){
    System.out.println(nome + " bebeu");
}

public void latiu(){
    System.out.println(nome + " latiu!");
}

public void lambeu(){
    System.out.println(nome + " lambeu!");
}

public String getNome(){
    return nome;
}

public void setNome(String nome){
    this.nome = nome;
}

public void mostra(){

    this.comeu();
    this.bebeu();
    this.latiu();
    this.lambeu();
}

public static void main(String[] args) {
    Cachorro cachorroA = new Cachorro("Lulu");
    cachorroA.setNome("Rex");
    cachorroA.mostra();
  
}

}
