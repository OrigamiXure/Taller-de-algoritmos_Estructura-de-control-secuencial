/*Dada una cantidad en metros, se requiere que la convierta a pies y pulgadas, considerando lo
siguiente: 1 metro = 39.27 pulgadas; 1 pie = 12 pulgadas. */

public class Ejercicio_7 {
    public static void main (String[] argus){
        float metros;
        double pulgadas;
        double pies;
        System.out.println("Ingresa los metros");
        metros = Float.parseFloat(System.console().readLine());
        pulgadas = metros * 39.37;
        pies = metros * 3.28;
        System.out.println("La medida en pulgadas es: " + pulgadas + " pulgadas");
        System.out.println("La medida en pies es: " + pies + " pies");
    }
}