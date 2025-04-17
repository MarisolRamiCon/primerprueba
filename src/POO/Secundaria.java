package POO;

public class Secundaria {
    public static void main(String[] args) {
        Cuadrado cuadro= new Cuadrado("Cuadrado",5.0);
        double area=cuadro.calcularArea();
        System.out.println(area);

        Tortuga mitortuga= new Tortuga();
        mitortuga.caminar();
        mitortuga.nadar();

    }
}
