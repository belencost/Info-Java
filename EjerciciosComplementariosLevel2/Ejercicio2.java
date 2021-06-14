/* Ejercicio 2 :
Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al principio de la lista 
y otro al final. Por último, iterar e imprimir los elementos de la lista 
y el tamaño de la misma (antes y después de agregar a en la primera y última posición). */ 

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
    
        System.out.println("Tamaño de la lista original: " + lista.size());

        lista.add(0, 0);
        lista.add(0);
        System.out.println("Tamaño de la lista modificada: " + lista.size());

    }
}