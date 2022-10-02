package main.clase.Instituto;

public class Profesor extends Personas{

    private String sMateria;

    Profesor (String paramNombre,int paramEdad,String paramAulaAsignada, String sMateria) throws Exception{
        super(paramNombre, paramEdad, paramAulaAsignada);
        this.sMateria=sMateria;
    }

    @Override
    public String toString() {
        return super.toString()+"Profesor [sMateria=" + sMateria + "]";
    }

    public String getsMateria() {
        return sMateria;
    }
    
    
}
