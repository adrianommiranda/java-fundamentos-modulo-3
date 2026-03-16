import java.util.Random;
import java.util.Scanner;

public class Exe23


 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Random random = new Random();
        int valorAleatorio = random.nextInt(5) + 1;
        System.out.println("Tente adivinhar um número entre 1 e 5: ");
        int valorInformado = scan.nextInt();

        if (valorInformado == valorAleatorio) {
            System.out.println("Parabéns! Você acertou!");
        } else {
            System.out.printf("Sinto muito, o número correto era %d.", valorAleatorio);
        }
        scan.close();
    }
}
