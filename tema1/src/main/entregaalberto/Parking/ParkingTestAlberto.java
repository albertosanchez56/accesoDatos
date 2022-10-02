package main.entregaalberto.Parking;

public class ParkingTestAlberto {

    public static void main(String[] args) {
        
       

        try {
            Vehiculo coch1 = new Vehiculo("5612ACV");
            ParkingVehiculo parKing1 = new ParkingVehiculo("cortes 1 Madrid");

            long dFechaIicio = System.currentTimeMillis();
            System.out.println(dFechaIicio);
            parKing1.hayPlaza();
            parKing1.aparcaCoche(coch1);
            
            Thread.sleep(60*1000);
            parKing1.sacaCoche(coch1);
            
            parKing1.getFactura(coch1);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
}
