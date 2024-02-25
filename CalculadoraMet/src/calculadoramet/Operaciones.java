/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoramet;
import javax.swing.JOptionPane;
/**
 *
 * @author 20012021
 */
public class Operaciones {
    //ATRIBUTOS DE NUESTRA CLASE
    int num1;
    int num2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    int modulo;
    
    //METODOS
    public void leerNumeros(){
    num1=Integer.parseInt(JOptionPane.showInputDialog("Coloca el numero 1: "));
    num2=Integer.parseInt(JOptionPane.showInputDialog("Coloca el numero 2: "));
    }
    
    public void suma(){
    suma=num1+num2;
    }
    public void resta(){
    resta=num1-num2;
    }
    public void multiplicacion(){
    multiplicacion=num1*num2;
    }
    public void division(){
    division=num1/num2;
    }
    public void modulo(){
    modulo=num1%num2;
    }
    public void mostrarResultados(){
    System.out.println("El resultado de la suma es: "+suma);
    System.out.println("El resultado de la resta es: "+resta);
    System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
    System.out.println("El resultado de la division es: "+division);
    System.out.println("El resultado de la modulo es: "+modulo);
    }
}
