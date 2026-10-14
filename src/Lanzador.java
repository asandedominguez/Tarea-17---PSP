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
    }

    public int contador;

    public int GetTotal() {
        return contador;
    }
}
