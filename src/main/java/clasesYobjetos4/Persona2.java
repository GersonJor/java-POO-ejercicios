
package clasesYobjetos4;

public class Persona2 {
    //atributos
    String nombre;
    int edad;
    String dni;
    //sobrecarga de metodos

    public Persona2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona2(String dni) {
        this.dni = dni;
    }
    
    public void mostrarResul(int km){
        System.out.println("El usuario "+nombre+" con la edad "+edad+" recorrio un total de "+km+" KM");
    }
    public void mostrarResul(){
        System.out.println("Su nombre es: "+nombre+" y su DNI es: "+dni);
    }
    
}
