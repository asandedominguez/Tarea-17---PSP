import java.awt.*;

public class Lanzador extends Thread{

    String consonante;
    String texto;

    public Lanzador(String consonante, String texto) {
        this.consonante = consonante;
        this.texto = texto;
    }

    @Override
    public void run() {
        for (int i = 0; texto.length() > i; i++) {
            if (consonante.length() == 1 && valido.contains(consonante) && consonante.contains(String.valueOf(texto.charAt(i)))) {
                contador_texto++;
                setContador_total();
            }
        }
    }

    public int contador_texto;
    public static int contador_total = 0;
    public static String valido = "bcdfghjklmnñpqrstvwxyz";

    public static synchronized void setContador_total() {
        contador_total++;
    }

}
