package main.entregaalberto.Parking;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class ParkingVehiculo implements Parking {

    protected static final double PRECIO= 0.0425;
    protected static final int MAXIMA_PLAZAS= 100;

    private String sDireccionParking;
    private int iPlazasOcupadas;

    

    public ParkingVehiculo(String sDireccionParking) {
        this.sDireccionParking = sDireccionParking;
    }

    @Override
    public LocalTime aparcaCoche(Vehiculo otroVehiculo) {
        // TODO Auto-generated method stub
       
        iPlazasOcupadas+=1;
        LocalTime fechaini = otroVehiculo.getdFechaIicio();
       
       return fechaini ;
    }

    

    @Override
    public void hayPlaza() {
        if(iPlazasOcupadas<100){
            System.out.println("Hay plaza");
        }else{
            System.out.println("No quedan plazas");
        }
        
    }

    @Override
    public LocalTime sacaCoche(Vehiculo otroVehiculo) {
        
        aparcaCoche(otroVehiculo);
        // TODO Auto-generated method stub
        LocalTime Fechafin = otroVehiculo.getdFechaFin();
        

        return Fechafin;
       
    }
    @Override
    public double getFactura(Vehiculo otroVehiculo) {
        // TODO Auto-generated method stub
    
        long diff = sacaCoche(otroVehiculo).getMinute() -aparcaCoche(otroVehiculo).getMinute();
        Double dDiff = Double.valueOf(diff);
        Double factura = dDiff * PRECIO;
        System.out.println("Debe pagar "+factura+" euros");
       
       return factura;
      
    }
}
