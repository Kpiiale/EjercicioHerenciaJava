package herenciapersna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<Persona> personas = new ArrayList<Persona>();
        Scanner sc = new Scanner(System.in);
        int opc;
        do{
            System.out.println("1. Ingrese alumno de pregrado");
            System.out.println("2. Ingrese alumno de postgrado");
            System.out.println("3. Ingrese profesor por horas");
            System.out.println("4. Mostrar todas las personas de la institcion");
            System.out.println("5. Mostrar alumno de pregrado");
            System.out.println("6. Mostrar alumno de postgrado");
            System.out.println("7. Mostrar por horas");
            System.out.println("8. Salir");
            System.out.println("Ingresar opcion: ");
            opc = sc.nextInt();
            switch (opc){
                case 1:{
                    ingresarAlumnoPregrado((ArrayList<Persona>) personas);

                }break;
                case 2:{
                    ingresarAlumnoPostgrado((ArrayList<Persona>) personas);
                }break;
                case 3: {
                    ingresarProfesor((ArrayList<Persona>) personas);
                }

                case 4: {
                    imprimirpersona((ArrayList<Persona>) personas);
                }break;
            }
        }while(opc !=8 );
    }
    public static void imprimirpersona(ArrayList<Persona> lista){
        Iterator<Persona> it = lista.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
    public static void ingresarAlumnoPregrado(ArrayList<Persona> lista){
       String cedula, nombre, carrera, universidad;
       Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cedula");
        cedula = sc.next();
        System.out.println("Ingrese nombre");
        nombre = sc.next();
        System.out.println("Ingrese la universidad");
        universidad = sc.next();
        System.out.println("Ingrese carrera");
        carrera = sc.next();
        lista.add(new AlumnoPregrado(nombre, cedula, universidad, carrera));
    }
    public static void ingresarAlumnoPostgrado(ArrayList<Persona> lista){
        String cedula, nombre, tesis, universidad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cedula");
        cedula = sc.next();
        System.out.println("Ingrese nombre");
        nombre = sc.next();
        System.out.println("Ingrese la universidad");
        universidad = sc.next();
        System.out.println("Realizo´la tesis?");
        tesis = sc.next();
        lista.add(new AlumnoMagister(nombre, cedula, universidad, tesis));
    }
    public static void ingresarProfesor(ArrayList<Persona> lista){
        String cedula, nombre, especialidad;
                int hora;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cedula");
        cedula = sc.next();
        System.out.println("Ingrese nombre");
        nombre = sc.next();
        System.out.println("Ingrese la especialidad");
        especialidad = sc.next();
        System.out.println("Ingrese la hora");
        hora = sc.nextInt();
        lista.add(new ProfesorHora(nombre, cedula, especialidad, hora));
    }
}
