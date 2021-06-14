/* Ejercicio 9 :
Dado un String de entrada (frase, texto, etc) 
calcular la cantidad de veces que aparece una letra dada.
*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections; 
import java.util.List;


public class Ejercicio9{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra: ");
        String palabra = scan.nextLine();
        System.out.println("Ingrese una letra: ");
        String letra = scan.nextLine();
        int cant = 0;

        List<String> Listpalabra = Arrays.asList(palabra.split(""));

        for(int i = 0; i < palabra.length(); i++){
            
            cant = Collections.frequency(Listpalabra, letra); }
        
        System.out.println(cant);
        scan.close();
    }
    
}