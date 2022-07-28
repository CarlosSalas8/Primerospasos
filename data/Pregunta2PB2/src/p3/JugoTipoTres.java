/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import p2.Jugo;

/**
 *
 * @author reroes
 */
public class JugoTipoTres extends Jugo{
    
    @Override
    public void establecerVFinal(){
        // base + valor de fruta + valor yogourt
        vFinal = base + 0.5 + 1.1;
    }
    
    @Override
    public String toString(){
        // base + valor de fruta
        String reporte = String.format("Jugo Tipo Tres \n"
                + "valor a cancelar: %.3f\n",
                obtenerVFinal());
        return reporte;
    }
}
