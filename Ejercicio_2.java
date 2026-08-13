/*Suponga que un individuo decide invertir su capital en un banco y desea saber cuánto dinero ganará
después de un mes si el banco paga a razón de 2% mensual. */

public class Ejercicio_2 {
    public static void main (String[] argus){
        int capital_invertido;
        double dinero_ganado;
        System.out.println("Ingresa el capital invertido en el banco");
        capital_invertido = Integer.parseInt(System.console().readLine());
        dinero_ganado = capital_invertido * 0.02;
        System.out.println("El dinero ganado del banco es: " + dinero_ganado);
    }
}