package modelo;

import java.util.List;
import java.util.Comparator;

public class OrdenarAlumnos {
    public static void main(String[] args) {
        List<Alumno> alumnos = ListaAlumnos.obtenerListaAlumnos();
        System.out.println("\n- Alumnos ordenados por nota:");
        alumnos.stream()
               .sorted(Comparator.comparingDouble(Alumno::getNotaMedia).reversed())
               .forEach(System.out::println);
    }
}
