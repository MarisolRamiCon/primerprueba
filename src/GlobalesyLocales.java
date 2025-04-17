public class GlobalesyLocales {
    static int variableGlobal=5; //variable global
    public static void main(String[] args) {

        for(int i=0; i<10;i++){
            System.out.println(variableGlobal);
            System.out.println(i);
        }
        System.out.println(variableGlobal);
        //System.out.println(i);

    }

    static int suma(){
        int x=3;
        return variableGlobal+x;
    }
}
