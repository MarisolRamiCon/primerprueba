package Ciclos;

import java.util.Scanner;

public class Ab {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int[][] ventas = new int[3][5];
        //Estos for anidado son para llenarlo
        for(int filas=0;filas<=2;filas++){
            for(int col=0; col<=4; col++){
                System.out.println("Ingresa un numero");
                ventas[filas][col]= entrada.nextInt();
            }
        }
        //imprimir el arreglo bidimensional
        for(int filas=0;filas<=2;filas++){
            for(int col=0; col<=4; col++){
                System.out.print(ventas[filas][col]+ " ");
            }
            System.out.println(" ");
        }

    }
}
