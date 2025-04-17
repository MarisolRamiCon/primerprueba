package POO;

public class ContadorHilos {
    public static void main(String[] args) {
        //Crear dos hilos que cuentan simultaneamente
        new Thread(
                ()->{
                    for(int i=1;i<=10; i++){
                        System.out.println("Hilo 1: "+i);
                        try{
                            Thread.sleep(500);
                        }catch (Exception e){

                        }
                    }
                }).start();
        new Thread(
                ()->{
                    for(int i=1;i<=5; i++) {
                        System.out.println("Hilo 2: " + i);
                        try {
                            Thread.sleep(200);
                        } catch (Exception e) {

                        }
                    }
                }).start();

    }
}
