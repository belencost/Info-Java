/* Ejercicio 1 :
Solicitar por consola el nombre del usuario e imprimir por pantalla
el siguiente mensaje “HOLA {USUARIO}!!!”
*/

import java.util.Scanner;

public class Ejercicio1{

    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println(" Ingrese un nombre ");
        String usuario = scan.nextLine();
        System.out.println("HOLA " + usuario + " !!!");
        scan.close();
    }
}