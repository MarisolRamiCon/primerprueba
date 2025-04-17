package Ciclos;

public class Arreglos {
    public static void main(String[] args) {
        //declaración e inicializacion de un arreglo vacio
        int [] numeros = new int[4];
        //Agregando los elementos
        numeros[0]=8;
        numeros[1]=25;
        //definiendo un for each
        for(int num:numeros){
            System.out.print(num+ " ");
        }
        char [] letras = {'a','b','c'};
        System.out.println("El tamaño de mi arreglo es "+ letras.length);
        letras[0]='f';
        for( char letra:letras){
            System.out.println(letra );
        }


    }
}
