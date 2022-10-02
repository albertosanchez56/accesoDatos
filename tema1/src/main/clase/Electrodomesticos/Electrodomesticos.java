package main.clase.Electrodomesticos;

public class Electrodomesticos {
    
    private String marca;
    private String modelo;
    private Double precio;
    private String color;
    private Double potencia_watios;
    private int horas_dia;
    private int diasSemana;
    private Double precioEnergia;

    public Electrodomesticos(){
        this("bosch","7200",400.0,"gris",2300.0,1,3,0.40397);
    }

    public Electrodomesticos(String parammarca, String parammodelo,Double paramprecio){

    }

    public Electrodomesticos(String parammarca, String parammodelo, Double paramprecio, String paramcolor, Double parampotencia_watios,
            int paramhoras_dia, int paramdiasSemana, Double paramprecioEnergia) {
        this.marca = parammarca;
        this.modelo = parammodelo;
        this.precio = paramprecio;
        this.color = paramcolor;
        this.potencia_watios = parampotencia_watios;
        this.horas_dia = paramhoras_dia;
        this.diasSemana = paramdiasSemana;
        this.precioEnergia = paramprecioEnergia;
    }

    
    private double ConsumoAnual() {
        double consumo=(this.potencia_watios*this.precioEnergia)*8760;
        return consumo;
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPotencia_watios() {
        return potencia_watios;
    }

    public void setPotencia_watios(Double potencia_watios) {
        this.potencia_watios = potencia_watios;
    }

    public int getHoras_dia() {
        return horas_dia;
    }

    public void setHoras_dia(int horas_dia) {
        this.horas_dia = horas_dia;
    }

    public int getDiasSemana() {
        return diasSemana;
    }

    public void setDiasSemana(int diasSemana) {
        this.diasSemana = diasSemana;
    }

    public Double getPrecioEnergia() {
        return precioEnergia;
    }

    public void setPrecioEnergia(Double precioEnergia) {
        this.precioEnergia = precioEnergia;
    }

    @Override
    public String toString() {
        return "Electrodomesticos [color=" + color + ", diasSemana=" + diasSemana + ", horas_dia=" + horas_dia
                + ", marca=" + marca + ", modelo=" + modelo + ", potencia_watios=" + potencia_watios + ", precio="
                + precio + ", precioEnergia=" + precioEnergia + "]";
    }
    
    
}
