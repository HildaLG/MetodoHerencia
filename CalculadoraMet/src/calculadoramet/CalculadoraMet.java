/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoramet;

/**
 *
 * @author 20012021
 */
public class CalculadoraMet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operaciones ope1= new Operaciones ();
        ope1.leerNumeros();
        ope1.suma();
        ope1.resta();
        ope1.multiplicacion();
        ope1.division();
        ope1.modulo();
        ope1.mostrarResultados();
    }
    
}
