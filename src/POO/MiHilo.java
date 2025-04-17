package POO;

public class MiHilo extends Thread {
    private String nombreHilo;
    public MiHilo(String nombre){
        this.nombreHilo=nombre;
    }

    @Override
    public void run() {
        System.out.println("Iniciando hilo "+ nombreHilo);
        for(int i=1;i<=5; i++){
            System.out.println("Ejecutando " +nombreHilo + " iteracion"+i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(nombreHilo + " fue interrumpido");

            }
        }
    }
}
