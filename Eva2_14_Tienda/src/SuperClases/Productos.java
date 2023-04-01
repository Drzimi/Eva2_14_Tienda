/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SuperClases;

/**
 *
 * @author invitado
 */
abstract public class Productos {
    //Tiene que llevar precio , nombre y unidad de venta
    
    private Double Precio;
    private String Nombre;
    private String UnidadVenta;

    public Productos() {
        this.Precio = 0.0;
        this.Nombre = "";
        this.UnidadVenta = "";
    }

    public Productos(Double Precio, String Nombre, String UnidadVenta) {
        this.Precio = Precio;
        this.Nombre = Nombre;
        this.UnidadVenta = UnidadVenta;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUnidadVenta() {
        return UnidadVenta;
    }

    public void setUnidadVenta(String UnidadVenta) {
        this.UnidadVenta = UnidadVenta;
    }
    
   public abstract double Precio(int cant);
}
