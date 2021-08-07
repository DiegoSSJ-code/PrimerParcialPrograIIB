/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primerparcial;

import com.operaciones.ClsOperaciones;
import com.productos.ClsMateriales;

/**
 *
 * @author Win10
 */
public class ClsPrincipal {
    public static void main(String[] args) {
        ClsMateriales pedido1 = new ClsMateriales();
        ClsOperaciones faturin = new ClsOperaciones(4);
        
        pedido1.setCantidad(2);
        pedido1.setNmaterial("Block");
        pedido1.setValor_fact(3.50);
        faturin.AgregareMaterialesFactura(pedido1);
        faturin.imprimirDecorado();
        faturin.gasto_valor(0);
        System.out.println("#-----NOM-----FACT-----GVAL----GPESO---TOTALU-----TOTAL");
        
        pedido1.setCantidad(10);
        pedido1.setNmaterial("Lamina");
        pedido1.setValor_fact(250);
        faturin.AgregareMaterialesFactura(pedido1);
        faturin.imprimirDecorado();
        faturin.gasto_valor(1);
        System.out.println("#-----NOM-----FACT-----GVAL----GPESO---TOTALU-----TOTAL");
        
        pedido1.setCantidad(5);
        pedido1.setNmaterial("Clavos");
        pedido1.setValor_fact(7);
        faturin.AgregareMaterialesFactura(pedido1);
        faturin.imprimirDecorado();
        faturin.gasto_valor(2);
        System.out.println("#-----NOM-----FACT-----GVAL----GPESO---TOTALU-----TOTAL");
        
        pedido1.setCantidad(25);
        pedido1.setNmaterial("Reglas");
        pedido1.setValor_fact(4.50);
        faturin.AgregareMaterialesFactura(pedido1);
        faturin.imprimirDecorado();
        faturin.gasto_valor(3);
        System.out.println("#-----NOM-----FACT-----GVAL----GPESO---TOTALU-----TOTAL");
        
        pedido1.setCantidad(45);
        pedido1.setNmaterial("Lijas");
        pedido1.setValor_fact(1.50);
        faturin.AgregareMaterialesFactura(pedido1);
        faturin.imprimirDecorado();
        faturin.gasto_valor(4);
        System.out.println("#-----NOM-----FACT-----GVAL----GPESO---TOTALU-----TOTAL");
        
        pedido1.setCantidad(2);
        pedido1.setNmaterial("Block");
        pedido1.setValor_fact(3.50);
        faturin.AgregareMaterialesFactura(pedido1);
        faturin.imprimirDecorado();
        faturin.gasto_valor(0);
        System.out.println("#-----NOM-----FACT-----GVAL----GPESO---TOTALU-----TOTAL");
    }
}
