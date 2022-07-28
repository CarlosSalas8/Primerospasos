/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

/**
 *
 * @author reroes
 */
public abstract class Jugo {
    
    protected double base;
    protected double vFinal;
    
    public void establecerBase(double f){
        base = f;
    }
    
    public abstract void establecerVFinal();
    
    public double obtenerBase(){
        return base;
    }
    
    public double obtenerVFinal(){
        return vFinal;
    }
    
    
}
