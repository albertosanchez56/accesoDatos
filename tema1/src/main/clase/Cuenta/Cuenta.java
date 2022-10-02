package main.clase.Cuenta;
import java.util.Scanner;

public class Cuenta {

    private String dni;
    private String nombre; 
    private double saldo;
    private double dinero;
    private double cuenta=0;
    private String salida;
    private static int iMretirar = 3000;
    private static int iMingresar = 6000;
 
    Scanner sc = new Scanner(System.in);
    

    public String getDni() {
        return dni;
    }


    public void setDni(String dni) {
        this.dni = dni;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


    public Cuenta(String dni, String nombre, float saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    
    public boolean ingresarDinero() {
        do{
        System.out.println("introduzca la cantidad de dinero que quiere ingresar");
        dinero = sc.nextDouble();
        
        if(dinero<=iMingresar && cuenta<=iMingresar){
            this.saldo+=dinero;
            System.out.println("Tu cuenta tiene "+this.saldo);
            cuenta+=dinero;
            System.out.println("Si quiere salir escriba exit");
            salida = sc.nextLine();
        }
        else{
            System.out.println("No puedes ingreasar mas de 6000 euros al dia"); 
            
        }
        }while(cuenta<=iMingresar || salida=="exit");
        return true;
    };
    public boolean sacarDinero() {
        
        System.out.println("Cuanto dinero quieres sacar ");
        dinero = sc.nextDouble();
        if(dinero<=saldo){
            if(dinero<=iMretirar){
                this.saldo-=dinero;
            System.out.println("Tu cuenta tiene "+this.saldo);
            }else{
                System.out.println("No puedes retirar mas de 3000 euros al dia"); 
            }

        }else{
            System.out.println("Saldo insuficiente");
        }
        return true;
    };
    public void mostrarSaldo() {
        System.out.println("Tienes "+ this.saldo+" en la cuenta");
    };
    public void transferencia() {};
}
