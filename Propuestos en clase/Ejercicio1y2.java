/*Ejercicio 1:
Crear una función que realice la suma de 2 números dados.
Ejercicio 2:
Realizar una función que calcule el factorial de un número dado.
*/
public class Ejercicio1y2 {
    public static void main(String[] args) {
      System.out.println("Funcion suma: " + sum(2,3));
      System.out.println("Factorial de un numero: " + factorial(5));
    }
   
    public static int sum(int num1, int num2){
      return num1 + num2;
    }
   
    public static int factorial(int num){
      int resultado = num;
      if (num != 1){
        resultado = resultado * factorial(num-1);
      }
      return resultado;
    }

   }
   