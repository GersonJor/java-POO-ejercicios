
package ejer_5;
import java.util.Scanner;

public class Principal {
    public static double Mayor_valor(Triangulo_Isosceles triagulos[]){
        double area;
        
        area=triagulos[0].obtenerArea();
        for(int i=0;i<triagulos.length;i++){
            if(triagulos[i].obtenerArea()>area){
                area=triagulos[i].obtenerArea();
                
            }
        }
        return area;
    }
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        double lado,base;
        int n;
        
        System.out.println("Ingrese el numero de triangulos que desea colocar: ");
        n=entrada.nextInt();
        
        Triangulo_Isosceles triangulos[]=new Triangulo_Isosceles[n];
        
        for(int i=0;i<triangulos.length;i++){
            System.out.println("\nINGRESE LOS DATOS DEL TRIANGULO N°"+(i+1));
            System.out.println("\nINGRESE LA BASE DEL TRIANGULO: ");
            base=entrada.nextDouble();
            System.out.println("INGRESE EL LADO DEL TRIANGULO: ");
            lado=entrada.nextDouble();
            
            triangulos[i]=new Triangulo_Isosceles(base, lado);
            
            System.out.println("\nEL PERIMETRO DEL TRIANGULO N°"+i+1+" ES: "+triangulos[i].obtenerPerimetro());
            System.out.println("EL AREA DEL TRIANGULO N°"+i+1+" ES: "+triangulos[i].obtenerArea());
        
        }
        
        System.out.println("\nEL AREA DEL TRIANGULO CON MAYOR SUPERFICIE ES: "+Mayor_valor(triangulos));
    }
}
