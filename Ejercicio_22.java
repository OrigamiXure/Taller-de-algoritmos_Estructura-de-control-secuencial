/*Un comerciante de computadores ofrece P precio por compra al contado ó 12 cuotas de T Bolívares
cada una. Desarrolle un programa para calcular y mostrar cuál es el porcentaje que se cobra por el
recargo en el pago del computador por cuotas. */

public class Ejercicio_22 {
    public static void main (String[] args){
        int precio_compra;
        int cuotas = 12;
        int bolivares;
        System.out.println("Ingresa el precio de compra");
        precio_compra = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa la cantidad de bolivares a pagar por mes");
        bolivares = Integer.parseInt(System.console().readLine());
        int total_credito;
        total_credito = cuotas * bolivares;
        System.out.println("El total a pagar por el credito es: " + total_credito);
        int recargo;
        recargo = total_credito - precio_compra;
        System.out.println("El recargo es: " + recargo);
        int porcentaje_recargo;
        porcentaje_recargo = (recargo * 100) / precio_compra;
        System.out.println("El porcentaje de recargo es: " + porcentaje_recargo + "%");
    }
}