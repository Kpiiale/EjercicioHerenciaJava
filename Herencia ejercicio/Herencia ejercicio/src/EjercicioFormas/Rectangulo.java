package EjercicioFormas;

public class Rectangulo extends Punto{
    private double ancho;
    private double largo;
    public Rectangulo(double mx, double my, double ancho, double largo) {
        super(mx, my);
        this.ancho = ancho;
        this.largo = largo;
    }

    public double getAncho() {return ancho;}

    public double getLargo() {return largo;}

    public void setAncho(double ancho) {this.ancho = ancho;}

    public void setLargo(double largo) {this.largo = largo;}
    public double calcularPerimetro(){return (2*ancho)+(2*largo);}
    public double calcularArea(){return ancho*largo;}

    public String toString() {
        return "\nAncho='" + ancho + '\'' +
                "\nLargo='" + largo + '\'';
    }
}
