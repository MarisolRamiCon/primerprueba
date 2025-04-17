package clasesgenericas;

public class Secundaria {
    public static void main(String[] args) {
        Computadora compu= new Computadora("Windows",new MemoriaRam(8,"etc"),
                new Procesador("Intel",2.4),
                new DiscoDuro("Kingston",512,"SDD"));
        compu.mostrarComputadora();

    }
}
