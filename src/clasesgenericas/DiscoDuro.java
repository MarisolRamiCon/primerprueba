package clasesgenericas;

public class DiscoDuro {
    private String marca;
    private Integer capacidad;
    private String tipo;

    public DiscoDuro(String marca, Integer capacidad, String tipo) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
