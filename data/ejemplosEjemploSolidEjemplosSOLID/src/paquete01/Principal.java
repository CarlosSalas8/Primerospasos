/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Traje> t = new ArrayList<>();

        System.out.println("\t\tTRAJES DE UNA CIUDAD\n");
        System.out.print("Ingresar Información Cliente:\n"
                + " Nombre: ");
        String nom = leer.nextLine();
        System.out.print("\n Edad: ");
        int edad = leer.nextInt();
        leer.nextLine();
        System.out.print("\n Ciudad: ");
        String city = leer.nextLine();

        Cliente cl = new Cliente(nom, edad, city);

        for (int i = 0; i < 6; i++) {
            System.out.println("\n¿Qué tipo de Traje desea Ingresar?\n"
                    + "[1] Traje de playa\n"
                    + "[2] Traje de formal de escuela y colegio\n"
                    + "[3] Traje de educación física de escuela y colegio\n"
                    + "[4] Traje de formal de fiesta\n");
            int opc = leer.nextInt();

            switch (opc) {
                case 1:
                    TrajePlaya tP = new TrajePlaya();
                    tP.establecerCliente(cl);
                    tP.establecerValorBase();
                    System.out.print("\n <- Ingrese el valor de la gorra: ");
                    double gorra = leer.nextDouble();
                    tP.establecerValorGorra(gorra);
                    System.out.print("\n <- Ingrese el valor de camiseta: ");
                    double camiseta = leer.nextDouble();
                    tP.establecerValorCamiseta(camiseta);
                    System.out.print("\n <- Ingrese el valor de pantaloneta: ");
                    double pantaloneta = leer.nextDouble();
                    tP.establecerValorPantaloneta(pantaloneta);
                    tP.calcularValorFinal();
                    t.add(tP);
                    break;
                    
                case 2:
                    TrajeFormalEscuelaColegio tFEC = 
                            new TrajeFormalEscuelaColegio();
                    tFEC.establecerCliente(cl);
                    tFEC.establecerValorBase();
                    System.out.print("\n  <- Ingrese el valor de la chompa: ");
                    double chompa = leer.nextDouble();
                    tFEC.establecerValorChompaEscuelaColegio(chompa);
                    System.out.print("\n <- Ingrese el valor de pantalón: ");
                    double pantalon = leer.nextDouble();
                    tFEC.establecerValorPantalon(pantalon);
                    System.out.print("\n <- Ingrese el valor de camisa: ");
                    double camisa = leer.nextDouble();
                    tFEC.establecerValorCamisa(camisa);
                    System.out.print("\n <- Ingrese el valor de corbata: ");
                    double corbata = leer.nextDouble();
                    tFEC.establecerValorCorbata(corbata);
                    System.out.print("\n <- Ingrese el porcentaje descuento: ");
                    double porcentaje = leer.nextDouble();
                    tFEC.establecerPorcentajeDescuentoChompa(porcentaje);
                    tFEC.calcularValorDescuentoChompa();
                    tFEC.calcularValorFinal();
                    t.add(tFEC);
                    break;
                    
                case 3:
                    TrajeEducacionFisicaEscuelaColegio tEF = 
                            new TrajeEducacionFisicaEscuelaColegio();
                    tEF.establecerCliente(cl);
                    tEF.establecerValorBase();
                    System.out.print("\n <- Ingrese el valor de calentador: ");
                    double calentador = leer.nextDouble();
                    tEF.establecerValorCalentadorEscCole(calentador);
                    System.out.print("\n <- Ingrese el valor de medias: ");
                    double medias = leer.nextDouble();
                    tEF.establecerValorMedias(medias);
                    tEF.calcularValorFinal();
                    t.add(tEF);
                    break;
                    
                case 4:
                    TrajeFormalFiesta tFF = 
                            new TrajeFormalFiesta();
                    tFF.establecerCliente(cl);
                    tFF.establecerValorBase();
                    System.out.print("\n <- Ingrese el valor de terno: ");
                    double terno = leer.nextDouble();
                    tFF.establecerValorTerno(terno);
                    System.out.print("\n <- Ingrese el valor de camisa: ");
                    double camisa1 = leer.nextDouble();
                    tFF.establecerValorCamisa(camisa1);
                    System.out.print("\n <- Ingrese el valor de zapatos: ");
                    double zapatos = leer.nextDouble();
                    tFF.establecerValorZapatos(zapatos);
                    tFF.calcularValorFinal();
                    t.add(tFF);
                    break;
                    
                default:
                    System.out.println("Opcion Invalida");
            }
        }
        Venta venta = new Venta();
        
        venta.establecerTrajes(t);
        venta.establecerTotalFactura();
        
        System.out.printf("%s",venta.toString());
        
    }
}
