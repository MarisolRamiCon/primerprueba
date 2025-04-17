import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        Queue<String> cadenas= new PriorityQueue<>(); //primero en entrar es el primero en salir
        cadenas.add("Mariposa");
        cadenas.offer("Oruga");
        cadenas.add("Elefante");
        cadenas.add("araña");
        System.out.println(cadenas);
        cadenas.poll(); // Mariposa
        System.out.println("el elemento siguiente es "+ cadenas.element());
        cadenas.poll(); // Oruga
        cadenas.poll(); //Elefante
        cadenas.poll(); //araña
        System.out.println(cadenas.poll()); //nos regresa un null
        // al inicio se puede añadir un dato
        System.out.println(cadenas.peek());

    }
}
