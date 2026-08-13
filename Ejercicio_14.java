/*El siguiente sistema de ecuaciones lineales:

aX + bY = c
dX + eY = f

se resuelve con las fórmulas:

     ce - bf       af - cd
X = --------- Y = --------- calcule y muestre el valor de X e Y.
     ae – bd       ae – bd */

public class Ejercicio_14 {
    public static void main(String[] argus){
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        System.out.println("Ingresa el valor de a");
        a = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa el valor de b");
        b = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa el valor de c");
        c = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa el valor de d");
        d = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa el valor de e");
        e = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa el valor de f");
        f = Integer.parseInt(System.console().readLine());
        double x;
        double y;
        x = (c*e - b*f) / (a*e - b*d);
        y = (a*f - c*d) / (a*e - b*d);
        System.out.println("El valor de x es: " + x);
        System.out.println("El valor de y es: " + y);
    }
}