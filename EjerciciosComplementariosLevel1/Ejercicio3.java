/* Ejercicio 3 :
Confeccionar un programa que dado un n�mero entero como dato de entrada imprima 
la secuencia de n�meros (incrementos de 1) de la siguiente forma:
*/

import java.util.Scanner;

public class Ejercicio3{

    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println(" Ingrese un numero para generar la secuencia: ");
        int numero = scan.nextInt();

        for (int i= 1; i <= numero; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            
            }
            System.out.println("");
        }
        scan.close();
    }
}