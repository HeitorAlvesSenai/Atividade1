import java.util.Scanner;

public class ValidarSenha {
    public static void main(String[] args) {
        // === VALIDAÇÃO DE SENHA ===
        int validacao = 0;
        String senha;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a sua senha, ela deve conter pelo menos 6 caractéres.");

        while (validacao < 6) {
            senha = sc.nextLine();
            validacao = senha.length();

            if (validacao < 6) {
                System.out.println("Senha não aprovada! Por favor, coloque mais de 6 caractéres para a sua senhar ser valida.");
            } else {
                System.out.println("Sua senha foi aprovada!");
                sc.close();
                break;
            }
        }
    }
}
