
package ejer_8;
import java.util.Scanner;

public class Principal {
    public static int buscarPaquete(Paquete t[],int numeroPaquete, int contadorPaquete){
        int indice=0;
        boolean encontrado= false;
        for(int i=0;i<contadorPaquete;i++){
            if(t[i].getNumeroPaquete() == numeroPaquete){
                encontrado=true;
                indice = i;
            }
            
        }
        
        if(encontrado==false){
            indice=-1;
        }
        
        return indice;
    }
    public static int buscarSucursal(Sucursal t[],int numeroSucursal, int contadorSucursal){
        int indice=0;
        boolean encontrado= false;
        for(int i=0;i<contadorSucursal;i++){
            if(t[i].getNumeroSucursal()== numeroSucursal){
                encontrado=true;
                indice = i;
            }
            
        }
        
        if(encontrado==false){
            indice=-1;
        }
        
        return indice;
    }
 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroSurcursal,numeroPaquete,prioridad,opcion;
        int contadorSucursal=0,contadorPaquete=0,indiceSucursal,indicePaquete;
        String dirreccion, ciudad,dni;
        double peso,precioPaquete;
        
        Sucursal surcusal[]= new Sucursal[100];
        Paquete paquete[]= new Paquete[50];
        
        do{
            System.out.println("\nMENU");
            System.out.println("1.- Crear una nueva sucursal");
            System.out.println("2.- Enviar paquete");
            System.out.println("3.- Consultado sucursal");
            System.out.println("4.- Consultar paquete");
            System.out.println("5.- Mostrar todas las sucursales");
            System.out.println("6.- Mostrar todos los paquetes");
            System.out.println("7.- Salir");
            System.out.println("Digite una opcion del Menu mostrado: ");
            opcion=entrada.nextInt();
            switch(opcion){
                case 1 : System.out.println("\nDigite el numero de sucursal: ");
                        numeroSurcursal = entrada.nextInt();
                        System.out.println("Digite la direccion: ");
                        
                        dirreccion=entrada.nextLine();
                        entrada.nextLine();
                        System.out.println("Digite la ciudad: ");
                        ciudad=entrada.nextLine();
                        
                        surcusal[contadorSucursal]=new Sucursal(numeroSurcursal, dirreccion, ciudad);
                        contadorSucursal++;
                        break;
                        
                case 2: System.out.println("INGRESE EL NUMERO DE SUCURSAL: ");
                        numeroSurcursal= entrada.nextInt();
                        indiceSucursal= buscarSucursal(surcusal, numeroSurcursal, contadorSucursal);
                        
                        if(indiceSucursal == -1){
                            System.out.println("El numero de sucursal que usted ingreso no existe...");
                            
                        }else{
                            System.out.println("Digite el numero de paquete: ");
                            numeroPaquete=entrada.nextInt();
                            System.out.println("Digite el DNI de la persona: ");
                            dni=entrada.nextLine();
                            entrada.nextLine();
                            System.out.println("Digite el peso del paquete: ");
                            peso=entrada.nextDouble();
                            System.out.println("Digite la prioridad del paquete\n0=normal\n1=alta\n2=express ");
                            prioridad=entrada.nextInt();
                            while(prioridad > 2 || prioridad <0){
                                System.out.println("ERROR!!....\nPorfavor ingrese los numero que se muestran en el menú:\n0=normal\n1=alta\n2=express");
                                prioridad=entrada.nextInt();
                            }
                            paquete[contadorPaquete]= new Paquete(numeroPaquete, dni, peso, prioridad);
                            precioPaquete=surcusal[indiceSucursal].calcular_precio(paquete[contadorPaquete]);
                            
                            System.out.println("\nEl precio del paquete es: $"+precioPaquete);
                            contadorPaquete++;
                                          
                        }
                        break;
                case 3: System.out.println("\nDigite el numero de sucursal a consultar: ");
                        numeroSurcursal=entrada.nextInt();
                        
                        indiceSucursal=buscarSucursal(surcusal, numeroSurcursal, contadorSucursal);
                        
                        if(indiceSucursal== -1){
                            System.out.println("LA SUCURSAL QUE USTED DIGITO NO EXISTE....");
                        }
                        else{
                            System.out.println("\nLos datos de la sucursal son: ");
                            System.out.println(surcusal[indiceSucursal].mostrarDatosSurcursal());
                            
                        }
                        break;
                        
                case 4: System.out.println("\nDigite el numero de paquete a consultar: ");
                        numeroPaquete=entrada.nextInt();
                        
                        indicePaquete=buscarPaquete(paquete, numeroPaquete, contadorPaquete);
                        
                        if(indicePaquete == -1){
                            System.out.println("El paquete que usted digito no existe....");
                            
                        }
                        else{
                            System.out.println("\nLos datos del paquete son: ");
                            System.out.println(paquete[indicePaquete].mostrarDatosPaquete());
                        }
                        break;
                        
                case 5: 
                        for(int i=0;i<contadorSucursal;i++){
                            System.out.println("Los de datos de la surcursal nrm "+i+" es: ");
                            System.out.println(surcusal[i].mostrarDatosSurcursal());
                        }
                        break;
                        
                case 6:
                        for(int i=0;i<contadorPaquete;i++){
                            System.out.println("Los datos del paquete nrm "+i+" es: ");
                            System.out.println(paquete[i].mostrarDatosPaquete());
                        }
                        break;
            
                case 7: break;
                
                default: System.out.println("ERROR!!!, USTED INGRESO UNA OPCION QUE NO PERTENECE AL MENU ");
                break;
            }
            
            System.out.println(" ");
            
            
            
            
            
        }while(opcion!=7);
        
    }
}
    

