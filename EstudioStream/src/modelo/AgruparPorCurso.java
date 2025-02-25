package modelo;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgruparPorCurso {
	public static void main(String[] args) {
		List<Alumno> alumnos = ListaAlumnos.obtenerListaAlumnos();
		Map<String, List<Alumno>> alumnosPorCurso = alumnos.stream().collect(Collectors.groupingBy(Alumno::getCurso));
		System.out.println("\n- Alumnos agrupados por curso:");
		alumnosPorCurso.forEach((curso, lista) -> {
			System.out.println(" " + curso + ":");
			lista.forEach(System.out::println);
			System.out.println();
		});
	}
}