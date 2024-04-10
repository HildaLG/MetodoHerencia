/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author 20012021
 */
public class VehiculoAereo extends Vehiculo{
    private int alas;
    
    public VehiculoAereo(String marca, String modelo, int alas){
    super(marca, modelo);
    this.alas=alas;
    }
    public void mostrarInfo(){
    super.mostrarInfo();
        System.out.println("Alas: "+alas);
    }
    
}
