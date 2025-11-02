import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        // === FATORIAL DE UM NÚMERO ===
        int numero, resultado = 1;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número para descobrir o seu fatorial.");
        numero = sc.nextInt();
        sc.close();

        // não permite o número ser negativo
        if (numero < 0) {
            System.out.println("O fatorial não é definido por números negativos.");
            return;
        }

        // aqui ocorre a fatorização do número
        for (int i = numero; i > 1; i--) {
            resultado = resultado * i;
        }
        System.out.println(numero + "! é igual a: " + resultado);
    }
}
