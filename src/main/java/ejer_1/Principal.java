
package ejer_1;

import javax.swing.JOptionPane;


public class Principal {
    public static void main(String []args){
        Cuadrilatero n ;
        float l1,l2;
        
        l1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor del lado 1:"));
        l2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor del lado2 "));
        
        if(l1==l2){
            n= new Cuadrilatero(l1);
        }
        else{
            n= new Cuadrilatero(l1, l2);
        }
        
        System.out.println("El perimetro es: "+n.getPerimetro());
        System.out.println("El area es: "+n.gerArea());
    }
}
