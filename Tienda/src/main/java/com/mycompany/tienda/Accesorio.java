/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda;

/**
 *
 * @author 20012021
 */
public class Accesorio extends Producto{
    private String tipo;
    
    public Accesorio(String nombre, double precio, String tipo){
    super(nombre, precio);
    this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }
    
}
