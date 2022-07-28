/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author 
 */
public class TrajeEducacionFisicaEscuelaColegio extends Traje {

    private double vCalentadorEscCole;
    private double vMedias;
    private double vFinal;

    /*public TrajeEducacionFisicaEscuelaColegio(double vCEC, double vM) {
        vCalentadorEscCole = vCEC;
        vMedias = vM;
    }*/

    public void establecerValorCalentadorEscCole(double vCEC) {
        vCalentadorEscCole = vCEC;
    }

    public void establecerValorMedias(double vM) {
        vMedias = vM;
    }

    public void calcularValorFinal() {

        if (obtenerCliente().obtenerCiudad() == "ZAMORA"
                || obtenerCliente().obtenerCiudad() == "MACHALA") {
            vMedias = obtenerValorMedias() * 0.8;
        }
        vFinal = obtenerValorCalentadorEscCole() + obtenerValorMedias();
    }

    @Override
    public void establecerCliente(Cliente cl) {
        cliente = cl;
    }

    @Override
    public void establecerValorBase() {
        valorBase = 10;
    }

    public double obtenerValorCalentadorEscCole() {
        return vCalentadorEscCole;
    }

    public double obtenerValorMedias() {
        return vMedias;
    }

    public double obtenerValorFinal() {
        return vFinal;
    }

    public String toString() {
        String cadena = String.format("Traje Educación Física de Escuela y "
                + "Colegio\n"
                + "  %s"
                + "  Valor Base: %.2f\n"
                + "  Valor Calentador: %.2f\n"
                + "  Valor Medias: %.2f\n"
                + "  -> Valor Final: %.2f\n", 
                obtenerCliente(),
                obtenerValorBase(),
                obtenerValorCalentadorEscCole(),
                obtenerValorMedias(),
                obtenerValorFinal());
        return cadena;
    }
}
