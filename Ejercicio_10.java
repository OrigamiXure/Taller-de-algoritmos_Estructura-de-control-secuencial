/*El cambio de divisas en la bolsa de Madrid el 25/08/1987 fue el siguiente

       100 chelines austríacos = 956.871 pesetas
       1 dólar EEUU = 122.499 pesetas
       100 dracmas griegos = 88.607 pesetas
       100 francos belgas = 323.728 pesetas
       1 franco francés = 20.110 pesetas
       1 libra esterlina = 178.938 pesetas
       100 liras italianas = 9.289 pesetas
       
Lea una cantidad en chelines austriacos e imprima el equivalente en pesetas. Lea una
cantidad en dracmas griegos e imprima su equivalente en francos franceses. Finalmente, lea una
cantidad en pesetas e imprima su equivalente en dólares y liras italianas. */

public class Ejercicio_10 {
    public static void main (String[] argus){
        float chelin_austriaco;
        double pesetas;
        System.out.println("Ingresa la cantidad de chelines austriacos");
        chelin_austriaco = Float.parseFloat(System.console().readLine());
        pesetas = chelin_austriaco * 9.56871;
        System.out.println("La cantidad en pesetas es: " + pesetas);
        float dracma_griego;
        double pesetas2;
        System.out.println("Ingresa la cantidad de dracmas griegos");
        dracma_griego = Float.parseFloat(System.console().readLine());
        pesetas2 = dracma_griego * 0.88607;
        double franco_frances;
        franco_frances =  pesetas2 / 20.110;
        System.out.println("La cantidad en francos franceses es: " + franco_frances);
        float pesetas3;
        System.out.println("Ingresa la cantidad de pesetas");
        pesetas3 = Float.parseFloat(System.console().readLine());
        double dolar_EEUU;
        dolar_EEUU = pesetas3 / 122.499;
        System.out.println("La cantidad en dolares es: " + dolar_EEUU);
        double lira_italiana;
        lira_italiana = pesetas3 / 0.09289;
        System.out.println("La cantidad en liras italianas es: " + lira_italiana);
    }
}