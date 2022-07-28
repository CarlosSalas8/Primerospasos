/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author 
 */
public class TrajePlaya extends Traje {

    private double vGorra;
    private double vCamiseta;
    private double vPantaloneta;

    /*public TrajePlaya(double vG, double vC, double vP) {
        vGorra = vG;
        vCamiseta = vC;
        vPantaloneta = vP;
    }*/
    
    public void establecerValorGorra(double vG) {
        vGorra = vG;
    }

    public void establecerValorCamiseta(double vC) {
        vCamiseta = vC;
    }

    public void establecerValorPantaloneta(double vP) {
        vPantaloneta = vP;
    }
    
    @Override
    public void calcularValorFinal() {
        if (cliente.obtenerEdad() >= 20) {
            vGorra = obtenerValorGorra() * 0.50;
        }
        
        valorFinal = obtenerValorGorra() + 
                obtenerValorCamiseta() + 
                obtenerValorPantaloneta() + 
                obtenerValorBase();
    }

    @Override
    public void establecerCliente(Cliente cl) {
        cliente = cl;
    }

    @Override
    public void establecerValorBase() {
        valorBase = 10;
    }

    public double obtenerValorGorra() {
        return vGorra;
    }

    public double obtenerValorCamiseta() {
        return vCamiseta;
    }

    public double obtenerValorPantaloneta() {
        return vPantaloneta;
    }

    public String toString() {
        String cadena = String.format("Traje Playa\n"
                + "  %s"
                + "  Valor Base: %.2f\n"
                + "  Valor Gorra: %.2f\n"
                + "  Valor Camiseta: %.2f\n"
                + "  Valor Pantaloneta: %.2f\n"
                + "  -> Valor Final: %.2f\n", 
                obtenerCliente(),
                obtenerValorBase(),
                obtenerValorGorra(),
                obtenerValorCamiseta(),
                obtenerValorPantaloneta(),
                obtenerValorFinal());
        return cadena;
    }

}
