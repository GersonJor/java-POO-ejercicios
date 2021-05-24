
package ejer_7;
import java.util.Scanner;

public class Principal {
    public static int buscarNumeroCuenta(Cuenta cuentas[],int n){
        int i=0,indice=0;
        boolean encontrado=false;
        
        //busqueda secuencial
        while((i<cuentas.length )&& encontrado==false ){
            if(cuentas[i].getNumeroCuenta()==n){
                encontrado=true;
                indice=i;
            }
            i++;
        }
        if(encontrado==false){
           indice =-1; 
        }
        return indice;
    }

    public static void main(String [] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre,apellido,dni;
        int numeroCuenta,nCuenta,opcion,indiceCuenta;
        Cliente cliente;
        Cuenta cuentas[];
        double saldo,cantidad;
       
        System.out.println("Digite el nombre del cliente: ");
        nombre=entrada.nextLine();
        
        System.out.println("Digite el apellido del cliente: ");
        apellido=entrada.nextLine();
        System.out.println("Digite el DNI del cliente: ");
        dni=entrada.nextLine();
        
        System.out.println("Ahora digite las cuentas que banco tiene en el banco: ");
        nCuenta=entrada.nextInt();
        
        cuentas = new Cuenta[nCuenta];
        
        for(int i=0;i<cuentas.length;i++){
            System.out.println("\nDigite los datos para la cuenta N°"+(i+1)+": ");
            System.out.println("Digite el numero de cuenta: ");
            numeroCuenta=entrada.nextInt();
            System.out.println("Digite el saldo de la cuenta: ");
            saldo=entrada.nextDouble();
            
            cuentas[i]= new Cuenta(numeroCuenta, saldo);
            
        }
        cliente= new Cliente(nombre, apellido, dni, cuentas);
        
        do{
            System.out.println("\t.:MENU:.");
            System.out.println("1.- INGRESAR DINERO EN LA CUENTA");
            System.out.println("2.- RETIRAR DINERO DE LA CUENTA");
            System.out.println("3.- CONSULTAR SALDO DE LA CUENTA");
            System.out.println("4.- SALIR.....");
            opcion=entrada.nextInt();
            
            switch(opcion){
                case 1: System.out.println("\n Digite el numero de cuenta: ");
                        numeroCuenta= entrada.nextInt();
                        indiceCuenta=buscarNumeroCuenta(cuentas, numeroCuenta);
                        
                        if(indiceCuenta==-1){
                            System.out.println("El numero de cuenta no ingresado no EXISTE...");
                        }
                        else{
                            System.out.println("\nDigite la cantidad de dinero que desea ingresar a la cuenta: ");
                            cantidad=entrada.nextDouble();
                            cliente.ingresar_dinero(indiceCuenta, cantidad);
                            System.out.println("\nINGRESO REALIZADO CORRECTAMENTE");
                            System.out.println("SALDO DISPONIBLE: "+cliente.cosultar_saldo(indiceCuenta));
                            
                        }
                        break;
                case 2: System.out.println("\nDigite el numero de cuenta: ");
                        numeroCuenta=entrada.nextInt();
                        indiceCuenta=buscarNumeroCuenta(cuentas, numeroCuenta);
                        
                        if(indiceCuenta==-1){
                            System.out.println("El numero de cuento no ingresado no EXISTE....");
                            
                        }
                        else{
                            System.out.println("\nDigite la cantidad de dinero que desea RETIRAR de la cuenta:");
                            cantidad=entrada.nextDouble();
                            if(cantidad>cliente.cosultar_saldo(indiceCuenta)){
                                System.out.println("ERROR EL SALDO ES INSUFICIENTE....");
                                
                            }
                            else{
                                cliente.retirar_dinero(indiceCuenta, cantidad);
                                System.out.println("\nRETIRO REALIZADO CORRECTAMENTE....");
                                System.out.println("SALDO DISPONIBLE: "+cliente.cosultar_saldo(indiceCuenta));
                            }
                        }
                        break;
                case 3:System.out.println("\nDigite el numero de cuenta: ");
                       numeroCuenta=entrada.nextInt();
                       indiceCuenta=buscarNumeroCuenta(cuentas, numeroCuenta);
                        
                       if(indiceCuenta==-1){
                          System.out.println("El numero de cuento no ingresado no EXISTE....");
                            
                       }
                       else{
                           System.out.println("SALDO DISPONIBLE DE LA CUENTA N°"+numeroCuenta+" es: "+cliente.cosultar_saldo(indiceCuenta));
                       }
                       break;
                case 4:break;
                default:System.out.println("ERRROR LA OPCION QUE INGRESO NO EXISTE EN EL MENÚ....");
                    
                            
            }
            
        }while(opcion !=4);
    }
    
}
