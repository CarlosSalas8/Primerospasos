/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author 
 */
public abstract class Traje {
    
    protected Cliente cliente;
    protected double valorBase;
    protected double valorFinal;
    
    public abstract void establecerCliente(Cliente cl);
    
    public abstract void establecerValorBase();
    
    public abstract void calcularValorFinal();
    
    public Cliente obtenerCliente(){
        return cliente;
    }
    
    public double obtenerValorBase(){
        return valorBase;
    }

    public double obtenerValorFinal() {
        return valorFinal;
    }
    
}
