package vetores;

import java.util.Scanner;

public class MesclarVetor {
    public static void main(String[] args) {
        // === SOLICITA 5 NÚMEROS AO USUÁRIO ===
        int[] numeros1 = new int[5], numeros2 = new int[5];
        int[] merge = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira 5 números para armazenar o primeiro vetor para a mesclagem.");
        for (int i = 0; i < numeros1.length; i++) {
            System.out.println("Insira o " + (i + 1) + "º número vetor 1:");
            numeros1[i] = sc.nextInt();
            merge[i] = numeros1[i];
        }

        System.out.println("Insira 5 números para armazenar o segundo vetor para a mesclagem.");
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println("Insira o " + (i + 1) + "º número vetor 2:");
            numeros2[i] = sc.nextInt();
            int j = i + 5;
            merge[j] = numeros2[i];
        }

        sc.close();

        System.out.println("A mesclagem foi:");

        for (int i = 0; i < merge.length; i ++) {
            System.out.println(merge[i] + ", ");
        }
    }
}
