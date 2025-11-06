package vetores;

import java.util.Scanner;

public class MaiorMenorVetor {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira 10 números para comparar qual é o maior e menor.");
        // === PRIMEIRO LOOP: ENTRADA DE DADOS ===
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Coloque o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }
        
        // Inicializa MAIOR e MENOR com o primeiro elemento do vetor.
        int Cmaior = numeros[0];
        int Cmenor = numeros[0];
        
        // === SEGUNDO LOOP: COMPARAÇÃO (Começamos a comparar do SEGUNDO elemento - índice 1) ===
        for (int i = 1; i < numeros.length; i++) {
            
            // 1. Encontra o MAIOR: Se o número atual for maior que o Cmaior, ele se torna o novo Cmaior.
            if (numeros[i] > Cmaior) {
                Cmaior = numeros[i];
            } 
            
            // 2. Encontra o MENOR: Se o número atual for menor que o Cmenor, ele se torna o novo Cmenor.
            if (numeros[i] < Cmenor) {
                Cmenor = numeros[i];
            }
        }
        
        // === RESULTADO ===
        System.out.println("\n--- RESULTADO DA COMPARAÇÃO ---");
        System.out.println("O MAIOR número é: " + Cmaior);
        System.out.println("O MENOR número é: " + Cmenor);
        
        sc.close();
    }
}