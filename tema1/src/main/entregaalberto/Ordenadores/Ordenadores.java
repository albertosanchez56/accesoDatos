package main.entregaalberto.Ordenadores;

public class Ordenadores {
    
    private String sCodigo;
    protected int iRam;
    private String sCpu;
    private double dPrecio;

    public Ordenadores(String sCodigo, int iRam, String sCpu, double dPrecio) {
        this.sCodigo = sCodigo;
        this.iRam = iRam;
        this.sCpu = sCpu;
        this.dPrecio = dPrecio;
    }

    
    @Override
    public String toString() {
        return "Ordenadores [dCpu=" + sCpu + ", dPrecio=" + dPrecio + ", iRam=" + iRam + ", sCodigo=" + sCodigo + "]";
    }

    


}
