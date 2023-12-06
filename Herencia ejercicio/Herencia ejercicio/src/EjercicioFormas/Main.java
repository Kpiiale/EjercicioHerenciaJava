package EjercicioFormas;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
            
    public static void main(String[] args) {
        List<Punto> puntos = new ArrayList<Punto>();        
            int opc;
        do {
            Scanner sc = new Scanner(System.in);
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
                    ingresarCirculo((ArrayList<Punto>)puntos);

                }break; 
                case 2:{
                    ingresarRectangulo((ArrayList<Punto>)puntos);
                }break; 
                case 3: {
                    ingresarTriangulo((ArrayList<Punto>)puntos);
                }break; 
                case 4:{
                    imprimirDatos((ArrayList<Punto>)puntos);
                }break; 
                case 5:{
                    
                   mostrarCalculos((ArrayList<Punto>)puntos); 
                }break; 
                case 6:{
                    System.out.println("Gracias"); 
                }break; 
        
                }

            }while(opc != 6);
        }

        public static void ingresarCirculo(ArrayList<Punto> puntos){
        double mx, my , radio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese x");
        mx = sc.nextInt();
        System.out.println("Ingrese y");
        my = sc.nextInt();
        radio = Math.sqrt(mx * mx + my * my); 
    }
    public static void ingresarRectangulo(ArrayList<Punto> puntos){
        double mx, my , base, altura;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la altura");
        altura = sc.nextInt();
        System.out.println("Ingrese la base");
        base = sc.nextInt();
    } 
    public static void ingresarTriangulo(ArrayList<Punto> puntos){
        double mx, my, a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese lado a");
        a = sc.nextInt();
        System.out.println("Ingrese lado b");
        b = sc.nextInt();
        System.out.println("Ingrese lado c");
        c = sc.nextInt();
    } 
     public static void imprimirDatos(ArrayList<Punto> puntos){
        Iterator<Punto> it = lista.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

        public static void mostrarCalculos(ArrayList<Punto> puntos){
            for(Punto p: puntos){
                System.out.println("Area:" + p.calcularArea); 
                System.out.pritln("Perimetro:" + p.calcularPerimetro); 
            }

        }
    }
