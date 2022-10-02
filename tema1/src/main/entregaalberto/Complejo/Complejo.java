package main.entregaalberto.Complejo;

public class Complejo {
    
    /*Atributos*/
    private double dPReal;
    private double dPImag;
    /*Constructor */
    public Complejo() {
        
    }
    
   
    /*Metodos */
    public void asignar(double x, double y) {
        this.dPReal= x;
        this.dPImag= y;
    };
    public void sumar(Complejo a, Complejo b){
        this.dPReal=a.getdPReal()+b.getdPReal();
        this.dPImag=a.getdPImag()+b.getdPImag();
    };
    public void imprimir(){
        System.out.println("parte real= "+this.dPReal);
        System.out.println("parte imaginaria= "+this.dPImag);
        
    };

    /*getters and setters */
    public double getdPReal() {
        return dPReal;
    }

    public void setdPReal(double dPReal) {
        this.dPReal = dPReal;
    }

    public double getdPImag() {
        return dPImag;
    }

    public void setdPImag(double dPImag) {
        this.dPImag = dPImag;
    }

}
