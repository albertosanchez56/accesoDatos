package main.clase.Instituto;

import java.util.Arrays;

public class Personas {

   private String sNombre;
   private int iEdad; 
   private String sAulaAsignada;

   public Personas(String paramNombre, int paramEdad, String paramAulaAsignada) throws Exception{
/*comprobar que el profesor esta en la lista de profesores */
/*como se que es un profesor */

    if(this instanceof Profesor)
    {
        //recorremos el array SNombre esta en constantes.LISTA_ALUMNOS ok
        if(Arrays.asList(Constantes.LISTA_PROFESORES).contains(sNombre)){
                this.sNombre= paramNombre;
        }
        else{
            throw new Exception("Ese profesor no existe");
        }
        
    }
    if(this instanceof Alumno)
    {
        if(Arrays.asList(Constantes.LISTA_ALUMNOS).contains(sNombre)){
            this.sNombre= paramNombre;
        }
        else{
        throw new Exception("Ese alumno no existe");
        }
    }
    this.iEdad=paramEdad;
    if(Arrays.asList(Constantes.LISTA_CLASES).contains(paramAulaAsignada)){
        this.sAulaAsignada=paramAulaAsignada;
    }
    else{
        throw new Exception("Esa clase no existe");
    }

    
    
    
   }

public String getsNombre() {
    return sNombre;
}

public void setsNombre(String sNombre) {
    this.sNombre = sNombre;
}

public int getiEdad() {
    return iEdad;
}

public void setiEdad(int iEdad) {
    this.iEdad = iEdad;
}

public String getsAulaAsignada() {
    return sAulaAsignada;
}

public void setsAulaAsignada(String sAulaAsignada) {
    this.sAulaAsignada = sAulaAsignada;
}

@Override
public String toString() {
    return "Personas [iEdad=" + iEdad + ", sAulaAsignada=" + sAulaAsignada + ", sNombre=" + sNombre + "]";
}
    
}
