package vetores;

import java.util.Scanner;

public class SomaTotalVetor {
    public static void main(String[] args) {
        // === SOLICITA 5 NÚMEROS PARA DAR A SOMA TOTAL ===
        int soma = 0;
        int[] numeros = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira 5 números para armazenar e retornar a soma total.");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Insira o " + (i + 1) + "º número:");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }

        sc.close();
        
        System.out.println("A soma total é:" + soma);
    }
}
