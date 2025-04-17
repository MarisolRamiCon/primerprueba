package POO;

public class Perro extends Animal {
    //atributos
    private String nombre;
    private Integer edad;
    private String sexo;
    private String raza;
    //metodo constructor va a inicializar los atributos.

    public Perro(){

    }
    public Perro(String nombre, Integer edad, String sexo, String raza){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.raza=raza;
    }
    //métodos propios de la clase


    @Override
    public void emitirSonido() {
        System.out.println("El perro ladra muy fuerte");
    }

    @Override
    public void comer() {
        System.out.println("El perro come croquetas");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
