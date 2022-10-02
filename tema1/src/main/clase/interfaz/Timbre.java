package main.clase.interfaz;

public class Timbre implements Sonido{

    @Override
    public void emitirSonido() {
        // TODO Auto-generated method stub
        System.out.println(sonidoFavorito);
        
        System.out.println("ring ring");
    }
    
    
}
