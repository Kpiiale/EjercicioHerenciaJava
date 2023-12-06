package EjercicioFormas;

public class Circulo extends Punto{
    private double radio;
    public Circulo(double mx, double my, double radio){ super(mx, my); this.radio = radio;}

    public double getRadio() {return radio;}

    public void setRadio(double radio) {this.radio = radio;}

    public double calcularPerimetro(){ return 2* Math.PI*radio;}
    public double calcularArea(){return Math.PI*(Math.pow(2, radio));}
    @Override
    public String toString() {
        return "\nradio='" + radio + '\'' ;
    }
}
