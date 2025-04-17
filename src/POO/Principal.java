package POO;

public class Principal {
    public static void main(String[] args) {
        //Instanciando la clase Perro
        Perro perro= new Perro("bombon",4,"macho","mestizo");
        System.out.println("El nombre del perro es "+ perro.getNombre());
        Perro miperro= new Perro();
        miperro.setNombre("Chispas");
        miperro.setEdad(2);
        miperro.setSexo("hembra");
        miperro.setRaza("mestizo");
        System.out.println(
                "nombre: "+ miperro.getNombre() +"\n"+
                "edad: "+ miperro.getEdad() +"\n"+
                        "sexo: "+ miperro.getSexo() +"\n"+
                        "raza: "+ miperro.getRaza() +"\n"
        );
        miperro.comer();
        miperro.emitirSonido();


    }
}
