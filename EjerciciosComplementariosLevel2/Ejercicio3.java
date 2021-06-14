/* Ejercicio 3 : 
Crear una lista que contenga como elementos la numeraci�n de cartas de una baraja francesa (solo los valores, no figuras). 
Se deber� cargar el ArrayList (en orden), imprimir, imprimir en orden inverso (reverse), 
desordenar (mezclar) el arrayList y volver a imprimir.*/ 

import java.util.Collections;
import java.util.ArrayList;


public class Ejercicio3 {
    public static void main(String[] args) {

        ArrayList<String> cartas = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            cartas.add("Carta nro: " + (i + 1) + (" "));
        }

        System.out.println("Impresion en orden");
        cartas.forEach(System.out::print);
        

        Collections.reverse(cartas);
        System.out.println(" ");
        System.out.println("Impresion en reverso");
        cartas.forEach(System.out::print);


        Collections.shuffle(cartas);
        System.out.println(" ");
        System.out.println("Impresion en desorden (aleatorio)");
        cartas.forEach(System.out::print);
    }
}
