import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Conjuntos {
    public static void main(String[] args) {
        Set<Integer> conjunto1 = new HashSet<>();
        conjunto1.add(50);
        conjunto1.add(25);
        conjunto1.add(25);
        System.out.println(conjunto1);
        conjunto1.remove(25);
        System.out.println(conjunto1);
        System.out.println(conjunto1.size());
        conjunto1.remove(50);
        if(conjunto1.isEmpty()){
            System.out.println("El conjunto esta vacio");
        }
    }
}
