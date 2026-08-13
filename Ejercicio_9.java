/*Calcular el salario neto de un trabajador en función del número de horas trabajadas, el precio de la
hora y considerando un descuento fijo al sueldo base por concepto de impuestos del 20%. */

public class Ejercicio_9 {
    public static void main(String[] argus){
        int horas;
        int precio_hora;
        int sueldo_bruto;
        double descuento;
        double sueldo_neto;
        System.out.println("Ingresa el numero de horas trabajadas");
        horas = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa el precio por hora");
        precio_hora = Integer.parseInt(System.console().readLine());
        sueldo_bruto = horas * precio_hora;
        descuento = sueldo_bruto * 0.20;
        sueldo_neto = sueldo_bruto - descuento;
        System.out.println("El sueldo neto es: " + sueldo_neto);
    }
}
