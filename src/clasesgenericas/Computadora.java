package clasesgenericas;
//Esta seria la clase compuesta
public class Computadora {
    private String SO;
    private MemoriaRam ram;
    private Procesador procesador;
    private DiscoDuro dd;

    public Computadora(String SO, MemoriaRam ram, Procesador procesador, DiscoDuro dd) {
        this.SO = SO;
        this.ram = ram;
        this.procesador = procesador;
        this.dd = dd;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public MemoriaRam getRam() {
        return ram;
    }

    public void setRam(MemoriaRam ram) {
        this.ram = ram;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public DiscoDuro getDd() {
        return dd;
    }

    public void setDd(DiscoDuro dd) {
        this.dd = dd;
    }

    public void mostrarComputadora(){
        System.out.println("Sistema operativo "+ getSO()+"\n"+
        "Memoria RAM: "+getRam().getCapacidad() +" Gb"+ "\n"+
                "Procesador "+ getProcesador().getVelocidad() +" Mhz \n"+
                "Disco duro de marca "+ getDd().getMarca());
    }
}
