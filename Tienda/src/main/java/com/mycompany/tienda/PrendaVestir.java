/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda;

/**
 *
 * @author 20012021
 */
public class PrendaVestir extends Producto{
    private String talla;
    
    public PrendaVestir(String nombre, double precio, String talla){
        super(nombre, precio);
        this.talla=talla;
    }

    public String getTalla() {
        return talla;
    }
    
}
