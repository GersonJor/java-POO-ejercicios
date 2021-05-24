
package getters_Y_setters;


public class Clase1 {
    private int edad;
    private String nombre;
    
    //Metodo setter: Establecemos la edad
    public void setEdad(int edad){
        this.edad=edad;
    }
    //Metodo getter: Obtenemos la edad
    public int getEdad(){
        return edad;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
}
