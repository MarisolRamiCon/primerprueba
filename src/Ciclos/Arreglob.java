package Ciclos;

public class Arreglob {
    public static void main(String[] args) {
        int [][] numeros={{6,7,5},{3,8,4},{1,0,2},{9,5,2}};
        numeros[1][1]=10;
        for(int fila=0; fila<numeros.length; fila++){
            for(int col=0; col<numeros[fila].length; col++ ) {
                System.out.print(numeros[fila][col]+ " ");
            }
            System.out.println(" ");
        }
    }
}
