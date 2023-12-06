package herenciapersna;

public class ProfesorHora extends Profesor{
    private int hora;
    public ProfesorHora(String nombre, String cedula, String especialidad, int hora){
        super(nombre, cedula, especialidad);
        this.hora = hora;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nhora='" + getHora() +'\'' +
                ' ';
    }
}