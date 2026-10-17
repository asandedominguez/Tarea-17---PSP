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
            if (consonante.contains(String.valueOf(texto.charAt(i)))) {
                contador_texto++;
                contador_total++;
            }
        }
        texto_array = texto.toCharArray();
    }

    public int contador_texto;
    public char [] texto_array;
    public static int contador_total = 0;
}
