package main.entregaalberto.Parking;

import java.time.LocalDate;
import java.time.LocalTime;

interface Parking {
    void hayPlaza();
    LocalTime aparcaCoche(Vehiculo otroVehiculo);
    LocalTime sacaCoche(Vehiculo otroVehiculo);
    double getFactura(Vehiculo otroVehiculo);
}
