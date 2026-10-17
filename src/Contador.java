import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Contador {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<String> consonante = new ArrayList<>();

        for (int i = 1; i < 6; i++) {
            System.out.println("Introduce la " + i + "º consonante: ");
            consonante.add(teclado.nextLine().trim().toLowerCase());
        }

        System.out.println("Dame un texto: ");
        String texto = teclado.nextLine().trim().toLowerCase().repeat(2000);

        List<Lanzador> hilos = new ArrayList <>();
        Lanzador lanzador = null;
        for (String d: consonante) {
            lanzador = new Lanzador(d, texto);
            hilos.add(lanzador);
            lanzador.start();
        }

        for (Lanzador lanzador1 : hilos) {
            try {
                lanzador1.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        for (Lanzador h : hilos) {
            System.out.println("Hilo de la letra " + h.consonante + " contó: " + h.contador_texto);
        }

        System.out.println("Total compartido: " + Lanzador.contador_total);

    }
}
