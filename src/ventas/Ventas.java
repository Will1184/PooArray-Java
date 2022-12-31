package ventas;

import com.gm.ventas.Orden;
import com.gm.ventas.Producto;

public class Ventas {
    public static void main(String[] args) {
        Orden orden1=new Orden();

        Producto producto1=new Producto ("Carne de Res", 5.99);
        Producto producto2=new Producto ("Jabon", 3.45);
        Producto producto3=new Producto ("Limon", 0.25);

        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.mostrarOrden();

        Orden orden2 = new Orden();


    }
}
