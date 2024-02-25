/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author 20012021
 */

public class Operaciones {
    //ATRIBUTOS DE NUESTRA CLASE
 
    int suma;
    int resta;
    int multiplicacion;
    int division;
    int modulo;
    
    //METODOS
    public void suma(int numero1, int numero2){
    suma=numero1+numero2;
    }
    public void resta(int numero1, int numero2){
    resta=numero1-numero2;
    }
    public void multiplicacion(int numero1, int numero2){
    multiplicacion=numero1*numero2;
    }
    public void division(int numero1, int numero2){
    division=numero1/numero2;
    }
    public void modulo(int numero1, int numero2){
    modulo=numero1%numero2;
    }
    public void mostrarResultados(){
    System.out.println("El resultado de la suma es: "+suma);
    System.out.println("El resultado de la resta es: "+resta);
    System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
    System.out.println("El resultado de la division es: "+division);
    System.out.println("El resultado de la modulo es: "+modulo);
    }
}
