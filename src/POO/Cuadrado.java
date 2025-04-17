package POO;

public class Cuadrado extends Figura{
    private Double lado;

    public Cuadrado(String nombre, Double lado) {
        super(nombre);
        this.lado = lado;
    }

    @Override
    public Double calcularArea() {
        return lado * lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
}
