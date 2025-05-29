/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicass2;

import javax.swing.JOptionPane;

/**
 *
 * @author sanlo
 */
public class p3S1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Solicitar 4 numeros y sacarles el promedio

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int prom = 0;
        String leer;

        leer = JOptionPane.showInputDialog("Digite el primer numero: ");
        num1 = Integer.parseInt(leer);

        leer = JOptionPane.showInputDialog("Digite el segundo numero: ");
        num2 = Integer.parseInt(leer);

        leer = JOptionPane.showInputDialog("Digite el tercer numero: ");
        num3 = Integer.parseInt(leer);

        leer = JOptionPane.showInputDialog("Digite el cuarto numero: ");
        num4 = Integer.parseInt(leer);

        prom = (num1 + num2 + num3 + num4) / 4;

        JOptionPane.showMessageDialog(null, "El promedio es: " + prom);
    }
    
}
