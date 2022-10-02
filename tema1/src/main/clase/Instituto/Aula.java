package main.clase.Instituto;

import java.util.ArrayList;
import java.util.Iterator;

public class Aula {
    
    private String sNombreAula;
    private ArrayList<Profesor> listaProfesores;
    private ArrayList<Alumno> listaAlumnos;
    private ArrayList<String> listaMaterias;

    Aula(String paramNombreAula,ArrayList<Profesor> paramProfesores,ArrayList<Alumno> paramAlumno) throws Exception{
        this.sNombreAula=paramNombreAula;
        this.listaProfesores=paramProfesores;
        if(Constantes.MAX_ESTUDIANTES > paramAlumno.size()){
            this.listaAlumnos = paramAlumno;
        }else{
            throw new Exception("Superado máximo de alumnos");
        }
        
        cargarListaMaterias();

    }

    private void cargarListaMaterias(){
        this.listaMaterias = new ArrayList<String>();
        //Recorro la lista de profesores
        Iterator<Profesor> iter = listaProfesores.iterator();
        while(iter.hasNext()){
            Profesor profeAux = iter.next();
            this.listaMaterias.add(profeAux.getsMateria());
        }

    }

    public String getsNombreAula() {
        return sNombreAula;
    }

    public void setsNombreAula(String sNombreAula) {
        this.sNombreAula = sNombreAula;
    }

    public ArrayList<Profesor> getListaProfesores() {
        return listaProfesores;
    }

    public void setListaProfesores(ArrayList<Profesor> listaProfesores) {
        this.listaProfesores = listaProfesores;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public ArrayList<String> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(ArrayList<String> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    @Override
    public String toString() {
        return "Aula [listaAlumnos=" + listaAlumnos + ", listaMaterias=" + listaMaterias + ", listaProfesores="
                + listaProfesores + ", sNombreAula=" + sNombreAula + "]";
    }
    
    
}
