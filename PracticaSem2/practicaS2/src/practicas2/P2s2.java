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
public class P2s2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota = 0;
        String leer;

        leer = JOptionPane.showInputDialog(null, "Ingrese su nota: ");
        nota = Integer.parseInt(leer);
        
        if (nota>=70){
            JOptionPane.showMessageDialog(null, "Aprobo el curso");
        }else{
            JOptionPane.showMessageDialog(null,"No aprobo el curso");
        }

    }
    
}
