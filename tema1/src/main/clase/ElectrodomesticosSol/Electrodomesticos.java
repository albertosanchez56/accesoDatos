package main.clase.ElectrodomesticosSol;

public class Electrodomesticos {
    
    protected static final String MARCA_BASE="bosch";
    protected static final String MODELO_BASE="7200";
    protected static final double PRECIO_ELECTRO_BASE=400;
    protected static final String COLOR_BASE="gris";
    protected static final double POTENCIA_BASE=2300;
    protected static final int HORAS_BASE=1;
    protected static final int DIAS_BASE=3;
    protected static final double PRECIO_ENERGIA_BASE=0.40397;

    private String sMarca;
    private String sModel;
    private double dPrecioElectrodom;
    private String sColor;
    private double dPotencia;
    private int iHoras;
    private int iDias;
    private double dPrecioEnergia;

    public Electrodomesticos(){
        this(MARCA_BASE,MODELO_BASE,PRECIO_ELECTRO_BASE,COLOR_BASE,POTENCIA_BASE,HORAS_BASE,DIAS_BASE,PRECIO_ENERGIA_BASE );

    }
    
    public Electrodomesticos(String sMarca, String sModel, double dPrecioElectrodom) {
        this.sMarca = sMarca;
        this.sModel = sModel;
        this.dPrecioElectrodom = dPrecioElectrodom;
    }
    /**
     * 
     * @param sMarca
     * @param sModel
     * @param dPrecioElectrodom
     * @param sColor
     * @param dPotencia
     * @param iHoras
     * @param iDias
     * @param dPrecioEnergia
     */


    public Electrodomesticos(String sMarca, String sModel, double dPrecioElectrodom, String sColor, double dPotencia,
            int iHoras, int iDias, double dPrecioEnergia) {
        this.sMarca = sMarca;
        this.sModel = sModel;
        this.dPrecioElectrodom = dPrecioElectrodom;
        this.sColor = sColor;
        this.dPotencia = dPotencia;
        this.iHoras = iHoras;
        this.iDias = iDias;
        this.dPrecioEnergia = dPrecioEnergia;
    }

    public double consumoAnual(){
        return(this.dPotencia/1000)*iHoras*iDias*dPrecioElectrodom;
    }

    @Override
    public String toString() {
        return "Electrodomesticos [dPotencia=" + dPotencia + ", dPrecioElectrodom=" + dPrecioElectrodom
                + ", dPrecioEnergia=" + dPrecioEnergia + ", iDias=" + iDias + ", iHoras=" + iHoras + ", sColor="
                + sColor + ", sMarca=" + sMarca + ", sModel=" + sModel + "]";
    }

    
}
