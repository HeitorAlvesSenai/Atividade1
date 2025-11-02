//Importa o Scanner
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        // === CALCULADORA SIMPLES ===
        float n1, n2, resultado; //Declara as três variaveis principais para o código
        String operador;         //Declara o operador como "string"
        Scanner sc = new Scanner(System.in);

        //Pede para a pessoa digitar o primeiro número
        System.out.println("Digite o primeiro número.");
        n1 = sc.nextInt();
        sc.nextLine();// Limpa o "Enter" do buffer

        //Pede para a pessoa escolher o operador
        System.out.println("Qual será a operação?(+, -, *, /)");
        operador = sc.next();

        //Pede para a pessoa digitar o segundo número
        System.out.println("Digite o segundo número.");
        n2 = sc.nextInt();
        sc.nextLine();// Limpa o "Enter" do buffer
        sc.close();

        if (operador.equals("+")) {
            resultado = n1 + n2;
        } else if (operador.equals("-")) {
            resultado = n1 - n2;
        } else if (operador.equals("*")) {
            resultado = n1 * n2;
        } else if (operador.equals("/")) {
            if (n2 != 0) {
                resultado = n1 / n2;
            } else {
                //Caso a pessoa tente fazer uma divisão por zero
                System.out.println("Divisão por zero não é permitido!");
                return;
            }
        } else {
            //Caso a pessoa não digite corretamente o operador
            System.out.println("Operador não reconhecido! Escreva +, -, * ou /.");
            return;
        }
        // Mostra o resultado
        System.out.println("O resultado da operação deu: " + resultado);

    }
    
}
