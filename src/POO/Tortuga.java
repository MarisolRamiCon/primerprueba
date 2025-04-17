package POO;

public class Tortuga implements Terrestre,Acuatico{

    @Override
    public void nadar() {
        System.out.println("la tortuga nada");
    }

    @Override
    public void caminar() {
        System.out.println("La tortuga camina también");

    }

}
