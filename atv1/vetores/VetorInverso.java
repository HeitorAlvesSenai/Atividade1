package vetores;

import java.util.Scanner;

public class VetorInverso {
    public static void main(String[] args) {
        // === SOLICITA UMA SEQUENCIA DE NÚMEROS PARA MOSTRAR A ORDEM INVERSA ===
        int[] numeros = new int[8];
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira 8 números para armazenar e mostrar a ordem inversa.");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Insira o " + (i + 1) + "º número:");
            numeros[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("A ordem inversa é:");

        for (int i = numeros.length -1; i >= 0; i --) {
            System.out.println(numeros[i] + ", ");
        }
    }
}
