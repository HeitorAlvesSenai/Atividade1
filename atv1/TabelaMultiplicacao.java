import java.util.Scanner;

public class TabelaMultiplicacao {

    public static void main(String[] args) {
        //=== TABELA DE MULTIPLICAÇÃO ===
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro para a tabela de multiplicação.");
        numero = sc.nextInt();
        sc.close();

        for (int i=1; i < 11; i++) {
            System.out.println(numero + " * " + i + " = " + (numero*i));
        }
    }
}