import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner dato= new Scanner(System.in);
        System.out.println("Escribe tu primer calificación");
        int cal1=dato.nextInt();
        System.out.println("Escribe tu segunda calificación");
        int cal2=dato.nextInt();
        System.out.println("Escribe tu tercera calificación");
        int cal3=dato.nextInt();

        double promedio;
        promedio=(cal1+cal2+cal3)/3;
        System.out.println(promedio);
    }
}
