import java.util.Scanner;

public class PotenciaNumero {
    public static void main(String[] args) {
        int base, expoente;
        int resultado = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número.");
        base = sc.nextInt();
        System.out.println("Digite o valor de quanto será elevado.");
        expoente = sc.nextInt();
        sc.close();

        for (int i = 0; i < expoente; i++) {
            resultado = resultado * base;
        }
        System.out.println(base + " elevado a " + expoente + " é: " + resultado);
    }
}
