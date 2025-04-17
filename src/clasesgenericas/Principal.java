package clasesgenericas;

public class Principal {
    public static void main(String[] args) {
        Bolsa<Chocolate> bolsaDeChocolates= new Bolsa<>();
        bolsaDeChocolates.add(new Chocolate("Chocolate_1", "blanco"));
        bolsaDeChocolates.add(new Chocolate("Chocolate_2","negro"));
        System.out.println(bolsaDeChocolates.getProductos().stream().map(choco->
                "nombre: "+choco.getNombre() + " sabor: "+ choco.getSabor()
        ).toList());
        Bolsa<Soda> bolsaDeSoda= new Bolsa<>();
        bolsaDeSoda.add(new Soda("Soda_1","limon"));
        bolsaDeSoda.add(new Soda("Soda_1","fresa"));
        System.out.println(bolsaDeSoda.getProductos().stream().map(soda ->
                "nombre: "+ soda.getNombre() + " sabor: "+ soda.getSabor()
        ).toList());
    }
}
