import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Contador {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<String> consonante = new ArrayList<>();

        for (int i = 1; i < 6; i++) {
            System.out.println("Introduce la " + i + "º consonante: ");
            consonante.add(teclado.nextLine().trim());
        }

        System.out.println("Dame un texto: ");
        String texto = teclado.nextLine().trim();


        String coversion_string = String.join("", consonante);
        Lanzador lanzador = new Lanzador(coversion_string, texto);


        lanzador.start();

        try {
            lanzador.join();
        }
        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Total: " + lanzador.GetTotal());
        System.out.println("Prueba: " +  lanzador.convertir());
    }
}
