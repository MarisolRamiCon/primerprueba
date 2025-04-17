package POO;

public class Tercero {
    public static void main(String[] args) {
        //Creando mis procesos
        HiloEjemplo miHilo= new HiloEjemplo("Descargar archivos");
        HiloEjemplo miHilo1= new HiloEjemplo("Procesar datos");
        //iniciar hilos para pasarle los procesos
        Thread hilo1= new Thread(miHilo);
        Thread hilo2= new Thread(miHilo1);
        hilo1.start();
        hilo2.start();
        try{
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Proceso finalizado");
    }
}
