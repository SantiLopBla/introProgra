package practicas2;

import javax.swing.JOptionPane;

public class P2s4 {

    public static void main(String[] args) {

        int años = 0;
        int horas = 0;
        double paga = 0;
        double salarioBruto = 0;
        double bono = 0;
        double deduccion = 0;
        double salarioNeto = 0;
        String leer;

        leer = JOptionPane.showInputDialog(null, "Ingrese la cantidad de años laborados:");
        años = Integer.parseInt(leer);

        leer = JOptionPane.showInputDialog(null, "Ingrese la cantidad de horas laboradas por semana:");
        horas = Integer.parseInt(leer);

        leer = JOptionPane.showInputDialog(null, "Ingrese el precio pagado por hora:");
        paga = Double.parseDouble(leer);

        salarioBruto = (paga * horas)*4; //horas por semana, y salario de cada mes

        // Bono si tiene más de 12 años
        if (años > 12) {
            bono = (salarioBruto * 5.5) / 100;
            salarioBruto = salarioBruto + bono;
        }

        // Deducciones
        if (salarioBruto > 3500) {
            deduccion = (salarioBruto * 3.8) / 100;
        } else if (salarioBruto > 2500) {
            deduccion = (salarioBruto * 2.7) / 100;
        }

        salarioNeto = salarioBruto - deduccion;

        // Mostrar solo salario neto
        JOptionPane.showMessageDialog(null, "Su salario neto final es: $" + salarioNeto);
    }
}
