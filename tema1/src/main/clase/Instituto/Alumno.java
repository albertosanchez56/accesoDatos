package main.clase.Instituto;

public class Alumno extends Personas {

    private int iNotas;

    public Alumno(String paramNombre, int paramEdad, String paramAulaAsignada, int iNotas) throws Exception {
        super(paramNombre, paramEdad, paramAulaAsignada);
        this.iNotas = iNotas;
    }

    
    @Override
    public String toString() {
        return super.toString()+"Alumno [iNotas=" + iNotas + "]";
    }


    public int getiNotas() {
        return iNotas;
    }


    public void setiNotas(int iNotas) {
        this.iNotas = iNotas;
    }

    
    
}
