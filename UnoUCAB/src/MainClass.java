
import Comunicacion.ServicioTransmicion;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alexd
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public void display_menu() {
        System.out.println("1) Option 1\n2) Option 2\n3) Option 3");
        System.out.print("Selection: ");
    }

    public MainClass() {
        Scanner in = new Scanner(System.in);

        display_menu();
        switch (in.nextInt()) {
            case 1:
                System.out.println("You picked option 1");
                break;
            case 2:
                System.out.println("You picked option 2");
                break;
            case 3:
                System.out.println("You picked option 3");
                break;
            default:
                System.err.println("Unrecognized option");
                break;
        }
    }

    public static void main(String[] args) {
        //ServicioTransmicion servicioTransmicion = new ServicioTransmicion();
        // TODO code application logic here
        new MainClass();
    }

}
