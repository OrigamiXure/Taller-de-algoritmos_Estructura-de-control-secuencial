/*Un vendedor recibe un sueldo base, más un 10% extra por comisiones de sus ventas. El vendedor
desea saber cuánto dinero obtendrá por concepto de comisiones por las tres ventas que realizó en
el mes y el total que recibirá tomando en cuenta su sueldo base y sus comisiones. */

public class Ejercicio_3 {
    public static void main (String[] args){
        int sueldo_base;
        double comisiones;
        double comisiones_mes;
        double sueldo_total;
        System.out.println("Ingresa el sueldo base");
        sueldo_base = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa el numero de comisiones del mes");
        comisiones = Double.parseDouble(System.console().readLine());
        comisiones_mes = sueldo_base * comisiones * 0.10;
        System.out.println("Dinero obtenido por comisiones: " + comisiones_mes);
        sueldo_total = sueldo_base + comisiones_mes;
        System.out.println("El sueldo total es: " + sueldo_total);
    }
}