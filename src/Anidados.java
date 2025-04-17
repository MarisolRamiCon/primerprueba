import java.util.Scanner;

public class Anidados {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        double calificacion;
        double asistencia;
        System.out.println("Ingresa tu calificacion");
        calificacion=entrada.nextDouble();
        System.out.println("Ingresa tu porcentaje de asistencia");
        asistencia= entrada.nextDouble();
        if(calificacion>=7.5){
            if(asistencia>=70){
                System.out.println("Estas aprobado");
            }else{
                System.out.println("Intentalo de nuevo");
            }

        }else{
            System.out.println("Intentalo de nuevo.");
        }

    }
}
