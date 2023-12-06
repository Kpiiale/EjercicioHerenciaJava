package Cascada;

public class ClaseB extends ClaseA {
    private int valor;
    public ClaseB(){
        super("N/A",0);
        valor = 0;
        System.out.println("Constructor clase B");
    }
    public void MostrarDatos(){
        System.out.println("nombre "+getNombre());
        System.out.println("edad "+getEdad());
        System.out.println("valor "+valor);
    }

}


