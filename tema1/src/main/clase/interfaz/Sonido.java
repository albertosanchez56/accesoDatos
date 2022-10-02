package main.clase.interfaz;


interface Sonido {

    String sonidoFavorito = new String("olas");

    void emitirSonido();

    default void silencio(){
        System.out.println("------------");
    }
}
