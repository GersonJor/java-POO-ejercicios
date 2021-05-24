
package clasesYobjetos2;

import javax.swing.JOptionPane;

public class Main2 {
    public static void main(String[] args){
        Operaciones2 op = new Operaciones2();
        int n2;
        int n1=Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NUMERO: "));
        n2= Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL SEGUNDO NUMERO: "));
        
        System.out.println("La suma es:"+ op.sumar(n1, n2));
        System.out.println("La division es: "+op.division(n1, n2) );
        System.out.println("La multiplicacion eop.division(n1, n2);s: "+op.multiplicar(n1, n2) );
        System.out.println("La resta es: "+op.restar(n1, n2) );
        
    }
}
