/*Suponga que a partir de una Tonelada de maíz una planta productora obtiene M kilogramos de
harina y N litros de aceite. La planta vende cada bulto de 24 paquetes de un kilogramo de harina en
Bs. B1 y cada caja de 15 envases de aceite en Bs. B2. Suponiendo que la planta vende todo lo que
produce, calcular el ingreso total por la venta de cada tonelada de maíz, sabiendo además que cada
kilogramo de harina y cada litro de aceite que restan del embalaje se venden al detal a los precios de
Bs. B3 y Bs. B4 respectivamente. Pruebe su algoritmo o programa con los sig. Valores: M=452,
N=197, B1=132, B2= 180, B3= 7,50 y B4= 14,50. Respuesta: 4895 */

public class Ejercicio_23 {
    public static void main (String[] args) {
        int harina = 452;
        int aceite = 197;
        int bs1 = 132;
        int bs2 = 180;
        double bs3 = 7.50;
        double bs4 = 14.50;
        double bulto_harina = (harina / 24);
        double harina_sobrante = (harina % 24);
        double cajas_aceite = (aceite / 15);
        double aceite_sobrante = (aceite % 15);
        double ingreso = ((bulto_harina * bs1) + (cajas_aceite * bs2) + (harina_sobrante * bs3) + (aceite_sobrante * bs4));
        System.out.println("El ingreso total es: " + ingreso + " bs");
    }
}