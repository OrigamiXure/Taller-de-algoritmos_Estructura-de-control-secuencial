/*Una empresa X trabaja con láminas de hierro para fabricar una pieza. Se conoce que (a) la lámina
mide en promedio 4 metros de largo por 1.5 metros de ancho; (b) la pieza a fabricar consume 0.5
metros en total. Se requiere que calcule y muestre cuántas piezas se fabrican con una lámina y
cuánto será el desperdicio. */

public class Ejercicio_16 {
    public static void main(String[] args) {
        int largo_lamina = 4;
        double ancho_lamina = 1.5;
        double pieza_frabicada = 0.5;
        double piezas_por_lamina = largo_lamina * ancho_lamina / pieza_frabicada;
        System.out.println("El número de piezas que se pueden fabricar por lámina es: " + piezas_por_lamina + " piezas");
        double desperdicio_por_lamina = (largo_lamina * ancho_lamina) - (piezas_por_lamina * pieza_frabicada);
        System.out.println("El desperdicio por lámina es: " + desperdicio_por_lamina + " metros cuadrados");
    }
}