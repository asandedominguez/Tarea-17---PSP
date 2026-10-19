import java.awt.*;

// Creación de la clase que implementa Thread.
// Se inician 2 variables tipo String
public class Lanzador extends Thread{

    String consonante;
    String texto;

    // Se crea el constructor con estas variables
    public Lanzador(String consonante, String texto) {
        this.consonante = consonante;
        this.texto = texto;
    }

    // Aquí se establace la lógica de funcionamiento. Se recorré la variable texto.
    // Si consonante tiene solo 1 valor, contiene uno de los valores de valido, y contiene uno de los valores de texto se incrementará el contador individual y total mediante un método.
    @Override
    public void run() {
        for (int i = 0; texto.length() > i; i++) {
            if (consonante.length() == 1 && valido.contains(consonante) && consonante.contains(String.valueOf(texto.charAt(i)))) {
                contador_texto++;
                setContador_total();
            }
        }
    }

    // Declaración de variables necesarias. Las que tiene static es porque son comunes a todos los hilos.
    public int contador_texto;
    public static int contador_total = 0;
    public static String valido = "bcdfghjklmnñpqrstvwxyz";

    // Método con el contador que irá aumentando en un valor. Tiene synchronized para que solo 1 hilo puede aumentar el contador
    public static synchronized void setContador_total() {
        contador_total++;
    }

}
