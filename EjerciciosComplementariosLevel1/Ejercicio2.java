/* Ejercicio 2 :
Realizar un programa que solicite por consola 2 n�meros enteros.
Para luego imprimir el resultado de la suma, resta, multiplicaci�n, 
divisi�n y m�dulo (resto de la divisi�n) de ambos n�meros.
*/

import java.util.Scanner;

public class Ejercicio2{

    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println(" Ingrese dos numeros enteros ");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        int suma = numero1+numero2;
        int resta = numero1-numero2;
        int multi = numero1*numero2;
        int divi = numero1/numero2;
        int porc = numero1%numero2;
        System.out.println(numero1 + " + " + numero2 + " = " + suma);
        System.out.println(numero1 + " - " + numero2 + " = " + resta);
        System.out.println(numero1 + " * " + numero2 + " = " + multi);
        System.out.println(numero1 + " / " + numero2 + " = " + divi);
        System.out.println(numero1 + " % " + numero2 + " = " + porc);
        scan.close();
    }
}