import java.util.ArrayList;
import java.util.List;

public class LambdayStream {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(50);
        numeros.add(35);
        numeros.add(22);
        numeros.add(9);
        System.out.println(numeros);
        List<Integer> filtrado= numeros.stream().filter( num-> num>24).toList();
        System.out.println(filtrado);
        List<Integer> doble= numeros.stream().map(mult -> mult*2).toList();
        System.out.println(doble);//[100,70,44,18]
        int suma= numeros.stream().reduce(0,(acumulador,num)->
            acumulador+num);
        System.out.println(suma);

    }
}
