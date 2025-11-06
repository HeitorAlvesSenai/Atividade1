package vetores;

import java.util.Scanner;

public class ComparadorParImpar {
    public static void main(String[] args) {
        // === COMPARA QUANTOS NÚMEROS SÃO PARES E IMPARES ===
        int par = 0, impar = 0;
        int[] numeros = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira 10 números para saber quantos são pares e ímpares.");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Insira o " + (i + 1) + "º número:");
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0) {
                par += 1;
            } else {
                impar += 1;
            }
        }

        sc.close();

        System.out.println("São " + par + " pares e " + impar + " ímpares.");
    }
}
