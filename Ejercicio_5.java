/*Un alumno desea saber cuál será su calificación final en la materia de computación. Dicha calificación
se compone de los siguientes porcentajes: 55% del promedio de sus tres calificaciones parciales,
30% de la calificación del examen final y 15% de la calificación de un trabajo final. */

public class Ejercicio_5 {
    public static void main (String[] argus){
        double promedio_parciales;
        double examen_final;
        double trabajo_final;
        double calificacion_final;
        System.out.println("Ingresa la calificacion promedio de los parciales");
        promedio_parciales = Double.parseDouble(System.console().readLine());
        System.out.println("Ingresa la calificacion del examen final");
        examen_final = Double.parseDouble(System.console().readLine());
        System.out.println("Ingresa la calificacion del trabajo final");
        trabajo_final = Double.parseDouble(System.console().readLine());
        calificacion_final = (promedio_parciales * 0.55) + (examen_final * 0.30) + (trabajo_final * 0.15);
        System.out.println("La calificacion final es: " + calificacion_final);
    }
}
