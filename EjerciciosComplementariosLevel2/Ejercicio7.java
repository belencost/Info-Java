/* Ejercicio 7 : 
Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), 
nos devuelva un array de Strings. Con la secuencia de números enteros de principio a final. 
Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” 
y si es a la vez múltiplo de ambos colocara “FizzBuzz”. 

Observacion: Los 2 argumentos indican con que valor se arranca a calcular 
y el segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4 
*/
public class Ejercicio7 {
    public static void main(String[] args) {
        String[] array = fizzBuzzFuncion(1, 6);
        for (String s : array) {
            System.out.print(s + " , ");
        }
    }

    public static String[] fizzBuzzFuncion(int primero, int ultimo) {
        if (primero > ultimo)
            throw new RuntimeException("Números inválidos.");

        String[] array = new String[ultimo - 1];
        array[0] = String.valueOf(primero);
        
        for (int i = 1; i < array.length; i++) {
            if (((primero + i) % 2 == 0) && ((primero + i) % 3 == 0)) {
                array[i] = "fizzBuzz";
            } else if ((primero + i) % 3 == 0) {
                array[i] = "Buzz";
            } else if ((primero + i) % 2 == 0) {
                array[i] = "Fizz";
            } else {
                array[i] = String.valueOf(primero + i);
            }

        }

        return array;
    }
}