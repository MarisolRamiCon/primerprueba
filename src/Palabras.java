import java.util.ArrayList;
import java.util.List;

public class Palabras {
    public static void main(String[] args) {
        //declare una lista vacia
        List<Integer> lista1= new ArrayList<>();
        lista1.add(5);
        lista1.add(10);
        lista1.add(1,8);//[5,8,10]
        lista1.add(10);
        System.out.println("el segundo elemento es "+lista1.get(1));
        lista1.remove(1);//quitando el elementro que esta en la posicion 1
        //cambiar el segundo 10 por 15
        lista1.set(2,15);
        System.out.println(lista1);//[5,10]

    }
}
