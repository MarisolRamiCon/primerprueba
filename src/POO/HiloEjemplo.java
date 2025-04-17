package POO;

public class HiloEjemplo implements Runnable{
    private String NombreHilo;

    public HiloEjemplo(String nombreHilo) {
        NombreHilo = nombreHilo;
    }

    @Override
    public void run() {
        System.out.println("Iniciando HiloEjemplo "+NombreHilo);
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(NombreHilo + " progreso " + i + ("/5"));
                Thread.sleep(800);
            }
        }catch (InterruptedException e){
            System.out.println(NombreHilo + " fue interrumpido");
        }

        System.out.println("Terminado");

    }
}
