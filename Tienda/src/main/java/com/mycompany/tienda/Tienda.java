/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tienda;
import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
/**
 *
 * @author 20012021
 */
public class Tienda {

    public static void main(String[] args) {
        PrendaVestir camisa = new PrendaVestir("Camisa", 300.99,"M");
        PrendaVestir pantalon = new PrendaVestir("Pantalon", 158.99,"L");
        Accesorio gorra = new Accesorio("Gorra", 400.99,"Deportiva");
        
        Carrito carrito=new Carrito();
        carrito.agregarProducto(camisa);
        carrito.agregarProducto(pantalon);
        carrito.agregarProducto(gorra);
        mostrarInterfazTicket(carrito);
    }
    public static void mostrarInterfazTicket(Carrito carrito){
    JFrame frame =new JFrame("Ticket de compra");
    frame.setSize(400,300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());
    
    JPanel panelDetalle= new JPanel();
    panelDetalle.setLayout(new GridLayout(carrito.getProductos().size()+2,1));
    
    DecimalFormat formato= new DecimalFormat("#.##");
    for (Producto producto : carrito.getProductos()){
    String detalleProducto= producto.getNombre()+"-$"+formato.format(producto.getPrecio());
    if (producto instanceof PrendaVestir){
    detalleProducto += "(Talla: "+((PrendaVestir)producto).getTalla()+")";
    }else if (producto instanceof Accesorio){
    detalleProducto += "(Tipo: "+ ((Accesorio)producto).getTipo()+")"; 
    }
    JLabel labelProducto = new JLabel(detalleProducto);
    panelDetalle.add(labelProducto);
    }
    JLabel labelTotal = new JLabel("Total:$"+formato.format(carrito.calcularTotal()));
    panelDetalle.add(labelTotal);
    frame.add(panelDetalle, BorderLayout.CENTER);
    JPanel panelTitulo = new JPanel();
    JLabel labelTitulo=new JLabel("TICKET DE COMPRA");
    panelTitulo.add(labelTitulo);
    frame.add(panelTitulo, BorderLayout.NORTH);
    frame.setVisible(true);
    }
}
