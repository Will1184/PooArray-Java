package com.gm.ventas;

public class Orden {
    protected final int idOrden;
    private final Producto [] productos;
    private static int contadorProductos=0;
    private static int contadorOrden=0;



    public Orden() {
        this.idOrden = ++contadorOrden;
        productos = new Producto[3];
    }

    public void agregarProducto(Producto producto) {
        productos[contadorProductos++]=producto;
    }

    public double calcularTotal() {

       double total=0;
       for (int i=0;i<contadorProductos;i++){
       total+=productos[i].getPrecio();
       }
        return total ;
    }

    public void mostrarOrden() {
        System.out.println("Orden: "+idOrden);
        for (int i = 0; i < contadorProductos; i++) {
            System.out.println(productos[i]);
        }
        System.out.println("El total es: "+calcularTotal());
    }
}

