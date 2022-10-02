package main.entregaalberto.Punto;

import java.sql.Date;

public class Suceso extends Punto3D{

    private Date dTiempo;
    private String sDescripcion;

    
    public Suceso(int paramx, int paramy, double paramz, Date dTiempo, String sDescripcion) {
        super(paramx, paramy, paramz);
        this.dTiempo = dTiempo;
        this.sDescripcion = sDescripcion;
    }

    
    
}
