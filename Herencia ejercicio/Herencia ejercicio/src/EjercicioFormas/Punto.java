package EjercicioFormas;

import java.util.Scanner;


public class Punto {
    private double mx;
    private double my;

    // Constructor
    public Punto(double mx, double my) {
        this.mx = mx;
        this.my = my;
    }
    public double getMx() { return mx;}
    public double getMy() {return my;}
    
    public double calcularPerimetro(){return 0; }
    public double calcularArea(){ return 0; }

    @Override
    public String toString() {
                return "\nX='" + mx + '\'' +
                        "\nY='" + my + '\'';
    }
}
