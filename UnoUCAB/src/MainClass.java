import Comunicacion.ServicioTransmision;
import java.util.Scanner;


public class MainClass {

        public MainClass() {
        Scanner in = new Scanner(System.in);
        ServicioTransmision st = new ServicioTransmision();

        display_menu();
        switch (in.nextInt()) {
            case 1:
                System.out.println("Los puertos disponibles son:");
                st.listaPuertos();
                break;
            case 2:
                System.out.println("Elegiste opcion 2");
                break;
            case 3:
                System.out.println("Elegiste opcion 3");
                break;
            default:
                System.err.println("Opcion no reconocida");
                break;
        }
    }
        
    public void display_menu() {
        System.out.println("1) Lista puertos disponibles\n2) Enviar trama ejemplo 2\n3) Enviar trama ejemplo 3");
        System.out.print("Seleccionar: ");
    }

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();  
    }

}
