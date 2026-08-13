/*Determine cuánto dinero hay en un banco que contiene N1 billetes de 50000, N2 billetes de 20000,
N3 billetes de 10000, N4 billetes de 5000, N5 billetes de 2000, N6 billetes 1000, N7 billetes de 500 y
N8 billetes de 100. */

public class Ejercicio_13 {
    public static void main(String[] argus){
        int billetes1;
        int billetes2;
        int billetes3;
        int billetes4;
        int billetes5;
        int billetes6;
        int billetes7;
        int billetes8;
        System.out.println("Ingresa la cantidad de billetes de 50000");
        billetes1 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa la cantidad de billetes de 20000");
        billetes2 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa la cantidad de billetes de 10000");
        billetes3 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa la cantidad de billetes de 5000");
        billetes4 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa la cantidad de billetes de 2000");
        billetes5 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa la cantidad de billetes de 1000");
        billetes6 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa la cantidad de billetes de 500");
        billetes7 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa la cantidad de billetes de 100");
        billetes8 = Integer.parseInt(System.console().readLine());
        billetes1 = billetes1 * 50000;
        billetes2 = billetes2 * 20000;
        billetes3 = billetes3 * 10000;
        billetes4 = billetes4 * 5000;
        billetes5 = billetes5 * 2000;
        billetes6 = billetes6 * 1000;
        billetes7 = billetes7 * 500;
        billetes8 = billetes8 * 100;
        int total = billetes1 + billetes2 + billetes3 + billetes4 + billetes5 + billetes6 + billetes7 + billetes8;
        System.out.println("El total de dinero en el cajero es: " + total);
    }
}
