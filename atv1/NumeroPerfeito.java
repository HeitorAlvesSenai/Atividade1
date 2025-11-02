import java.util.Scanner;

public class NumeroPerfeito {
    public static boolean isPerfect(int numero) {
        if (numero < 2) {
            return false;
        }

        long somaDivisores = 0;

        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }
        return somaDivisores == numero;
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para saber se ele é perfeito.");
        num = sc.nextInt();
        sc.close();

        if (isPerfect(num)) {
            System.out.println("É um número perfeito!");
        } else {
            System.out.println("Não é um número prefeito.");
        }
    }
}
