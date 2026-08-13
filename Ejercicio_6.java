/*Un maestro desea saber qué porcentaje de hombres y qué porcentaje de mujeres hay en un grupo
de estudiantes. */

public class Ejercicio_6 {
    public static void main(String[] argus){
        int numero_hombres;
        int numero_mujeres;
        double porcentaje_hombres;
        double porcentaje_mujeres;
        System.out.println("Ingresa el numero de hombres");
        numero_hombres = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa el numero de mujeres");
        numero_mujeres = Integer.parseInt(System.console().readLine());
        porcentaje_hombres = (numero_hombres * 100) / (numero_hombres + numero_mujeres);
        porcentaje_mujeres = (numero_mujeres * 100) / (numero_hombres + numero_mujeres);
        System.out.println("El porcentaje de hombres es: " + porcentaje_hombres + "%");
        System.out.println("El porcentaje de mujeres es: " + porcentaje_mujeres + "%");
    }
}
