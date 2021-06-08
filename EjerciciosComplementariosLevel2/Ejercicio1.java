import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Mendoza");
        lista.add("Cordoba");
        lista.add("Salta");

        for (int i=0;i<lista.size();i++) {

            System.out.println("#"+(i+1)+" - "+lista.get(i));
          }
    }
}