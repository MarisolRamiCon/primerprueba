package POO;

public class Operaciones {
    public static void main(String[] args) {
        int x=24;
        int z=30;
        Calculadora calc= new Calculadora();
        int res=calc.sumar(x,z);
        System.out.println(res);
        double w=35.6, y=89.4;
        double s= calc.sumar(w,y);
        System.out.println(s);
        calc.sumar();
    }
}
