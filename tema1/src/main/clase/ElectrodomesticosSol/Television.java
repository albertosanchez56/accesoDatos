package main.clase.ElectrodomesticosSol;

public class Television extends Electrodomesticos{
    
    //constantes;
    private static final int RESOLCION_BASE=30;
    //atibutos
    private int iResolucion;
    //constructor
    public Television(){
        this(RESOLCION_BASE);
    }
    public Television(int paramResolucion){
        super(MARCA_BASE,MODELO_BASE,PRECIO_ELECTRO_BASE,COLOR_BASE,POTENCIA_BASE,HORAS_BASE,DIAS_BASE,PRECIO_ENERGIA_BASE );
        this.iResolucion=paramResolucion;
        
    }
    
    public int getiResolucion() {
        return iResolucion;
    }
    public void setiResolucion(int iResolucion) {
        this.iResolucion = iResolucion;
    }
    //metodos
    @Override
    public double consumoAnual() {
        // TODO Auto-generated method stub
        double dConsumo = super.consumoAnual();
        if(iResolucion>50)
            dConsumo+=30;
        return dConsumo;
        
    }

    

    
}
