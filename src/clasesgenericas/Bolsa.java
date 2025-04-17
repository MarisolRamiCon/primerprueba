package clasesgenericas;

import java.util.ArrayList;

public class Bolsa <T>{
    private ArrayList<T> lista= new ArrayList<>();
    public void add(T objeto){
        lista.add(objeto);
    }
    public ArrayList<T> getProductos(){
        return lista;
    }
}
