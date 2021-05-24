
package ejer_2;

import java.util.Scanner;
public class Principal {
    public static void main(String [] args){
        Tablero t1;
        int x,y,opcion,incremento=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE EL VALOR INCIAL DE X: ");
        x=entrada.nextInt();
        System.out.println("INGRESE EL VALOR INCIAL DE Y: ");
        y=entrada.nextInt();
        
        t1 = new Tablero(x, y);
        
        
        do{
            System.out.println("\tMENU");
            System.out.println("1.-Mover hacia arriba.");
            System.out.println("2.-Mover hacia abajo.");
            System.out.println("3.-Mover hacia la derecha.");
            System.out.println("4.-Mover hacia la izquierda.");
            System.out.println("5.-Salir");
            System.out.println("PORFAVOR ELEGIR UNA DE LAS OPCIONES MOSTRADAS: ");
            opcion=entrada.nextInt();
            if(opcion!=5){
                System.out.println("ingrese el valor de posicion que desea mover: ");
                incremento=entrada.nextInt();    
            }
            switch(opcion){
                case 1: t1.moverArriba(incremento);break;
                case 2: t1.moverAbajo(incremento); break;
                case 3: t1.moverDerecha(incremento); break;
                case 4: t1.moverIzquierda(incremento); break;
                case 5: break;
                default: System.out.println("ERROR!! DIGITE VALORES DEL 1-5 SEGUN EL MENU MOSTRADO....");
                
            }
            System.out.println("La posicion (X,Y) actual es ("+t1.getX()+")("+t1.getY()+")");
            
        }while(opcion!=5);
        
    }
}
