package main.clase.lambda;

public class Cliente {
    /*atributos */
    private String sNombre;
    private String sApellidos;
    private int iEdad;
    /*Constructor */
    public Cliente(String sNombre, String sApellidos, int iEdad) {
        this.sNombre = sNombre;
        this.sApellidos = sApellidos;
        this.iEdad = iEdad;
    }
    public String getsNombre() {
        return sNombre;
    }
    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }
    public String getsApellidos() {
        return sApellidos;
    }
    public void setsApellidos(String sApellidos) {
        this.sApellidos = sApellidos;
    }
    public int getiEdad() {
        return iEdad;
    }
    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }
    @Override
    public String toString() {
        return "Cliente [iEdad=" + iEdad + ", sApellidos=" + sApellidos + ", sNombre=" + sNombre + "]";
    }
    
    /*metodos */
}
