package main.clase.lambda;

import java.util.Comparator;

public class ClientesEdadComparator implements Comparator<Cliente> {

    @Override
    public int compare(Cliente o1, Cliente o2) {
        //Si A > B devolver 1, si A=B 0, si no -1
        return o1.getiEdad() > o2.getiEdad()?1:-1;
    }


    
}
