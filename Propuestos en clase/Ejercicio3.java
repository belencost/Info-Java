/*Ejercicio 3:
Dado un archivo de texto (alumnos.txt), crear una función que lea todos los nombres de los alumnos y los imprima por pantalla.
Observación:
Cada línea del archivo representa un nombre de alumno.
*/
import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class Ejercicio3 {
    public static void main(String[] args) {

        File file = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            file = new File("alumnos.txt");
            br = new BufferedReader(new FileReader(file));
            String linea; //variable que guarda la linea
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            try {
                if (null != fr)
                    fr.close();
            } catch (IOException e) {
            e.printStackTrace(); //diagnostica e imprime excepciones si las encuentra

            }
        }
    }
}