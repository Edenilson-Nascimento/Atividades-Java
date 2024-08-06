
public class Pet extends Cachorro {
    String raca;
  public Pet(String nome, String raca){
    super(nome); // Chama o construtor da classe pai (Cachorro)
    this.raca = raca;
  }
  public void caiu(){
   System.out.println(nome + " caiu!");
  }

  public static void main(String[] args) {
    Pet pet1 = new Pet("luiz", "Golden Retriever");
    pet1.mostra();
    System.out.println(pet1.raca);

  }
    
}
