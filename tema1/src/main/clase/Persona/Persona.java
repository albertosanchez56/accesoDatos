package main.clase.Persona;

import java.util.Random;

public class Persona {
    
    private String nombre;
    private int edad;
    private String dni;
    private final static char hombre='H';
    private final static char mujer='M';
    private char sexo;
    private double peso;
    private double altura;

    //constructor por defecto (nombre vacío, sexo Hombre y resto a 0).
    public Persona() {
        this("",0,null, hombre,0,0);
    }
    //constructor con nombre, edad, sexo
    public Persona(String paramNombre, int paramEdad,char paramSexo){
        this(paramNombre, paramEdad,null,paramSexo,0,0);
    }
    //constructor con todos los atributos como parámetro.
    public Persona(String paramNombre, int paramEdad, String paramDni, char paramSexo, double paramPeso, double paramAltura) {
        this.nombre = paramNombre;
        this.edad = paramEdad;
        if(null = paramDni)
            this.dni = generarDNI();
        else if (validaDNI(paramDni))
            this.dni=paramDni;
        else
            throw new Exception("DNI incorrecto");
        
        if(validarSexo(paramSexo))
            this.sexo = paramSexo;
        else
            throw new Exception("Sexo no valido");

        this.sexo = paramSexo;
        this.peso = paramPeso;
        this.altura = paramAltura;
    }

    
    public void calcularIMC() {
        double IMC=this.peso/(this.altura*this.altura);

        System.out.println("Tu indice de masa corporal es: "+IMC);
    };
    
    public boolean validarSexo(char paramSexo) {
        return(paramSexo != hombre && paramSexo != mujer) ? false : true;
    };
    private char generarLetraDNI(int valorDni) {
        final int divisor = 23;
        int res = valorDni - (valorDni / divisor * divisor);
         char letras[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
         return letras[res];
    }
    private String generarDNI(){
        //1- genrar num aleatorio de 8 digitos
        int numDNI = (int) Math.floor(Math.random())*(100000000-10000000) + 10000000;
        System.out.println("numDni = "+numDNI);
        //2- calculamos la letra del dni
        char cLetraDNI = generarLetraDNI(numDNI);
        return(Integer.toString(numDNI)+cLetraDNI);
    }
    public void validaDNI() {
      //1-comprobamos que tiene tamaño 9
      //2-substring para quedarnos con los 8 numeros
      //3- calculamos la letra de esos 8 numeros
      //4 comparamos con la letra del parametro
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public static char getHombre() {
        return hombre;
    }

    public static char getMujer() {
        return mujer;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public String toString() {
        return "Persona [altura=" + altura + ", dni=" + dni + ", edad=" + edad + ", nombre=" + nombre + ", peso=" + peso
                + ", sexo=" + sexo + "]";
    };
    
    
    
}
