import java.util.Scanner;

public class NumeroPositivoNegativo {
    public static void main(String[] args) {
        // === NÚMERO POSITIVO E NEGATIVO
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número");
        numero = sc.nextInt();
        sc.close();
        
        if (numero == 0) {
            System.out.println("Seu número é zero");
        } else if (numero < 0) {
            System.out.println("Seu número é negativo");
        } else {
            System.out.println("Seu número é positivo");
        }
    }
}
