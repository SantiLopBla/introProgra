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
public class P2s1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Solicitar al usuario su edad. Ver si puede votar. Votan +18
         */

        int edad = 0;
        String leer;

        leer = JOptionPane.showInputDialog(null, "Ingrese su edad: ");
        edad = Integer.parseInt(leer);

        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Puede votar");
        } else {
            JOptionPane.showMessageDialog(null, "No puede votar");
        }
    }

}
