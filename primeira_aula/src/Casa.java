// Objeto casa
public class Casa {
    // Atributos da casa
    private String cimento;
    private String areia;

    // Construtor da casa
    public Casa(String cimento, String areia) {
        this.cimento = cimento;
        this.areia = areia;
    }

    
    public String gatCimento(){
        return cimento;
    }

    public void setCimento(String cimento){
        this.cimento = cimento;
    }

    public String gatAreia(){
        return areia;
    }

    public void setAreia(String areia){
        this.areia = areia;
    }

    public static void main(String [] args){
        // Utilizando o método main para testar a classe Casa com valores
        // Instância da casa
        Casa casa1 = new Casa("Cimento branco", "Areia verde");
        System.out.println("Cimento: " + casa1.gatCimento());
        System.out.println("Areia: " + casa1.gatAreia());
    }
}
