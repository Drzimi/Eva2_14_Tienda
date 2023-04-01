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
abstract public class Ropa extends Productos{
    private String Talla;
    private String Marca;
    private String Color;

    public Ropa() {
        super();
        this.Talla = "";
        this.Marca = "";
        this.Color = "";
        
    }

    public Ropa(String Talla, String Marca, String Color, Double Precio, String Nombre, String UnidadVenta) {
        super(Precio, Nombre, UnidadVenta);
        this.Talla = Talla;
        this.Marca = Marca;
        this.Color = Color;
    }

    public String getTalla() {
        return Talla;
    }

    public void setTalla(String Talla) {
        this.Talla = Talla;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    
}
