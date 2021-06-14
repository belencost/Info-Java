/* Ejercicio 7 : 
Crear una funci�n que dado 2 argumentos (int, siendo el primero menor al segundo), 
nos devuelva un array de Strings. Con la secuencia de n�meros enteros de principio a final. 
Pero si el n�mero es multiplo de 2 colocara el valor �Fizz�, si es m�ltiplo de 3 �Buzz� 
y si es a la vez m�ltiplo de ambos colocara �FizzBuzz�. 

Observacion: Los 2 argumentos indican con que valor se arranca a calcular 
y el segundo con qu� valor debe frenar (no se incluye en el c�lculo)
Ejemplo: (1, 5) ----> calcular� valores de 1, 2, 3, 4 
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
            throw new RuntimeException("N�meros inv�lidos.");

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