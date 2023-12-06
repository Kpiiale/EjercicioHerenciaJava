package herenciapersna;

public class Persona {
    private String cedula;
    private String nombre;
    public Persona(String nombre, String cedula){
        this.nombre=nombre;
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
