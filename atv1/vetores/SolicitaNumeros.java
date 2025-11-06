package vetores;

import java.util.Scanner;

public class SolicitaNumeros {
    public static void main(String[] args) {
        // === SOLICITA 5 NÚMEROS AO USUÁRIO ===
        int[] numeros = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira 5 números para armazenar.");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Insira o " + (i + 1) + "º número:");
            numeros[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("Os números armazenados foram:");

        for (int i = 0; i < numeros.length; i ++) {
            System.out.println(numeros[i] + ", ");
        }
    }
}
