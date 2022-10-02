package main.entregaalberto.Ordenadores;

public class Portatiles extends Ordenadores{

    private int iPeso;

    public Portatiles(String sCodigo, int iRam, String sCpu, double dPrecio, int iPeso) {
        super(sCodigo, iRam, sCpu, dPrecio);
        this.iPeso=iPeso;
    }

    @Override
    public String toString() {
        return super.toString() +"Portatiles [iPeso=" + iPeso + "]";
    }

    

   



    

    
    
}
