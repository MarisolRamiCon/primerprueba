import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int opcion;
        do{
            System.out.println("Escoge la opción");
            System.out.println("1. Libros");
            System.out.println("2. Peliculas");
            System.out.println("3. Series");

            Scanner op= new Scanner(System.in);
            opcion=op.nextInt();
            //Cuando usamos switch los tipos de datos son int o char
            switch (opcion){
                case 1:
                    System.out.println("Escribe tu libro favorito");
                    op.nextLine();
                    String libro;
                    libro=op.nextLine();
                    System.out.println("Tu libro favorito es: "+libro);
                    break;
                case 2:
                    System.out.println("Escribe tu pelicula favorito");
                    op.nextLine();
                    String pelicula;
                    pelicula=op.nextLine();
                    System.out.println("Tu pelicula favorita es: "+pelicula);
                    break;
                case 3:
                    System.out.println("Escribe tu serie favorita");
                    op.nextLine();
                    String serie;
                    serie=op.nextLine();
                    System.out.println("Tu serie favorita es: "+serie);
                    break;
                case 0:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Esa no es una opción");
                    break;
            }
        }while(opcion!=0);

    }
}
