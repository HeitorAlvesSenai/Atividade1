import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // === MOSTRAR OS PRIMEIROS DIGITOS DA SEQUENCIA DE FIBONACCI ===
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de termos que você quer ver da sequencia de fibonacci.");
        n = sc.nextInt();
        sc.close();

        if (n < 1) {
            System.out.println("O número de termos tem que ser positivo!");
            return;
        }
        // é feito três variaveis para o comprimento da tarefa, o 'long' é para números muito grandes
        long termoAnterior=0, termoAtual=1;
        long proximoTermo;
        System.out.println("\nOs " + n + " primeiros termos de Fibonacci são:");

        // aqui ocorre um loop para repetir o calculo usando as três novas variaveis, mas 'n' mostra onde deve parar
        for (int i = 0; i < n; i++) {
            System.out.println(termoAnterior + (i < n -1 ?", ": ""));

            proximoTermo = termoAnterior + termoAtual;
            termoAnterior = termoAtual;
            termoAtual = proximoTermo;
        }
    }
}
