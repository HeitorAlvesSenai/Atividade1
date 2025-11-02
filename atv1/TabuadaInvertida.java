import java.util.Scanner;

public class TabuadaInvertida {
    public static void main(String[] args) {
        //=== TABUADA INVERTIDA ===
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro para a tabuada de multiplicação.");
        numero = sc.nextInt();
        sc.close();

        for (int i=10; i > 0; i--) {
            System.out.println(numero + " * " + i + " = " + (numero*i));
        }
    }
}
