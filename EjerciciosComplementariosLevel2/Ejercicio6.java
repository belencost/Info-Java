/*Ejercicio 6: 
Se dispone de una lista de Empleados, de cada empleado se conoce:
-Nombre y Apellido
-DNI
-horasTrabajadas
-valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo (horasTrabajadas x valorPorHora) 
de toda esa lista para luego almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor (value) 
es el sueldo calculado. 
*/ 
import java.util.HashMap;
import java.util.HashSet;

public class Ejercicio6 {
    public static void main(String[] args) {
        HashSet<Empleado> empleadoHashSet = new HashSet<>();
        HashMap<Integer, Float> sueldos = new HashMap<>();

        empleadoHashSet.add(new Empleado("Empleado 1", 12345678, 4, 200));
        empleadoHashSet.add(new Empleado("Empleado 2", 91011121, 8, 300));

        for (Empleado e : empleadoHashSet) {
            sueldos.put(e.getDni(), e.getSueldo());
        }

        sueldos.forEach((dni, sueldo) -> System.out.println("DNI: " + dni + "  Sueldo: " + sueldo));
    }
}

class Empleado {
    String id;
    int dni;
    float horasTrabajadas;
    float valorPorHora;

    public Empleado(String id, int dni, float horasTrabajadas, float valorPorHora) {
        this.id = id;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public int getDni() {
        return dni;
    }

    public float getSueldo() {
        return this.horasTrabajadas * this.valorPorHora;
    }
    
}
