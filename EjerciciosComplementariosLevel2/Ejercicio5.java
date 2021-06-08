import java.util.ArrayList;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> horas_trabajadas = new ArrayList<>();
        ArrayList<Integer> valorporhora = new ArrayList<>();
        ArrayList<Integer> totales = new ArrayList<>();
        horas_trabajadas.add(6);
        horas_trabajadas.add(7);
        horas_trabajadas.add(8);
        horas_trabajadas.add(4);
        horas_trabajadas.add(5);

        valorporhora.add(350);
        valorporhora.add(345);
        valorporhora.add(550);
        valorporhora.add(600);
        valorporhora.add(320);

        int resultado = 0;

        for (int i = 0; i < horas_trabajadas.size(); i++) {
            resultado += horas_trabajadas.get(i) * valorporhora.get(i);
            totales.add(horas_trabajadas.get(i) * valorporhora.get(i));
        }
        System.out.println("Subtotales diarios: ");
        totales.stream (). forEach ((s) -> System.out.print (s + " "));
        System.out.println("\nTotal Final: $" + resultado);
    }
}