/*Calcule el área de un triángulo en función de las longitudes de sus lados, utilizando la fórmula:
√p(p­a)(p­b)(p­c) donde p = (a+b+c) / 2 */

public class Ejercicio_8 {
    public static void main (String[] argus){
        int lado1;
        int lado2;
        int lado3;
        double area;
        System.out.println("Ingresa la longitud del primer lado del triangulo");
        lado1 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa la longitud del segundo lado del triangulo");
        lado2 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa la longitud del tercer lado del triangulo");
        lado3 = Integer.parseInt(System.console().readLine());
        area = (lado1 + lado2 + lado3) / 2;
        area = Math.sqrt(area * (area - lado1) * (area - lado2) * (area - lado3));
        System.out.println("El area del triangulo es: " + area);
    }
}