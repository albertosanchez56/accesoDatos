package main.clase.Instituto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InstitutoTest {
    public static void main(String[] args) {
        try {
            Profesor profesorRoberto = new Profesor("Roberto", 30, "2.6", "Programación");
            Profesor profesorJuan = new Profesor("Juan", 31, "2.6", "Lenguaje de Marcas");
            Profesor profesorMiguel = new Profesor("Miguel", 32, "2.7", "Ofimática");
            ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>();
            listaProfesores.add(profesorRoberto);
            listaProfesores.add(profesorJuan);
            listaProfesores.add(profesorMiguel);

            Alumno alumnoPepe = new Alumno("Pepe", 18, "2.6", 5);
            Alumno alumnoFernando = new Alumno("Fernando", 19, "2.6", 4);
            Alumno alumnaLaura = new Alumno("Laura", 20, "2.6", 7);
            Alumno alumnaElena = new Alumno("Elena", 22, "2.7", 2);
            ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
            listaAlumnos.add(alumnoPepe);
            listaAlumnos.add(alumnoFernando);
            listaAlumnos.add(alumnaLaura);
            listaAlumnos.add(alumnaElena);

            //listaProfesores.removeIf(o1 -> o1.getsAulaAsignada().startsWith("2.7"));
            //listaAlumnos.removeIf(o1 -> o1.getsAulaAsignada().startsWith("2.7"));

            Aula aula26 = new Aula("2.6", listaProfesores, listaAlumnos);
            System.out.println("Aula2.6 incluye=" + aula26);

            

        
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
