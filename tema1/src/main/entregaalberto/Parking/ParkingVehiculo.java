package main.entregaalberto.Parking;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
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
        System.out.println("Aparco coche "+otroVehiculo.getdFechaIicio());
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
        System.out.println("saco coche"+otroVehiculo.getdFechaFin());
        aparcaCoche(otroVehiculo);
        // TODO Auto-generated method stub
        LocalTime Fechafin = otroVehiculo.getdFechaFin();
        

        return Fechafin;
       
    }
    @Override
    public double getFactura(Vehiculo otroVehiculo) {
        // TODO Auto-generated method stub
       // Duration diff = Duration.between(aparcaCoche(otroVehiculo),sacaCoche(otroVehiculo));
        //Double sAparacar = Double.valueOf(aparcaCoche(otroVehiculo));
       long diff = ChronoUnit.SECONDS.between(aparcaCoche(otroVehiculo), sacaCoche(otroVehiculo));
       Double dDiff = Double.valueOf(diff);
        System.out.println(dDiff);
        double dFactura=0;
      /* long tiempoTranscurrido = sacaCoche(otroVehiculo).getLong(ChronoField.HOUR_OF_DAY)-aparcaCoche(otroVehiculo).getLong(ChronoField.HOUR_OF_DAY);
       System.out.println(tiempoTranscurrido);*/ 
       return dFactura;
        //double Factura=(sacaCoche(otroVehiculo) - aparcaCoche(otroVehiculo))*PRECIO;
       // System.out.println("La factura son "+Factura+" euros");
    }
}
