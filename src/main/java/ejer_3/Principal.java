
package ejer_3;
import java.util.Scanner;

public class Principal {
    public static int coche_Barato(Vehiculo carros[]){
        float precio;
        int indice =0;
       precio = carros[0].getPrecio();
       for(int i=0;i<carros.length;i++){
           if(carros[i].getPrecio()<precio){
               precio=carros[i].getPrecio();
               indice=i;
           }
       }
       
       return indice;
        
    }
    
    public static void main(String []args){
        Scanner entrada= new Scanner(System.in);
        String marca,modelo;
        float precio;
        int numVeh,cochebarato;
        System.out.println("Ingrese el numero de vehiculos que desea registrar: ");
        numVeh=entrada.nextInt();
        Vehiculo carros[]=new Vehiculo[numVeh];
        
        for(int i=0;i<carros.length;i++){
            entrada.nextLine();
            System.out.println("\nINTRODUZCA LAS CARACTERISTICAS DEL SIGUIENTE AUTO N° "+(i+1)+": ");
            System.out.println("Introduzca la Marca: ");
            marca=entrada.nextLine();
            System.out.println("Introduzca el Modelo: ");
            modelo=entrada.nextLine();
            System.out.println("Introduzca el Precio del vehiculo: ");
            precio=entrada.nextFloat();
            carros[i]= new Vehiculo(marca, modelo, precio);
        }
        cochebarato=coche_Barato(carros);
        System.out.println("EL COCHE MAS BARATO ES: ");
        System.out.println(carros[cochebarato].mostrarDatos());
    }
}
