/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Productos;

import SuperClases.Ropa;

/**
 *
 * @author invitado
 */
public class Jeans extends Ropa {
    private String Estilo; 
    private String Material; 

    public Jeans() {
        super();
        this.Estilo = "";
        this.Material = "";
        
    }

    public Jeans(String Estilo, String Material, String Talla, String Marca, String Color, Double Precio, String Nombre, String UnidadVenta) {
        super(Talla, Marca, Color, Precio, Nombre, UnidadVenta);
        this.Estilo = Estilo;
        this.Material = Material;
    }

    public String getEstilo() {
        return Estilo;
    }

    public void setEstilo(String Estilo) {
        this.Estilo = Estilo;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }
    
    
    
    

    @Override
    public double Precio(int cant) {
       if(cant <= 10){
            return getPrecio() * cant;
        } else {
           return (getPrecio() * 0.8) * cant;
        }
    }
    
    
}
