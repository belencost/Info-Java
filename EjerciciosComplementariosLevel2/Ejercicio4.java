import java.util.List;
import java.util.ArrayList;

/*Ejercicio 4 :
Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos en 3 cursos (3 arrayList) 
e imprimir dichos cursos.*/

public class Ejercicio4 {
    public static void main(String[] args) {
    ArrayList <String> estudiantes = new ArrayList<> ();
    
    estudiantes.add("Margarita Belozo");
    estudiantes.add("Mario Benitez");
    estudiantes.add("Enzo Baez");
    estudiantes.add("Bruno Gonzalez");
    estudiantes.add("Milagros Mirasoles");
    estudiantes.add("Juan Perez");
    estudiantes.add("Tadeo Orcola");
    estudiantes.add("Tatiana Miro");
    estudiantes.add("Ludmila Bravo");
    estudiantes.add("Sofia Erenio");
    estudiantes.add("Estefania Bottaro");
    estudiantes.add("Mateo Gauna");
    estudiantes.add("Ezequiel Ortiz");

    List<String> primerCurso = estudiantes.subList(0,4);
    List<String> segundoCurso = estudiantes.subList(4,8);
    List<String> tercerCurso = estudiantes.subList(8, estudiantes.size());

    System.out.println("Curso 1");
    for (String nombreEstudiante : primerCurso) {
        System.out.println(nombreEstudiante);
    }

    System.out.println("\nCurso 2");
    for (String nombreEstudiante : segundoCurso) {
        System.out.println(nombreEstudiante);
    }

    System.out.println("\nCurso 3");
    for (String nombreEstudiante : tercerCurso) {
        System.out.println(nombreEstudiante);
    }

}

}
