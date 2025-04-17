package POO;

public abstract class Figura {
    //Atributo comun a todas las figuras
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }
    // Cuando una clase es abstracta al menos uno de sus metodos debe serlo tambien
    public abstract Double calcularArea();

    //Metodos concretos que son los que conocemos y son comunes a todas las figuras
    public String mostrarNombre(){
        return "El nombre de la figura es : "+ nombre;
    }
}
