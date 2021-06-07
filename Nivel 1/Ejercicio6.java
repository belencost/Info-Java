import java.util.Scanner;

public class Ejercicio6{

    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println(" Ingrese dos numeros enteros (El segundo siendo el exponente) : ");
        int numero = scan.nextInt();
        int exponente = scan.nextInt();
        int resultado = 1;

        for (int i= 1; i <= exponente; i++){
                resultado *= numero;
        }
        System.out.println( numero + " elevado a " + (exponente) + " = " + (resultado));
        scan.close();
    }
}