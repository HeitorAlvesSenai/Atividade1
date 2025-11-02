import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        //=== CONTAGEM REGRESSIVA N ATÉ 0 ===
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro para ver a sua contagem regressiva até zero.");
        numero = sc.nextInt();
        sc.close();

        // Aqui ocorre a contagem regressiva
        for (int i=numero; i >= 0; i--) {
            System.out.println(i + ", ");
        }
    }
}
