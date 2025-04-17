public class Division {
    public static void main(String[] args) {
        int x=5, z=3;
        double resultado=0.0;
        try{
            resultado=x/z;
        } catch (Exception e) {
            System.out.println("No se puede dividir entre cero");
        }finally{
            System.out.println("Fin del programa");
        }
        System.out.println(resultado);
    }
}
