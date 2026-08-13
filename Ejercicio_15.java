/*Calcular y mostrar el monto total a pagar en un mes de luz eléctrica, teniendo como dato la lectura
anterior, la lectura actual y el costo por kilovatio. */

public class Ejercicio_15 {
    public static void main(String[] argus){
        double lectura_anterior;
        double lectura_actual;
        double costo_por_kwh;
        System.out.println("Ingresa la lectura anterior del medidor");
        lectura_anterior = Double.parseDouble(System.console().readLine());
        System.out.println("Ingresa la lectura actual del medidor");
        lectura_actual = Double.parseDouble(System.console().readLine());
        System.out.println("Ingresa el costo por kWh");
        costo_por_kwh = Double.parseDouble(System.console().readLine());
        double consumo;
        consumo = lectura_actual - lectura_anterior;
        double pago;
        pago = consumo * costo_por_kwh;
        System.out.println("El consumo del mes es: " + consumo + " kWh");
        System.out.println("El pago del mes es: " + pago + " pesos");
    }
}
