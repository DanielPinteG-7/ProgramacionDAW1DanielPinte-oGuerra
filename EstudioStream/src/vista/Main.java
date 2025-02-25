package vista;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Gestion de alumnos ***");
        

        System.out.println("\n- Lista completa de alumnos");
        ListaAlumnos.obtenerListaAlumnos().forEach(System.out::println);
        

        FiltrarAlumnos.main(args);
        

        NombresAlumnos.main(args);
        

        OrdenarAlumnos.main(args);
        
	
        AgruparPorCurso.main(args);
    }
}
