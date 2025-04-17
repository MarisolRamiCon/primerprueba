package Ciclos;

import java.util.Scanner;

public class Tablas {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int tabla;
        System.out.println("Que tabla quieres");
        tabla= entrada.nextInt();
        for(int contador=1;contador<=10;contador++){
            int res= tabla*contador;
            System.out.println(tabla+" x "+contador+" = "+res);
        }
    }
}
