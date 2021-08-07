/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.productos;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Win10
 */
public class ClsMateriales {
    
    private int cantidad;
    private String Nmaterial;
    private double valor_fact;
    public void llenarFactura(){
        Scanner inn = new Scanner(System.in);
        System.out.println("Cantidad del producto: ");
        setCantidad(Integer.parseInt(inn.nextLine()));
        System.out.println("Nombre del producto: ");
        setNmaterial(inn.nextLine());
        System.out.println("Valor según factura: ");
        setValor_fact(Float.parseFloat(inn.nextLine()));    
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the Nmaterial
     */
    public String getNmaterial() {
        return Nmaterial;
    }

    /**
     * @param Nmaterial the Nmaterial to set
     */
    public void setNmaterial(String Nmaterial) {
        this.Nmaterial = Nmaterial;
    }

    /**
     * @return the valor_fact
     */
    public double getValor_fact() {
        return valor_fact;
    }

    /**
     * @param valor_fact the valor_fact to set
     */
    public void setValor_fact(double valor_fact) {
        this.valor_fact = valor_fact;
    }
    /**
     * @param precio_vodega the precio_vodega to set
     */

    
}
