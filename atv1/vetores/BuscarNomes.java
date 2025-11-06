package vetores;

import java.util.Scanner;

public class BuscarNomes {
    public static void main(String[] args) {
        // === SOLICITA 10 NOMES E UMA BUSCA AO USUÁRIO ===
        String nome;
        String[] alunos = new String[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira 10 nomes de alunos para armazenar.");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Insira o " + (i + 1) + "º nome:");
            alunos[i] = sc.nextLine();
        }

        System.out.println("Insira um nome para encontrar.");
        nome = sc.nextLine();
        sc.close();
        for (int i = 0; i < alunos.length; i++) {
            if (nome.equals(alunos[i])) {
                System.out.println("Aluno(a) com o nome '" + nome + "' encontrado(a!");
                return;
            }
        }
        System.out.println("Não foi possivel encontrar o(a) aluno(a)'" + nome + "'");
    }
}
