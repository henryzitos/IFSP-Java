import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gato Tibbers = new Gato("Tibbers", 3, "curta");
        Cachorro Lili = new Cachorro("Lili", 3, "srd");
        Cachorro Outro = new Cachorro("Outro", 5, "labrador");

        Tibbers.fazerBarulho();
        Lili.fazerBarulho();
        Outro.fazerBarulho();

        mostrar(Tibbers);
        mostrar(Lili);
        mostrar(Outro);
    }

    public static void mostrar(Animal v){
        System.out.println(v.toString());
    }
}
