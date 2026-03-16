import java.util.Random;
import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;

        System.out.println("Bem-vindo ao Jogo do Palpite!");
        System.out.println("Tente adivinhar um número entre 1 e 100.");
        System.out.print("Digite seu palpite: ");
        int palpiteUsuario = scan.nextInt();

        if (palpiteUsuario < numeroAleatorio) {
            System.out.println("Muito baixo!");
        } else if (palpiteUsuario > numeroAleatorio) {
            System.out.println("Muito alto!");
        } else {
            System.out.println("Parabéns, acertou!");
        }

        System.out.println("O número secreto era: " + numeroAleatorio);

        scan.close();
    }
}
