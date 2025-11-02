import java.util.Scanner;

public class ClassificacaoIdade {
    public static void main(String[] args) {
        // === CLASSIFICAÇÃO DE IDADE ===
        int idade;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade.");
        idade = sc.nextInt();
        sc.nextLine();

        sc.close();

        // comparação de idade
        if (idade < 1) {
            System.out.println("Você não existe.");
        } else if (idade >= 1 && idade < 18) {
            System.out.println("Você é uma criança");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Você é adulto");
        } else {
            System.out.println("Você é velho.");
        }
    }
}