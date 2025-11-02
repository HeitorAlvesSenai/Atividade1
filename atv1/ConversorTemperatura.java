import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        // === CONVERSOR DE TEMPERATURA ===
        float numero;// temperatura em float
        String tipo; //tipo de temperatura
        Scanner sc = new Scanner(System.in);

        System.out.println("Quer tranformar para celsius ou fahrenheit?('c' ou 'f')");
        tipo = sc.nextLine();

        System.out.println("Informe a temperatura.");
        numero = sc.nextInt();

        // aqui ocorre a verificação do tipo de temperatura
        sc.close();
        if (tipo.equals("c")) {
            numero = (numero -32) * 5 / 9;
        } else if (tipo.equals("f")) {
            numero = (numero * 9/5) + 32;
        }
        tipo = tipo.toUpperCase(); // isso é para apenas ficar mais legivel transformando 'c/f' em 'C/F'
        System.out.println("Deu: " + numero + "º" + tipo);

    }
}