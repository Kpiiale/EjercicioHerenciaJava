package EjercicioFormas;

public class Triangulo extends Punto{

    private double a;
    private double b;
    private double c;
    private double s;

    public Triangulo(double mx, double my, double a, double b, double c, double s) {
        super(mx, my);
        this.a = a;
        this.b = b;
        this.c = c;
        this.s = s;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getS() {
        return s;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double calcularPerimetro() {
        return a + b + c;
    }

    public double calcularSemiperimetro() {
        return calcularPerimetro() / 2;
    }

    public double calcularArea() {
        return Math.sqrt(calcularSemiperimetro() * (calcularSemiperimetro() - a) * (calcularSemiperimetro() - b) * (calcularSemiperimetro() - c));
    }

    @Override
    public String toString() {
        return "\na='" + a + '\'' +
                "\nb='" + b + '\'' +
                "\nc='" + c + '\'' +
                "\ns='" + s + '\'';
    }
}
