import java.util.Scanner;

public class Ejercicio8{
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese nombre y apellido: ");
    String nombreyA = scan.nextLine();
    System.out.println("Edad: ");
    int edad = scan.nextInt();
    System.out.println("Direccion: ");
    String direccion = scan.nextLine();
    System.out.println("iudad: ");
    String ciudad = scan.nextLine();
    Persona persona1 = new Persona(nombreyA, edad, direccion, ciudad);
    scan.close();
    System.out.println(persona1);
    }
}
class Persona{
   String nombreyA;
   int edad;
   String direccion;
   String ciudad;

   public Persona(String nombreyA, int edad, String direccion, String ciudad){
       this.nombreyA = nombreyA;
       this.edad = edad;
       this.direccion = direccion;
       this.ciudad = ciudad;
   }
   @Override
   public String toString() {
       return ciudad + " - " + direccion + " - " + edad + " - " + nombreyA;
   }
}