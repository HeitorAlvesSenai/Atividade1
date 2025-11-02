import java.util.Scanner;

public class SomaAteN {
    public static void main(String[] args) {
        //=== SOMA DE 1 ATÉ N ===
        int numero;
        float soma;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um número para a sua soma.");
        numero = sc.nextInt();
        sc.close();

        soma = numero;
        soma = (soma + 1) * (soma / 2);
        System.out.println("A soma de 1 até " + numero + " é: " + (int)soma); // '(int)soma' transforma soma em número inteiro
                                                                              // para o print não colocar um valor float '1.0'.
                                                                              // Também é utilizado para fazer calculos para uma variavel de tipo 'int'
    }
}
