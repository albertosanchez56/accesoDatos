package main.entregaalberto.Complejo;

public class ComplejoTest {
    public static void main(String[] args) {
        Complejo complejo1 = new Complejo();
        Complejo complejo2 = new Complejo();
        Complejo complejo3 = new Complejo();
        System.out.println("Complejo creado");

        complejo1.asignar(10.3, 50.1);
        System.out.println("Complejo 1");
        complejo1.imprimir();
        complejo2.asignar(20.6, 5.5);
        System.out.println("Complejo 2");
        complejo2.imprimir();
        complejo3.sumar(complejo1, complejo2);
        System.out.println("Complejo 3");
        complejo3.imprimir();
    }
}
