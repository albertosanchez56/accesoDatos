package main.entregaalberto.Parking;

public class ParkingTestAlberto {

    public static void main(String[] args) {
        
       

        try {
            Vehiculo coch1 = new Vehiculo("5612ACV");
            Vehiculo coch2 = new Vehiculo("9885HCA");
            Vehiculo coch3 = new Vehiculo("5151HNN");
            Vehiculo coch4 = new Vehiculo("0134VAG");
            Vehiculo coch5 = new Vehiculo("8888GGG");
            ParkingVehiculo parKing1 = new ParkingVehiculo("cortes 1 Madrid");

            
            
            parKing1.hayPlaza();
            parKing1.aparcaCoche(coch1);
            
            Thread.sleep(60*1000);
            parKing1.sacaCoche(coch1);
            
            parKing1.getFactura(coch1);
            System.out.println(coch1);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
}
