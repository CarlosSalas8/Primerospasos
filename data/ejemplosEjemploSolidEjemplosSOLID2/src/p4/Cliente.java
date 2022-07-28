/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;

import p2.Jugo;

/**
 *
 * @author reroes
 */
public class Cliente {

    private String nombre;

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public String obtenerNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre: %s\n"
                + "Lista de jugos\n", obtenerNombre());
        return cadena;
    }

}
