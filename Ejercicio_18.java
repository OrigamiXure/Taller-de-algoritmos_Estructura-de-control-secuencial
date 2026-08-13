/*Resuelva el problema que tienen en una gasolinera. Los surtidores de la misma registran lo que
surten en galones, pero el precio de la gasolina está fijado en litros. Se requiere que calcule y muestre
lo que hay que cobrarle a un cliente, considerando que: (a) cada galón tiene 3.785 litros; (b) el precio
del litro es de 100 Bolívares. */

public class Ejercicio_18 {
    public static void main (String[] args) {
        int galones;
        double litros;
        System.out.println("Ingresa la cantidad de galones");
        galones = Integer.parseInt(System.console().readLine());
        litros = galones * 3.785;
        System.out.println("La cantidad de litros es: " + litros + " litros");
        double precio_galon = (litros * 100);
        System.out.println("El precio por galón es: " + precio_galon + " Bolivares");
    }
}
