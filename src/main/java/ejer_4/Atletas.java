
package ejer_4;


public class Atletas {
    private int numeroAtleta;
    private String nombre;
    private float tiempoCarrera;

    public Atletas(int numeroAtleta, String nombre, float tiempoCarrera) {
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }

    public float getTiempoCarrera() {
        return tiempoCarrera;
    }
    public String mostrarDatosGanador(){
        return "El atleta nrm"+numeroAtleta+"\nnombre "+nombre+"\nTiempo de Carrera: "+tiempoCarrera;
    }
    
}
