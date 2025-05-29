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
public class p4S1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String nombre = "";
        double salBruto = 0;
        double salNeto = 0;
        double calcDed = 0;
        String leer;

        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");

        leer = JOptionPane.showInputDialog(null, "Ingrese su salario mensual: ");
        salBruto = Double.parseDouble(leer);

        calcDed = (salBruto / 100) * 9.34;
        salNeto = salBruto - calcDed;

        System.out.println("Estimado " + nombre + "el salario de este mes se desglosa de la siguiente manera:");
        System.out.println("Salario bruto es: " + salBruto);
        System.out.println("Deducciones: " + calcDed);
        System.out.println("Salario Neto: " + salNeto);

    }

}
