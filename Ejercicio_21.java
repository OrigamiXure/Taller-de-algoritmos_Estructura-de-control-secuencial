/*Un mayorista compra a un agricultor un lote de X naranjas a Bs. Y la docena. Después de vender
todas las naranjas a los detallistas, obtiene Bs. K. Calcular el porcentaje de ganancia obtenida en la
inversión. Pruebe su programa con los siguientes valores: X=48000, Y=6, K=42000 para obtener 75%
como resultado. */

public class Ejercicio_21 {
    public static void main (String[] args){
        int docenas = 6;
        int naranjas = 48000;
        int bs = 42000;
        int costo;
        costo = (naranjas / 12) * docenas;
        System.out.println("El costo de las naranjas es: " + costo);
        int ganancia;
        ganancia = (bs - costo);
        System.out.println("La ganancia es: " + ganancia);
        int porcentaje_ganancia;
        porcentaje_ganancia = (ganancia * 100) / costo;
        System.out.println("El porcentaje de ganancia es: " + porcentaje_ganancia + "%");
    }
}