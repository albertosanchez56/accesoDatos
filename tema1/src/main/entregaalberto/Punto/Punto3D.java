package main.entregaalberto.Punto;

public class Punto3D extends Punto{

    private double z;

    public Punto3D(int paramx, int paramy, double paramz) {
        super(paramx, paramy);
        this.z= paramz;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public double distancia(Punto otroPunto) {
        // TODO Auto-generated method stub
       // double distancia=Math.sqrt(Math.pow(otroPunto.getX() - paramx, 2)) +(Math.pow(otroPunto.getY() -  this.y, 2));
        double distancia = Math.sqrt(Math.pow(otroPunto.getX() - this.getX(),2))+(Math.pow(otroPunto.getY() -  this.getY(), 2))+(Math.pow(this.z, 2));
        System.out.println(distancia);
        return distancia;
    }

    
    

}
