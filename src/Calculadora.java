import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        //esta parte es en donde voy a invocar a mis metodos y a mis funciones
        // esta es una forma
        /*List<Integer> numeros= new ArrayList<>();
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingresa cuantos numeros sumarás");
        int cuanto=entrada.nextInt();
        while(cuanto>0){
            System.out.println("Ingresa el numero");
            int num= entrada.nextInt();
            numeros.add(num);
            cuanto=cuanto-1;
        }
        double s=suma(numeros);
        System.out.println(s);*/
        double s=suma(2.0,5.0,6.0,7.0,8.0);
        System.out.println(s);
        //double n1, n2;
        //System.out.println("Ingresa un numero 1");
        //n1= entrada.nextDouble();
        //System.out.println("Ingresa un número 2");
        //n2= entrada.nextDouble();
        //invocar a la funcion
        //suma(n1,n2);
        //Crear un objeto de Calculadora o instanciar la clase Calculadora
        Calculadora calc= new Calculadora();
        //calc.resta(n1,n2);
    }
    //declaracion de una función
    static double suma(double... numeros){
        double s=0;
        for(double num:numeros){
            s=s+num;//s+=num
        }
        return s;
    }

    //Creando un metodo
    public double resta(double num1, double num2){
        return num1- num2;
    }
}
