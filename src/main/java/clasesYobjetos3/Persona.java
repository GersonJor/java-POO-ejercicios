
package clasesYobjetos3;


public class Persona {
    //atributos
    String nombre;
    int edad;
    
    //metodos
    public Persona(String _nombre, int _edad){
        nombre=_nombre;
        edad=_edad;
        
        
    }
    public void motrar_resul(){
        System.out.println("SU NOMBRE ES: "+nombre);
        System.out.println("SU EDAD ES: "+edad);
    }
}
