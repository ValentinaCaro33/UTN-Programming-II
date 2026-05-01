package Ejercicio_04;

public class Main {
    public static void main(String[] args){
        Producto producto1 = new Producto("Jamon", -150.00);
        Producto producto2 = new Producto("Queso");

        producto1.setPrecioBase(-180.00);
        producto1.setPrecioBase(180.00);

        System.out.println(producto1.toString());
        System.out.println(producto2.toString());

        producto1.aplicarDescuento(5.00);
        producto2.aplicarDescuento(10.00, 90.00);

        System.out.println(producto1.toString());
        System.out.println(producto2.toString());

        Producto.cambiarIVA(0.50);

        System.out.println(producto1.toString());
        System.out.println(producto2.toString());
    }
}
