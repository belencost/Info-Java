/*
Dado un archivo de texto (.txt) con el siguiente formato:
{nombre},{apellido},{fecha de nacimiento},{sueldo}

Donde:
Nombre, apellido: String
fecha de nacimiento: Fecha con formato (dia-mes-año, ejemplo: 23-05-2021)
Sueldo: es numérico con decimales.

Ejemplo:
Carlos,Sanchez,20-01-1980,45678.08

Calcular (sobre la lista final):
-Método que devuelva todos los empleados que comienzan con una letra dada en el apellido
-Método que devuelva el empleado más joven y el más viejo (necesito una funcion para calcular el año basado en una fecha)
-El empleado que más gana y el que menos gana.
-(Opcional): Imprimir todos los empleados en orden alfabético (por nombre y por apellido).
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