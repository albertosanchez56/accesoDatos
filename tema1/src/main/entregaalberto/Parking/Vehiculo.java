package main.entregaalberto.Parking;


import java.time.LocalDate;
import java.time.LocalTime;

public class Vehiculo {
    
    private String sMatricula;
    private LocalTime dFechaIicio = LocalTime.now();
    private LocalTime dFechaFin = LocalTime.now();
    public Vehiculo(String sMatricula) {
        this.sMatricula = sMatricula;
    }
    public String getsMatricula() {
        return sMatricula;
    }
    public void setsMatricula(String sMatricula) {
        this.sMatricula = sMatricula;
    }
    public LocalTime getdFechaIicio() {
        return dFechaIicio;
    }
    public void setdFechaIicio(LocalTime dFechaIicio) {
        this.dFechaIicio = dFechaIicio;
    }
    public LocalTime getdFechaFin() {
        return dFechaFin;
    }
    public void setdFechaFin(LocalTime dFechaFin) {
        this.dFechaFin = dFechaFin;
    }
    @Override
    public String toString() {
        return "Vehiculo [sMatricula=" + sMatricula + ", dFechaIicio=" + dFechaIicio + ", dFechaFin=" + dFechaFin + "]";
    }
    
    
    

}
