import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        // === MAIOR NÚMERO ENTRE DOIS ===
        float n1, n2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número.");
        n1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o segundo número.");
        n2 = sc.nextInt();
        sc.nextLine();

        sc.close();
        if (n1 == n2) {
            System.out.println("Os dois são iguais!");
        } else if (n1 > n2) {
            System.out.println("O " + n1 + "é maior que " + n2);
        } else {
            System.out.println("O " + n1 + " é menor que " + n2);
        }
    }
}