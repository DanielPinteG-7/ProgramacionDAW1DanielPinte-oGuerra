package modelo;

import java.util.List;
import java.util.stream.Collectors;

public class NombresAlumnos {
    public static void main(String[] args) {
        List<Alumno> alumnos = ListaAlumnos.obtenerListaAlumnos();
        List<String> nombres = alumnos.stream()
                                    .map(Alumno::getNombre)
                                    .collect(Collectors.toList());
        System.out.println("\n- Lista de nombres de alumnos:");
        nombres.forEach(System.out::println);
    }
}