/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda;
import java.util.ArrayList;
/**
 *
 * @author 20012021
 */
public class Carrito {
    private ArrayList<Producto>productos;
    public Carrito(){
    productos = new ArrayList<>();
    }
    public void agregarProducto(Producto producto){
    productos.add(producto);
        System.out.println("Se agrego "+producto.getNombre()+" al carrito");
    }
    public double calcularTotal(){
    double total= 0;
    for(Producto producto: productos){
    total+=producto.getPrecio();
    }
    return total;
    }
    public ArrayList<Producto>getProductos(){
    return productos;
    }
}
