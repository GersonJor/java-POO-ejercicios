
package Herencia;

public class Estudiante extends Persona {
    private int codigoEstudiante;
    private float notaFinal;
    
    public Estudiante(String nombre,String apellidos, int edad, int codigoEstudiante, float notaFinal){
        super(nombre,apellidos,edad);
        this.codigoEstudiante=codigoEstudiante;
        this.notaFinal=notaFinal;
        
    }
    
    public void mostrarDatos(){
        System.out.println("\nNombre: "+getNombre()
                            +"\nApellidos: "+getApellidos()
                            +"\nEdad: "+getEdad()
                            +"\nCodigo de estudiante: "+codigoEstudiante
                            +"\nNota final: "+notaFinal);
    }
}
