/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.operaciones; 

import com.productos.ClsMateriales;
import java.util.Scanner;

/**
 *
 * @author Win10
 */
public class ClsOperaciones {
    Scanner inp = new Scanner(System.in);
    private static String[][] factura = new String[4][6];
      
    private static final int CANTIDAD = 0;
    private static final int NPRODUCT = 1;
    private static final int VALFACT = 2;
    private static final int GASTOVAL= 3;
    private static final int GASTOPESO = 4;
    private static final int GASTOUNI = 5;
    private static final int TOTAL = 6; 
    int filaAc = 0;
    private static final int MAX_FILAS = 5;
    private static final int MAX_COLUMNAS = 7;
    int total_filas = 0;
    
    public ClsOperaciones(int filas){
        if (filas > MAX_FILAS){
            throw(new IllegalArgumentException());
        } else {
            total_filas = filas;
            factura = new String[total_filas][MAX_COLUMNAS];
        }
    }
    
    public String AgregareMaterialesFactura(ClsMateriales material){
        factura[filaAc][CANTIDAD]= material.getCantidad() + "";
        factura[filaAc][NPRODUCT]= material.getNmaterial();
        factura[filaAc][VALFACT]= material.getValor_fact() + "";  
        filaAc++;
        return "Añadido a la factura:)";
             
    }
    public  void imprimirDecorado(){
       
       for (int x = 0; x < factura.length; x++) {
            System.out.print("|");
            for (int y = 0; y < factura[x].length; y++) {
                System.out.print(factura[x][y]);
                if (y != factura[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    } 
    
    public double gasto_valor (int fila){ 
        double valfact = 0;
        String fil = factura[fila][VALFACT]; 
        valfact = (Double.parseDouble(fil) * 0.12)+(Double.parseDouble(fil)*0.04);
        factura[fila][GASTOVAL] = (valfact)+"";
        factura[fila][GASTOPESO] = (Double.parseDouble(fil)*0.012)+"";
        factura[fila][GASTOUNI] = (Double.parseDouble(factura[fila][VALFACT])+ Double.parseDouble(factura[fila][GASTOVAL]) + Double.parseDouble(factura[fila][GASTOPESO]))+""; 
        factura[fila][TOTAL] = (Double.parseDouble(factura[fila][CANTIDAD]) * Double.parseDouble(factura[fila][GASTOUNI]))+ "";
        return valfact;
        
    }   
    
    static void total (int[][] factura){
        
    }
}
