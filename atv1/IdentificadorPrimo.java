import java.util.Scanner;

public class IdentificadorPrimo {
    public static void main(String[] args) {
        //=== IDENTIFICADOR DE NÚMERO PRIMO
        int numero;
        boolean primo = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para saber se ele é primo ou não.");
        numero = sc.nextInt();
        sc.close();

        if (numero < 2) {
            primo = false;
        } else {
            for (int i =2; i < numero; i ++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        if (primo) {
            System.out.println("O número " + numero + " é primo!");
        } else {
            System.out.println("O número " + numero + " não é primo");
        }
    }
}
