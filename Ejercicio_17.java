/*Dados como datos el precio final pagado por un producto y su precio de venta al público (PVP), se
requiere que calcule y muestre el porcentaje de descuento que le ha sido aplicado. */

public class Ejercicio_17 {
    public static void main(String[] args) {
        int precio_final;
        int precio_venta;
        System.out.println("Ingresa el precio final del producto");
        precio_final = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa el precio de venta del producto");
        precio_venta = Integer.parseInt(System.console().readLine());
        int descuento = ((precio_final - precio_venta) * 100) / precio_final;
        System.out.println("El descuento aplicado es: " + descuento + "%");
    }
}