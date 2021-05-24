
package ejer_5;

public class Triangulo_Isosceles {
    private double base;
    private double lado;

    public Triangulo_Isosceles(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }
    
    public double obtenerPerimetro(){
        double perimetro = 2*base+lado;
        return perimetro;
    }
    public double obtenerArea(){
        double area = (base*(Math.sqrt((lado*lado)-((base*base)/4))))/2;
        return area;
    }
}
