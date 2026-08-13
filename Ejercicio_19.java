/*En un hospital rural existen tres áreas: Ginecología, Pediatría y Traumatología. El presupuesto anual
del hospital se reparte conforme a la siguiente tabla:
Área Porcentaje del presupuesto

      Ginecología 40%
      Traumatología 30%
      Pediatría 30%

Obtener la cantidad de dinero que recibirá cada área, para cualquier monto presupuestado. */

public class Ejercicio_19 {
    public static void main (String[] args) {
        int presupuesto;
        double ginecologia;
        double traumatologia;
        double pediatria;
        System.out.println("Ingresa el presupuesto del hospital");
        presupuesto = Integer.parseInt(System.console().readLine());
        ginecologia = presupuesto * 0.40;
        traumatologia = presupuesto * 0.30;
        pediatria = presupuesto * 0.30;
        System.out.println("El presupuesto para ginecologia es: " + ginecologia);
        System.out.println("El presupuesto para traumatologia es: " + traumatologia);
        System.out.println("El presupuesto para pediatria es: " + pediatria);
    }
}