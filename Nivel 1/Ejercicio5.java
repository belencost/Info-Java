import java.util.Scanner;

public class Ejercicio5{

    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println(" Ingrese dos numeros enteros para multiplicarlos : ");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        int resultado = 0;

        for (int i= 1; i <= numero1; i++){
                resultado += numero2;
        }
        System.out.println( numero1 + " * " + (numero2) + " = " + (resultado));
        scan.close();
    }
}