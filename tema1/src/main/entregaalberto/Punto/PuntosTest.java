package main.entregaalberto.Punto;

public class PuntosTest {
    
    public static void main(String[] args) {
        
        Punto pun1 = new Punto(4, 2);
        Punto pun2 = new Punto(6, 9);
        Punto3D pun3d1 = new Punto3D(6, 9, 4);


        pun1.distancia(pun2);
        pun3d1.distancia(pun2);
        pun1.equals(pun3d1);
    }
}
