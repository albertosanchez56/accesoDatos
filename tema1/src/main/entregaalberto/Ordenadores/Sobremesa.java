package main.entregaalberto.Ordenadores;

public class Sobremesa extends Ordenadores{
    

    protected static final String DESCRIPCION_TIPO="torre";
    private String sDesTipo;

    

    public Sobremesa(String sCodigo, int iRam, String sCpu, double dPrecio) {
        super(sCodigo, iRam, sCpu, dPrecio);
        this.sDesTipo = DESCRIPCION_TIPO;
    }


    @Override
    public String toString() {
        return super.toString()+ "Sobremesa [sDesTipo=" + sDesTipo + "]";
    }

    

}
