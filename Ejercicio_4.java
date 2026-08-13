/*Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber cuánto
deberá pagar finalmente por su compra. */

public class Ejercicio_4 {
    public static void main (String[] argus){
        int compra;
        double descuento;
        double total;
        System.out.println("Ingrese el valor de la compra");
        compra = Integer.parseInt(System.console().readLine());
        descuento = compra * 0.15;
        System.out.println("El descuento es: " + descuento);
        total = compra - descuento;
        System.out.println("El total a pagar es: " + total);
    }
}