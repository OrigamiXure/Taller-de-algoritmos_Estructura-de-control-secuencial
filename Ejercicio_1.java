/*Obtener el promedio de edad de tres personas. */

public class Ejercicio_1 {
    public static void main (String[]  args) {

        int edad1;
        int edad2;
        int edad3;
        int promedioedad;

        System.out.println("Ingrese la edad de la primera persona");

        edad1 = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese la edad de la segunda persona");

        edad2 = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese la edad de la tercera persona");

        edad3 = Integer.parseInt(System.console().readLine());

        promedioedad = edad1 + edad2 + edad3 / 3;

        System.out.println("El promedio de edad es: " + promedioedad);
    }
}