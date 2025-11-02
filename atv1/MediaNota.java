import java.util.Scanner;

public class MediaNota {
    public static void main(String[] args) {
        double n1, n2, n3;
        double media;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a primeira nota.");
        n1 = sc.nextDouble();
        System.out.println("Informe a segunda nota.");
        n2 = sc.nextDouble();
        System.out.println("Informe a terceira nota.");
        n3 = sc.nextDouble();
        sc.close();
        media = (n1 + n2 + n3) / 3.0;

        System.out.printf("As notas informadas foram: %.1f, %.1f e %.1f", n1, n2, n3);
        System.out.printf("A média final é: %2f\n", media);
    }
}