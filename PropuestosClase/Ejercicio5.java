/*
Dado un archivo de texto (.txt) con el siguiente formato:
{nombre},{apellido},{fecha de nacimiento},{sueldo}

Donde:
Nombre, apellido: String
fecha de nacimiento: Fecha con formato (dia-mes-a�o, ejemplo: 23-05-2021)
Sueldo: es num�rico con decimales.

Ejemplo:
Carlos,Sanchez,20-01-1980,45678.08

Calcular (sobre la lista final):
-M�todo que devuelva todos los empleados que comienzan con una letra dada en el apellido
-M�todo que devuelva el empleado m�s joven y el m�s viejo (necesito una funcion para calcular el a�o basado en una fecha)
-El empleado que m�s gana y el que menos gana.
-(Opcional): Imprimir todos los empleados en orden alfab�tico (por nombre y por apellido).
*/

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ejercicio5 {
    
    public static void main (String[] args){
        File file = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            file = new File("empleados.txt");
            br = new BufferedReader(new FileReader(file));
            String linea; 
            while ((linea = br.readLine()) != null) {
                //Metodo que devuelva ciertos empleados que comiencen con una letra dada
                System.out.println("Funcion letra: " + inicial());
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            try {
                if (null != fr)
                    fr.close();
            } catch (IOException e) {
            e.printStackTrace(); 

            }
        }    

    }
    
}