package vetores;

import java.util.Scanner;

public class MultiplicarVetor {
    public static void main(String[] args) {
        // === SOLICITA 10 NÚMEROS AO USUÁRIO PARA CRIAR UM NOVO VETOR MULTIPLICADO ===
        int[] numeros = new int[10], multiplo = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira 10 números para armazenar.");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Insira o " + (i + 1) + "º número:");
            numeros[i] = sc.nextInt();
            multiplo[i] = numeros[i] * 2;
        }

        sc.close();

        System.out.println("A multiplicação foi:");

        for (int i = 0; i < numeros.length; i ++) {
            System.out.println(numeros[i] + " * 2 = " + multiplo[i]);
        }
    }
}
