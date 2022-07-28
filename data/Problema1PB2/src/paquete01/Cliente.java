/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author 
 */
public class Cliente {
    private String nombre;
    private int edad;
    private String ciudad;

    public Cliente(String nom, int age, String city) {
        nombre = nom.toUpperCase();
        edad = age;
        ciudad = city.toUpperCase();
    }
    
    public void establecerNombre(String nom) {
        nombre = nom.toUpperCase();
    }

    public void establecerEdad(int e) {
        edad = e;
    }
    
    public void establecerCiudad(String ciu){
        ciudad = ciu.toUpperCase();
    }
    
    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerEdad() {
        return edad;
    }

    public String obtenerCiudad() {
        return ciudad;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Información Cliente\n"
                + "   Nombre: %s\n"
                + "   Edad: %d\n"
                + "   Ciudad: %s\n", obtenerNombre(),
                obtenerEdad(), obtenerCiudad());
        return cadena;
    }
    
}
