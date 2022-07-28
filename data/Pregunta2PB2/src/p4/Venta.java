/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;

import java.util.ArrayList;
import p2.Jugo;
import p3.*;

/**
 *
 * @author reroes
 */
public class Venta {

    private Cliente cliente;
    double valorVenta;
    private ArrayList<Jugo> jugo = new ArrayList<>();
    /*private JugoEconomico jugo1;
    private JugoEconomico jugo2;
    private JugoTipoDos jugo3;
    private JugoTipoTres jugo4;
    private JugoTipoTres jugo5;*/

    public Venta(Cliente c, ArrayList<Jugo> j) {
        cliente = c;
        jugo = j;
    }

    public void establecerJugos(ArrayList<Jugo> lista) {
        jugo = lista;
    }

    public void establecerValorVenta() {
        for (int i = 0; i < obtenerJugos().size(); i++) {
            valorVenta = valorVenta
                    + obtenerJugos().get(i).obtenerVFinal();
        }
    }

    public ArrayList<Jugo> obtenerJugos() {
        return jugo;
    }

    public double obtenerValorVenta() {
        return valorVenta;
    }

    @Override
    public String toString() {
        String data = String.format("Ventas del cliente \n%s\n",
                cliente);

        for (int i = 0; i < obtenerJugos().size(); i++) {
            data = String.format("%s"
                    + "%s\n",
                    data,
                    obtenerJugos().get(i));
        }

        data = String.format("\n%sVentas totales: %.2f\n",
                data,
                obtenerValorVenta());
        return data;
    }
}
