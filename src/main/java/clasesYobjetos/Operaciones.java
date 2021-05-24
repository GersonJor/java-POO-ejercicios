
package clasesYobjetos;

import javax.swing.JOptionPane;


public class Operaciones {
    //atributos
    int suma;
    int multiplicar;
    double dividir;
    int restar;
    int num1;
    int num2;
    
    //metodos
    
    public void Perdir_numeros(){
        num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de su primer numero: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del segundo numero: "));
        
    }
    public void sumar(){
        suma=num1+num2;
    }
    public void resta(){
        restar=num1-num2;
    }
    public void multiplipacion(){
        multiplicar=num1*num2;
    }
    public void division(){
        dividir=num1/num2;
    }
    public void imprimir_resultado(){
        System.out.println("La suma de los 2 numeros ingresados es: "+suma);
        System.out.println("La resta de los 2 numeros ingresados es: "+restar);
        System.out.println("La multiplicacion de los 2 numeros ingresados es: "+multiplicar);
        System.out.println("La division de los 2 numeros ingresados es:"+dividir);
    }
}
