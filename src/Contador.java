import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Contador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i < 6; i++) {
            System.out.println("Introduce la " + i + "º consonante: ");

            List<String> consonante = new ArrayList<>();
            consonante.add(teclado.nextLine().trim());
        }

        System.out.println("Dame un texto: ");
        String texto = teclado.nextLine().trim();
    }
}
