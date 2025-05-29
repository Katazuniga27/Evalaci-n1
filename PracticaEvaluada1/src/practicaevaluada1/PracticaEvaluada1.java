/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaevaluada1;

import javax.swing.JOptionPane;

/**
 *
 * @author milkyaakath
 */
public class PracticaEvaluada1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Programa para calcular deuda a la CCSS
        String Cliente = JOptionPane.showInputDialog("Ingrese su nombre");
        String SalarioIndividual = JOptionPane.showInputDialog("Ingrese su salario individual");

        //Pasar el string salarioindivual a int
        int SalarioIndividual1 = Integer.parseInt(SalarioIndividual);

        //aplicar deducciones
        double montoSEM = SalarioIndividual1 * 0.0925;
        double montoIVM = SalarioIndividual1 * 0.0508;
        int montoFinal = (int) (montoIVM + montoSEM);
        double deduccionAso = (SalarioIndividual1 - montoFinal) * 0.025;
        JOptionPane.showMessageDialog(null, "Para el usuario" + Cliente + "empresa debe pagar a la CCSS un total de " + montoFinal);
        JOptionPane.showMessageDialog(null, "Para el usuario" + Cliente + "el monto de la empresa destinado a la asociacion es de " + deduccionAso);
    
    
    
    }
    
}
