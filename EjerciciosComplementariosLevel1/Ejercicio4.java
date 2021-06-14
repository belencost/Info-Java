/* Ejercicio 4 :
Realizar un programa que calcule el factorial de un n�mero:
n! = 1 x 2 x 3 x 4 x 5 x � x (n-1) x n.
Sin hacer uso de librer�as.

*/

import java.util.Scanner;

public class Ejercicio4{

    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println(" Ingrese un numero para generar el factorial: ");
        int numero = scan.nextInt();
        int factorial = 1;

        for (int i= 1; i <= numero; i++){
                factorial *= i;
        }
        System.out.println(" Factorial de " + (numero) + " es = " + (factorial));
        scan.close();
    }
}