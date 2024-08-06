public class Gato {
    private String nome;

    void comeu(){
        System.out.println(nome + " comeu.");
    }

    void bebeu(){
        System.out.println(nome + " bebeu.");
    }

    void miou(){
        System.out.println(nome + " miou.");
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
       this.miou();
    }

    public static void main(String[] args) {
        Gato gato1 = new Gato();
        gato1.setNome("Miau");
        gato1.mostra();     
    
}

}