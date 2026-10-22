import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Contador {

    // Método main con la lógica de la ejecución del programa. En el implementaremos el método Scanner para pedir al usuario una serie de consonantes y un texto.
    // Se guardarán las consonantes en una lista para luego recorrerlo e ir haciendo las consultas al usuario por cada consonante, estas se añadirán a la lista que creamos.
    // Se pedirá también un texto que se añadirá a este misma lista.
    // Se crea una nueva lista de objetos Lanzador con el objeto vacio. Posteriormente se recorrerá la lista consonante y se creará un nuevo objeto Lanzador con las consonentes y el texto. Esto se añadirá a la nueva lista que activará todos los hilos.
    // Recorremos Lanzador y pararemos todos los hilos.
    //Por último se mostrará la información necesaría que pide el ejercicio.
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
            System.out.println("Hilo de la letra " + h.consonante + " contó: " + h.contadorTexto);
        }

        System.out.println("Total compartido: " + Lanzador.contadorTotal);

    }
}
