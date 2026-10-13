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
            if (String.valueOf(consonante.charAt(e)).equalsIgnoreCase(letras)) {

            }
        }
    }
}
