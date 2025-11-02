import java.util.Scanner;

public class IdentificadorBissexto {
    public static void main(String[] args) {
        // === IDENTIFICADOR DE ANO BISSEXTO ===
        int ano;
        boolean bissexto;
        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque o ano para saber se ele é bissexto.");
        ano = sc.nextInt();
        sc.close();

        bissexto = (ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0));
        if (bissexto) {
            System.out.println("O ano " + ano + " é bissexto!");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }
    }
}
