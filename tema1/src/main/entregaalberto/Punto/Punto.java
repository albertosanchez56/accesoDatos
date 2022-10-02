package main.entregaalberto.Punto;

public class Punto {
    
    private int x;
    private int y;


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Punto(int paramx, int paramy) {
        this.x = paramx;
        this.y = paramy;
    }

    public double distancia(Punto otroPunto){

        double distancia=Math.sqrt(Math.pow(otroPunto.getX() - this.x, 2)) +(Math.pow(otroPunto.getY() -  this.y, 2));

        System.out.println(distancia);
    
        return distancia;
    }
    

}
