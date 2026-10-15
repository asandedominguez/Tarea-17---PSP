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
        String letras = "bcdfghjklmnñpqrstvwxyz";
        for (int e = 0; consonante.length() > e; e++) {
            if (letras.contains(String.valueOf(consonante.charAt(e)))) {
                contador++;
            }
        }
        for (int i = 0; texto.length() > i; i++) {
            if (letras.contains(String.valueOf(texto.charAt(i)))) {
                contador_texto++;
            }
        }
        texto_array = texto.toCharArray();
        for (int h = 0; h < texto_array.length; h++) {
            if (letras.contains(String.valueOf(texto_array[h]))) {
                suma++;
                resultado = texto_array[h];
            }
        }
    }

    public int contador;
    public int contador_texto;
    public int suma;
    public char [] texto_array;
    public char resultado;

    public int GetTotal() {
        return contador + contador_texto;
    }

    public Valores convertir() {
        return new Valores(this.suma, this.resultado);
    }

    public static class Valores {
        public final int suma;
        public final char resultado;

        public Valores(int suma, char resultado) {
            this.suma = suma;
            this.resultado = resultado;
        }
    }

    @Override
    public String toString() {
        return suma +  " " + resultado;
    }


}
