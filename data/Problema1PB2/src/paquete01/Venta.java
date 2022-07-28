/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class Venta {
    private ArrayList<Traje> trajes;
    private double totalFactura;

    public void establecerTrajes(ArrayList<Traje> t) {
        trajes = t;
    }
    
    public void establecerTotalFactura(){
        double suma = 0;
        for (int i = 0; i < obtenerTrajes().size(); i++) {
            suma = suma + obtenerTrajes().get(i).obtenerValorFinal();
        }
        totalFactura = suma;        
    }
    
    public ArrayList<Traje> obtenerTrajes() {
        return trajes;
    }

    public double obtenerTotalFactura() {
        return totalFactura;
    }
    
    
    public String toString(){
        String reporte = String.format("");
        
        for (int i = 0; i < trajes.size(); i++) {
            reporte = String.format("%s\n"
                    + "%s", reporte, trajes.get(i).toString());
        }
        
        reporte = String.format("%s\n  Total Factura: %.2f\n", 
                reporte, obtenerTotalFactura());
        
        return reporte;
    }
    
}
