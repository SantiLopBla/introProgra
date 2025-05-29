/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicas2;

import javax.swing.JOptionPane;

/**
 *
 * @author sanlo
 */
public class P2s3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Solicitar al usuario el numero del dia y este le va a (Lunes=1....)

        int dia = 0;
        String leer;

        leer = JOptionPane.showInputDialog(null, "Ingrese un número de dia para saber su nombre: ");
        dia = Integer.parseInt(leer);

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No existe ese dia");
        }

    }

}
