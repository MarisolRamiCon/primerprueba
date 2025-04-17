import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String pais;
        System.out.println("Ingresa tu pais");
        pais= entrada.nextLine();
        String res=(pais=="Canada")?("Eres canadiense"):("No eres canadiense");
        System.out.println(res);

    }
}
