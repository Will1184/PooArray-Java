package com.gm.ventas;

public class Producto extends Orden{
    private final int idProducto;
    private String nombre;
    private double precio;

private static int cantidadProductos;
    public Producto() {
        this.idProducto= ++cantidadProductos;
    }

    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {

            return "id: "+idProducto+ ", nombre: " + nombre +
                    ", precio: " + precio;
    }
}
