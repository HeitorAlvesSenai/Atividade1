import java.util.Scanner;

public class SomaParesImpares {
    public static void main(String[] args) {
        // === SOMA DE TODOS OS NÚMEROS PARES E ÍMPARES DE 1 ATÉ N ===
        int numero;
        long par=0, impar=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para o programa fazer um calculo de 1 até ele com números impares e pares.");
        numero = sc.nextInt();
        sc.close();

        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0) {
                par += i;
            } else {
                impar += i;
            }
        }
        System.out.println("A soma de todos os numeros pares de 1 até " + numero + " é: " + par);
        System.out.println("Já a soma de todos os numeros ímpares de 1 até " + numero + " é: " + impar);
    }
}
