/*Calcule y muestre, a un alumno, cuál será su promedio general en las tres materias más difíciles que
cursa y cuál será el promedio que obtendrá en cada una de ellas. Estas materias se evalúan como se
muestra a continuación:

Matemática Examen 90% y 10% del promedio de tres tareas.
Física Examen 80% y 20% del promedio de dos tareas.
Química Examen 85% y 15% del promedio de tres tareas. */

public class Ejercicio_12 {
    public static void main (String[] argus){
        double calificacion_matematica;
        double promedio_tareas_matematica;
        double examen_matematica;
        System.out.println("Ingresa el promedio de la calificacion de las tareas de matematicas");
        promedio_tareas_matematica = Double.parseDouble(System.console().readLine());
        System.out.println("Ingresa la calificacion del examen de matematicas");
        examen_matematica = Double.parseDouble(System.console().readLine());
        calificacion_matematica = (promedio_tareas_matematica * 0.10) + (examen_matematica * 0.90);
        System.out.println("La calificacion final de matematicas es: " + calificacion_matematica);
        double calificacion_fisica;
        double promedio_tareas_fisica;
        double examen_fisica;
        System.out.println("Ingresa el promedio de la calificacion de las tareas de fisica");
        promedio_tareas_fisica = Double.parseDouble(System.console().readLine());
        System.out.println("Ingresa la calificacion del examen de fisica");
        examen_fisica = Double.parseDouble(System.console().readLine());
        calificacion_fisica = (promedio_tareas_fisica * 0.20) + (examen_fisica * 0.80);
        System.out.println("La calificacion final de fisica es: " + calificacion_fisica);
        double calificacion_quimica;
        double promedio_tareas_quimica;
        double examen_quimica;
        System.out.println("Ingresa el promedio de la calificacion de las tareas de quimica");
        promedio_tareas_quimica = Double.parseDouble(System.console().readLine());
        System.out.println("Ingresa la calificacion del examen de quimica");
        examen_quimica = Double.parseDouble(System.console().readLine());
        calificacion_quimica = (promedio_tareas_quimica * 0.15) + (examen_quimica * 0.85);
        System.out.println("La calificacion final de quimica es: " + calificacion_quimica);
        double promedio_final;
        promedio_final = (calificacion_matematica + calificacion_fisica + calificacion_quimica) / 3;
        System.out.println("El promedio final es: " + promedio_final);
    }
}
