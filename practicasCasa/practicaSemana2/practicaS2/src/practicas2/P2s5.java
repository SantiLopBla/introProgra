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
public class P2s5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Pedir valor en colones de una propiedad de inmuebles
        Tasa Mensual de Morosidad=2%
        La fecha de pago esta atrasada por 5 meses y el cliente hace el pago hoy
        Calcular el monto total a pagar a los impuestos de la propiedad
        Si valor<1millon el impuestp es 6% del valor propiedad
        Si valor>=1millon y <=10millones el impuesto es 8%
        Si valor>10millones el impuesto es 10%
        Monto mensual de morosidad mensual=(monto de impuestos+monto de morosidad anterior)*(tasa de morosidad mensualñ/100)
        */
        
        double valProp=0;
        double porMor=0;
        double montMorMens=0;
        double tasMor=0;
        double valImp=0;
        String leer;
        
        leer=JOptionPane.showInputDialog(null,"Ingrese el monto de la propiedad de bienes inmuebles: ");
        valProp=Double.parseDouble(leer);
        
        if (valProp>10000000){
            valImp=valProp*0.1;
            valProp=valProp+valImp;
        }else if (valProp<=10000000 && valProp>=1000000){
            valImp=valProp*0.08;
            valProp=valProp+valImp;
        }else if (valProp<1000000){
            valImp=valProp*0.06;
            valProp=valProp+valImp;
        }
        montMorMens=(valImp+)
    }
    
}
