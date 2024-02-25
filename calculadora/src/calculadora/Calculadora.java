/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package calculadora;
import javax.swing.JOptionPane;
/**
 *
 * @author 20012021
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 1"));
        int n2= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 2"));
        
        Operaciones op = new Operaciones();
        op.suma(n1,n2);
        op.resta(n1,n2);
        op.multiplicacion(n1,n2);
        op.division(n1,n2);
        op.modulo(n1,n2);
        op.mostrarResultados();
    }
    
}
