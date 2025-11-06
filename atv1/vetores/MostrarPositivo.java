package vetores;

import java.util.Scanner;

public class MostrarPositivo {
    public static void main(String[] args) {
        // === MOSTRA APENAS OS NÚMEROS POSITIVOS DO VETOR ===
        int[] numeros = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira 10 números para o programa mostrar apenas os positivos.");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Insira o " + (i + 1) + "º número:");
            numeros[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("Os números positivos são:");

        for (int i = 0; i < numeros.length; i ++) {
            if (numeros[i] > 0) {
                System.out.println(numeros[i] + ", ");
            }
        }
    }
}
