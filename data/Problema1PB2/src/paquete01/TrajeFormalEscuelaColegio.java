/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author 
 */
public class TrajeFormalEscuelaColegio extends Traje{
    
    private double vChompaEscuelaColegio;
    private double vPantalon;
    private double vCamisa;
    private double vCorbata;
    private double porcentajeDesChompa;
    private double vDesChompa;

    /*public TrajeFormalEscuelaColegio(double vCEC, double vP,
            double vC, double vCo, double pDC) {
        vChompaEscuelaColegio = vCEC;
        vPantalon = vP;
        vCamisa = vC;
        vCorbata = vCo;
        porcentajeDesChompa = pDC;
    }*/
    
    public void establecerValorChompaEscuelaColegio(double vCEC) {
        vChompaEscuelaColegio = vCEC;
    }

    public void establecerValorPantalon(double vP) {
        vPantalon = vP;
    }

    public void establecerValorCamisa(double vC) {
        vCamisa = vC;
    }
    
    public void establecerValorCorbata(double vCo) {
        vCorbata = vCo;
    }
    
    public void establecerPorcentajeDescuentoChompa(double pdesc){
        porcentajeDesChompa = pdesc;
    }
    
    public void calcularValorDescuentoChompa(){
        vDesChompa = obtenerValorChompaEscuelaColegio() * 
                (obtenerPorcentajeDesChompa()/100);
    }
    
    public void calcularValorFinal() {
        
        valorFinal = obtenerValorDesChompa() + 
                obtenerValorPantalon() + 
                obtenerValorCamisa() + 
                obtenerValorBase() + 
                obtenerValorCorbata();
    }

    @Override
    public void establecerCliente(Cliente cl) {
        cliente = cl;
    }

    @Override
    public void establecerValorBase() {
        valorBase = 10;
    }

    public double obtenerValorChompaEscuelaColegio() {
        return vChompaEscuelaColegio;
    }

    public double obtenerValorPantalon() {
        return vPantalon;
    }

    public double obtenerValorCamisa() {
        return vCamisa;
    }

    public double obtenerValorCorbata() {
        return vCorbata;
    }

    public double obtenerPorcentajeDesChompa() {
        return porcentajeDesChompa;
    }

    public double obtenerValorDesChompa() {
        return vDesChompa;
    }
    
    public String toString() {
        String cadena = String.format("Traje Formal Escuelay Colegio\n"
                + "  %s"
                + "  Valor Base: %.2f\n"
                + "  Valor Chompa: %.2f\n"
                + "  Valor Pantalon: %.2f\n"
                + "  Valor Camisa: %.2f\n"
                + "  Valor Corbata: %.2f\n"
                + "  Descuento en chompa: %.2f\n"
                + "  Porcentaje Descuento: %.2f\n"
                + "  -> Valor Final: %.2f\n", 
                obtenerCliente(),
                obtenerValorBase(),
                obtenerValorChompaEscuelaColegio(),
                obtenerValorPantalon(),
                obtenerValorCamisa(),
                obtenerValorCorbata(),
                obtenerValorDesChompa(),
                obtenerPorcentajeDesChompa(),
                obtenerValorFinal());
        return cadena;
    }
    
}
