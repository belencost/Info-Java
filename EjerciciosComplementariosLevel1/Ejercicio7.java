import java.util.Scanner;

public class Ejercicio7{

    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println(" Ingrese una palabra en minusculas : ");
        String palabra = scan.nextLine();
        char letra;

        for(int i = 0; i < palabra.length(); i++ ){
            letra = palabra.charAt(i); //Devuelve la letra en UTF-16 de la posicion i en la palabra que ingrese
            if (letra <= 122 && letra >= 97){
                letra = (char)(letra - 32);
                System.out.print(letra);
            } else {
                System.out.print(letra);
            }
        } 
        scan.close();
    }
}
