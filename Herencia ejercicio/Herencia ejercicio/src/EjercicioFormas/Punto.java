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

    @Override
    public String toString() {
                return "\nX='" + mx + '\'' +
                        "\nY='" + my + '\'';
    }
}

