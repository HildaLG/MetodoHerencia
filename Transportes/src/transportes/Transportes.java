/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transportes;

/**
 *
 * @author 20012021
 */
public class Transportes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear un vehiculo terrestre
        VehiculoTerrestre vehiculoTerrestre=new VehiculoTerrestre("Mattel","Terreneitor",7);
        VehiculoAcuatico vehiculoAcuatico=new VehiculoAcuatico("Lancha", "Yamaha","Motor prr prr");
        VehiculoAereo vehiculoAereo=new VehiculoAereo("Lancha", "Yamaha",2);
        VehiculoEspacial vehiculoEspacial=new VehiculoEspacial("Lancha", "Yamaha",4);
        
        
        //Mostrar informacion de los vehiculos
        System.out.println("Informacion del vehiculo terrestre: ");
        vehiculoTerrestre.mostrarInfo();
        
        System.out.println("Informacion del vehiculo Acuatico");
        vehiculoAcuatico.mostrarInfo();
        
        System.out.println("Informacion del vehiculo Aereo");
        vehiculoAereo.mostrarInfo();
        
        System.out.println("Informacion del vehiculo Espacial");
        vehiculoEspacial.mostrarInfo();
        
        
        
    }
    
}
