import java.util.Scanner;

public class CovensorMoedas {
    public static void main(String[] args) {
        // === CONVERSOR DE REAIS PARA DÓLAR E EURO ===
        double t_dolar = 5.00, t_euro = 5.50;
        double v_real, v_dolar, v_euro;
        Scanner sc = new Scanner(System.in);

        // este código não pede o tipo de conversão para moeda estrangeira,
        // já que existe apenas Dólar e Euro
        System.out.println("Digite o valor em reais.");
        v_real = sc.nextDouble();
        sc.close();

        // a conversão do real para moeda estrangeira ocorre aqui:
        v_dolar = v_real / t_dolar;
        v_euro = v_real / t_euro;

        System.out.printf("Valor em Reais (BRL): R$ %.2f\n", v_real);
        System.out.printf("Convertido para Dólar (USD): $ %.2f\n", v_dolar);
        System.out.printf("Convertido para Euro (EUR): € %.2f\n", v_euro);
    }
}
