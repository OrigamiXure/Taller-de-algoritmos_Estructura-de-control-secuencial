/*Se conoce de un trabajador su nombre, el número de horas normales trabajadas, el pago de una hora
normal y el número de horas extras trabajadas. Además, que, cada hora extra se paga 25% más del
valor de una hora normal. Si se deducen al trabajador sobre el sueldo base 5% del paro forzoso, 2%
de política habitacional y 7% para caja de ahorro. Si se le asignan 25000 Bolívares por actualización
académica, 17300 Bolívares por cada hijo y una prima por hogar de 18000 Bolívares. Calcule y
muestre las asignaciones, las deducciones y el sueldo neto del trabajador. */

public class Ejercicio_11 {
    public static void main(String[] argus){
        int hora_normal;
        double hora_extra; 
        double precio_hora;
        System.out.println("Ingresa el numero de horas normales trabajadas");
        hora_normal = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa el numero de horas extras trabajadas");
        hora_extra = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa el precio por hora");
        precio_hora = Double.parseDouble(System.console().readLine());
        double sueldo_base = ((hora_extra * 0.25 + hora_normal) * precio_hora);
        System.out.println("El sueldo base es: " + sueldo_base + " Bolivares");
        double paro_forzoso = sueldo_base * 0.05;
        System.out.println("El descuento por paro forzoso es: " + paro_forzoso + " Bolivares");
        double politica_habitacional = sueldo_base * 0.07;
        System.out.println("El descuento por politica habitacional es: " + politica_habitacional + " Bolivares");
        double caja_ahorro = sueldo_base * 0.07;
        System.out.println("El descuento por caja de ahorro es: " + caja_ahorro + " Bolivares");
        double deducciones = paro_forzoso + politica_habitacional + caja_ahorro;
        System.out.println("El total de deducciones es: " + deducciones + " Bolivares");
        int actualizacion_academica = 25000;
        System.out.println("El bono por actualizacion academica es: " + actualizacion_academica + " Bolivares");
        int cantidad_hijos;
        System.out.println("Ingresa la cantidad de hijos para calcular el bono por hijo");
        cantidad_hijos = Integer.parseInt(System.console().readLine());
        double bono_hijo = cantidad_hijos * 17300;
        System.out.println("El bono total de hijos es: " + bono_hijo + " Bolivares");
        int prima_hogar = 18000;
        System.out.println("El bono por prima de hogar es: " + prima_hogar + " Bolivares");
        double asignaciones = (actualizacion_academica + bono_hijo + prima_hogar);
        System.out.println("El total de asignaciones es: " + asignaciones + " Bolivares");
        double sueldo_neto = sueldo_base - deducciones + asignaciones;
        System.out.println("El sueldo neto es: " + sueldo_neto + " Bolivares");
    }
}