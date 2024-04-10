/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author 20012021
 */
public class VehiculoEspacial extends Vehiculo{
    
    private int turbinas;
    
    public VehiculoEspacial(String marca, String modelo, int turbinas){
    super(marca, modelo);
    this.turbinas=turbinas;
    }
    public void mostrarInfo(){
    super.mostrarInfo();
        System.out.println("Turbinas: "+turbinas);
    }
    
}
