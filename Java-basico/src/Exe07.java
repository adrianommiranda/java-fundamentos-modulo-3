import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Aprovado, Recuperação ou Chocolate?");

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Calcula a média das três notas
        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média do aluno é: %.2f%n", media);

        if (media == 10.0) {
            System.out.println("Parabéns! Você ganhou um Chocolate!");
        } else if (media >= 7.0) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Recuperação!");
        }

        scanner.close();
    }
}
