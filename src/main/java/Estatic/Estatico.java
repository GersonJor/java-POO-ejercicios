
package Estatic;


public class Estatico {
    private static String saludo = "hola";
    
    public static int Sumar(int n1, int n2){
        int sumar=n1+n2;
        return sumar;
    }
    
    public static void main(String args[]){
        System.out.println(Estatico.saludo);
        System.out.println(Estatico.Sumar(2, 5));
    }
}
