import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        // === JOGO DE ADIVINHAÇÃO
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Adivinhe o número, ele está entre 1 e 100.");
        numero = sc.nextInt();
        sc.close();

        if (numero == 77) {
            System.out.println("Você acertou!");
        } else {
            System.out.println("Você errou!");
        }
    }
}
