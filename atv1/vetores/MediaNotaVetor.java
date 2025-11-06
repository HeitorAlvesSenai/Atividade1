package vetores;

import java.util.Scanner;

public class MediaNotaVetor {
    public static void main(String[] args) {
        // === SOLICITA 5 NOTAS PARA A MÉDIA ===
        double media = 0;
        double[] notas = new double[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira 5 notas para armazenar e descobrir a média.");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Insira a " + (i + 1) + "ª nota:");
            notas[i] = sc.nextDouble();
            media += notas[i];
        }

        sc.close();

        System.out.println("A média das notas deram:" + (media / notas.length));
    }
}
