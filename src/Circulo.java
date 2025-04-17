public class Circulo {
    //Atributos
    int x,y,radio;
    //Metodo constructor
    public Circulo(int x, int y, int radio){
        this.x=x;
        this.y= y;
        this.radio= radio;
    }

    public static void main(String[] args) {
        //Instanciar una clase
        Circulo circulito= new Circulo(2,4,8);
        System.out.println("el radio del circulo es "+ circulito.radio);
    }
}
