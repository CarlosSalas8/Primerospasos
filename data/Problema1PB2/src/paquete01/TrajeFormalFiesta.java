/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author 
 */
public class TrajeFormalFiesta extends Traje{
    private double vTerno;
    private double vCamisa;
    private double vZapatos;

    /*public TrajeFormalFiesta(double vT, double vC, double vZ) {
        vTerno = vT;
        vCamisa = vC;
        vZapatos = vZ;
    }*/

    public void establecerValorTerno(double vT) {
        vTerno = vT;
    }

    public void establecerValorCamisa(double vC) {
        vCamisa = vC;
    }
    
    public void establecerValorZapatos(double vZ) {
        vZapatos = vZ;
    }
    
    @Override
    public void calcularValorFinal() {
        
        if (obtenerCliente().obtenerNombre().charAt(0) == 'A'
                || obtenerCliente().obtenerNombre().charAt(0) == 'E'
                || obtenerCliente().obtenerNombre().charAt(0) == 'I'
                || obtenerCliente().obtenerNombre().charAt(0) == 'O'
                || obtenerCliente().obtenerNombre().charAt(0) == 'U') {
            vTerno = obtenerValorTerno() * 0.5;
            vZapatos = obtenerValorZapatos() * 0.5;
        }
        valorFinal = obtenerValorTerno() + obtenerValorCamisa() 
                + obtenerValorZapatos();
    }

    @Override
    public void establecerCliente(Cliente cl) {
        cliente = cl;
    }

    @Override
    public void establecerValorBase() {
        valorBase = 10;
    }

    public double obtenerValorTerno() {
        return vTerno;
    }

    public double obtenerValorCamisa() {
        return vCamisa;
    }

    public double obtenerValorZapatos() {
        return vZapatos;
    }

    public String toString() {
        String cadena = String.format("Traje Formal de Festa\n"
                + "  %s"
                + "  Valor Base: %.2f\n"
                + "  Valor del Terno: %.2f\n"
                + "  Valor de Camisa: %.2f\n"
                + "  Valor de Zapatos: %.2f\n"
                + "  -> Valor Final: %.2f\n", 
                obtenerCliente(),
                obtenerValorBase(),
                obtenerValorTerno(),
                obtenerValorCamisa(),
                obtenerValorZapatos(),
                obtenerValorFinal());
        return cadena;
    }
}
