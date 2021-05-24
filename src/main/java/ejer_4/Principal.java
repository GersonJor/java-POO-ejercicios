
package ejer_4;
import java.util.Scanner;
public class Principal {
    public static int indiceGanador(Atletas totalAtletas[]){
        float tiempoCarrera;
        int indice=0;
        tiempoCarrera=totalAtletas[0].getTiempoCarrera();
        
        for(int i=0;i<totalAtletas.length;i++){
            if(totalAtletas[i].getTiempoCarrera()<tiempoCarrera){
                tiempoCarrera=totalAtletas[i].getTiempoCarrera();
                indice=i;
            }
        }
        return indice;
    }
    
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int numeroAtleta,numtotal,atletaGanador;
        String nombre;
        float tiempoCarrera;
        
        System.out.println("INGRESE EL NUMERO DE ATLETAS QUE DESEA REGISTRAR: ");
        numtotal=entrada.nextInt();
        
        Atletas totalAtleta[]=new Atletas[numtotal];
        
        for(int i=0;i<totalAtleta.length;i++){
            System.out.println("INGRESE LOS SIGUIENTES DATOS DEL ATLETA ["+(i+1)+"] :");
            System.out.println("INGRESE EL NUMERO DEL ATLETA: ");
            numeroAtleta=entrada.nextInt();
            entrada.nextLine();
            System.out.println("INGRESE EL NOMBRE DEL ATLETA: ");
            nombre=entrada.nextLine();
            System.out.println("INGRESE EL TIEMPO DE CARRERA DEL ATLETA: ");
            tiempoCarrera=entrada.nextFloat();
            
            totalAtleta[i]= new Atletas(numeroAtleta, nombre, tiempoCarrera);
            
        }
        atletaGanador=indiceGanador(totalAtleta);
        System.out.println("\nEl atleta ganador es: ");
        System.out.println(totalAtleta[atletaGanador].mostrarDatosGanador());
        
    }
}
