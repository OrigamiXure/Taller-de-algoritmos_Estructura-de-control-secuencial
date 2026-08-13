/*Calcule qué tanto por ciento anual cobraron por un préstamo de Bolívares X, si se pagaron Bolívares
Y de intereses en 4 años. La fórmula del interés es:

     Capital. Tiempo. Razón
I = ------------------------------
                100 */

public class Ejercicio_20 {
    public static void main (String[] args){
        int capital;
        double interes;
        int tiempo;
        System.out.println("Ingresa el capital");
        capital = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa el interes");
        interes = Double.parseDouble(System.console().readLine());
        System.out.println("Ingresa el tiempo");
        tiempo = Integer.parseInt(System.console().readLine());
        double razon;
        razon = (interes * 100) / (capital * tiempo);
        System.out.println("La razon es: " + razon);
    }
}
