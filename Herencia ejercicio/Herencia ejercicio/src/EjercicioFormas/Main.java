package EjercicioFormas;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opc;
        do {
            Scanner sc = new Scanner(System.in);
            List<Punto> puntos = new ArrayList<Punto>();
            System.out.println("1. Ingresar puntos para el circulo");
            System.out.println("2. Ingresar puntos rectangulo");
            System.out.println("3. Ingresar puntos triangulo");
            System.out.println("4. Mostrar datos");
            System.out.println("5. Mostrar calculos");
            System.out.println("6. Salir");
            System.out.println("Ingrese una opcion");
            opc = sc.nextInt();

            switch (opc) {
                case 1: {

                }

            }
        }while(opc != 6);
    }

}
