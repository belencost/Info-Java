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