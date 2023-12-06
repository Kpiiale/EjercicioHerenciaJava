package Cascada;

public class ClaseA {
    private String nombre;
    private int edad;
    public ClaseA(String nombre, int edad){
        this.nombre= nombre;
        this.edad = edad;
        System.out.println("Constructor clase A");
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int setEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
