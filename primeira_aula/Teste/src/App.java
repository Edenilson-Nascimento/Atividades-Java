
import Animais.Cachorro;
import Animais.Gato;

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("Meu cachorro");
        Cachorro cachorro = new Cachorro("rex");
        cachorro.comer();
        cachorro.beber();
        cachorro.latir();
        cachorro.lamber();

        System.out.println("\nMeu gato");
        Gato gato =new Gato("bixano");
        gato.setNome("Tom");
        gato.comer();
        gato.beber();
        gato.miar();
        
        
    }
}
