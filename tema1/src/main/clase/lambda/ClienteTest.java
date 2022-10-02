package main.clase.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ClienteTest {
    
    public static void main(String[] args) {
    Cliente cli1= new Cliente("Ada", "Lovelace", 51);
    Cliente cli2= new Cliente("Alan", "Turing", 25);
    Cliente cli3= new Cliente("Margaret", "Hamilton", 42);
    Cliente cli4= new Cliente("Ken", "Thomson", 18);
    Cliente cli5= new Cliente("James", "Gosling", 34);

    //Incluir los clientes en una lista
    List<Cliente> listaClientePrueba1 = Arrays.asList(cli1,cli2,cli3,cli4,cli5);
        System.out.println("Lista de clientes antes de ordenar= "+listaClientePrueba1);
        //ordenamos los clientes
        listaClientePrueba1.sort(new ClientesEdadComparator());
        System.out.println("Lista de clientes despues de ordenar= "+listaClientePrueba1);

        //solucion 2 con inner class
        List<Cliente> listaClientePrueba2 = Arrays.asList(cli1,cli2,cli3,cli4,cli5);
        listaClientePrueba2.sort(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente o1,Cliente o2)
            {
                return o1.getiEdad() > o2.getiEdad()?1:-1;
            }
        });
        System.out.println("Lista de clientes 2 despues de ordenar= "+listaClientePrueba2);

        //Solucion 3 con java lambda
        //expresion lambda suma (A,B) -> A+B
        List<Cliente> listaClientePrueba3 = Arrays.asList(cli1,cli2,cli3,cli4,cli5);
        listaClientePrueba3.sort((Cliente o1,Cliente o2) -> {
            return o1.getiEdad() > o2.getiEdad()?1:-1;
            });
        System.out.println("Lista de clientes 3 despues de ordenar= "+listaClientePrueba3);
        //Solucion 4 con jaba lambda simplificada
        List<Cliente> listaClientePrueba4 = Arrays.asList(cli1,cli2,cli3,cli4,cli5);
        listaClientePrueba4.sort((o1,o2) -> {
            return o1.getiEdad() > o2.getiEdad()?1:-1;
        });
        System.out.println("Lista de clientes 4 despues de ordenar= "+listaClientePrueba4);
        //Solucion 5 con java lambda super simplificada
        List<Cliente> listaClientePrueba5 = Arrays.asList(cli1,cli2,cli3,cli4,cli5);
        listaClientePrueba5.sort((o1,o2) -> o1.getiEdad() > o2.getiEdad()?1:-1);
        System.out.println("Lista de clientes 5 despues de ordenar= "+listaClientePrueba5);

        //ordena por nombre
        List<Cliente> listaClientePrueba6 = Arrays.asList(cli1,cli2,cli3,cli4,cli5);
        listaClientePrueba6.sort((o1,o2) -> o1.getsNombre().compareTo(o2.getsNombre()));
        System.out.println("Lista de clientes 6 despues de ordenar por nombre= "+listaClientePrueba6);

        //quitar los nombres que empiezan porn A

        List<Cliente> listaClientePrueba7 = Arrays.asList(cli1,cli2,cli3,cli4,cli5);
        ArrayList<Cliente> lista7Aux = new ArrayList<Cliente>(listaClientePrueba7);
        lista7Aux.removeIf(o1 -> o1.getsNombre().startsWith("A"));
        System.out.println("Lista de clientes sin A= "+lista7Aux);

        //quitar los mayores de 30
        List<Cliente> listaClientePrueba8 = Arrays.asList(cli1,cli2,cli3,cli4,cli5);
        ArrayList<Cliente> lista8Aux = new ArrayList<Cliente>(listaClientePrueba8);
        lista8Aux.removeIf(n -> (n.getiEdad()>30));
        System.out.println("Lista de clientes sin >30= "+lista8Aux);
       
    }
    
    
}
