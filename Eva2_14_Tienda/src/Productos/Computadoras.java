/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Productos;

import SuperClases.Electronica;

/**
 *
 * @author invitado
 */
public class Computadoras extends Electronica {
    private int Memoria;
    private String Procesador;
    private double TamañoPantalla;
    private double DiscoDuro;

    public Computadoras() {
        super();
        this.Memoria = 0;
        this.Procesador = "";
        this.TamañoPantalla = 0.0;
        this.DiscoDuro = 0.0;
    }

    public Computadoras(int Memoria, String Procesador, double TamañoPantalla, double DiscoDuro, String Fabricante, String Modelo, int Garantia, Double Precio, String Nombre, String UnidadVenta) {
        super(Fabricante, Modelo, Garantia, Precio, Nombre, UnidadVenta);
        this.Memoria = Memoria;
        this.Procesador = Procesador;
        this.TamañoPantalla = TamañoPantalla;
        this.DiscoDuro = DiscoDuro;
    }

    public int getMemoria() {
        return Memoria;
    }

    public void setMemoria(int Memoria) {
        this.Memoria = Memoria;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }

    public double getTamañoPantalla() {
        return TamañoPantalla;
    }

    public void setTamañoPantalla(double TamañoPantalla) {
        this.TamañoPantalla = TamañoPantalla;
    }

    public double getDiscoDuro() {
        return DiscoDuro;
    }

    public void setDiscoDuro(double DiscoDuro) {
        this.DiscoDuro = DiscoDuro;
    }

    
    
    
    @Override
    public double Precio(int cant) {
        //Antes de cierta cantidad manejamos precios normales 
        //despes de cierta cantidad hay descuento
        if(cant <= 10){
            return getPrecio() * cant;
        } else {
           return (getPrecio() * 0.8) * cant;
        }
        
        
    }
    
    
}
