import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        // === IMPAR OU PAR ===
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número (Inteiro).");
        numero = sc.nextInt();
        sc.close();

        numero = numero % 2;
        if (numero == 0) {
            System.out.println("Ele é par!");
        } else {
            System.out.println("Ele é impar!");
        }
    }
    
}
