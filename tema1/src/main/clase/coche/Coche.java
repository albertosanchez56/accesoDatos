package main.clase;

public class Coche {
    
    /*Atributos */
    private String sColor;
    private int iVelocidad;
    private float fTamanyo;

    /*Constructor */
    public Coche(String sColor, int iVelocidad, float fTamanyo) {
        this.sColor = sColor;
        this.iVelocidad = iVelocidad;
        this.fTamanyo = fTamanyo;
    }
    
    public String getsColor() {
        return sColor;
    }

    public void setsColor(String sColor) {
        this.sColor = sColor;
    }

    public int getiVelocidad() {
        return iVelocidad;
    }

    public void setiVelocidad(int iVelocidad) {
        this.iVelocidad = iVelocidad;
    }

    public float getfTamanyo() {
        return fTamanyo;
    }

    public void setfTamanyo(float fTamanyo) {
        this.fTamanyo = fTamanyo;
    }
    
    @Override
    public String toString() {
        return "Coche [fTamanyo=" + fTamanyo + ", iVelocidad=" + iVelocidad + ", sColor=" + sColor + "]";
    }

    /*Metodos */
    public void avanzar() {};
    public void parar() {};
    public void girarIzquierda() {};
    public void girarDerecha() {};

    
}
