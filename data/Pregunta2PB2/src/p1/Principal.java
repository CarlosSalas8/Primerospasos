/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.ArrayList;
import p2.Jugo;
import p3.*;
import p4.*;

/**
 *
 * @author reroes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Jugo> jugo = new ArrayList<>();
        JugoEconomico g1 = new JugoEconomico();
        JugoEconomico g2 = new JugoEconomico();
        JugoTipoDos g3 = new JugoTipoDos();
        JugoTipoTres g4 = new JugoTipoTres();
        JugoTipoTres g5 = new JugoTipoTres();

        //Agregar a la solución
        JugoTipoDos g6 = new JugoTipoDos();
        JugoTipoTres g7 = new JugoTipoTres();
        JugoEconomico g8 = new JugoEconomico();
        
        //Se agregan los objetos al ArrayList
        jugo.add(g1);
        jugo.add(g2);
        jugo.add(g3);
        jugo.add(g4);
        jugo.add(g5);
        jugo.add(g6);
        jugo.add(g7);
        jugo.add(g8);
        
        //Se calcula el valor final
        g1.establecerVFinal();
        g2.establecerVFinal();
        g3.establecerVFinal();
        g4.establecerVFinal();
        g5.establecerVFinal();
        g6.establecerVFinal();
        g7.establecerVFinal();
        g8.establecerVFinal();
        
        Cliente c = new Cliente();
        c.establecerNombre("Santiago Espinoza");
        
        Venta v = new Venta(c, jugo);

        v.establecerValorVenta();

        System.out.printf("%s", v);
    }

}
