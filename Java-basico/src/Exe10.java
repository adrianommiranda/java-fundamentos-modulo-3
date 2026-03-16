import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int anoAtual =2024;
        int anoNascimento =0;
        System.out.println("Informe o ano de nascimento: ");
        anoNascimento = scan.nextInt();

        if (anoAtual - anoNascimento >=16) {
            System.out.println("Pode votar.");
        } else {
            System.out.println("Ainda não pode votar.");
        }
        scan.close();
    }
}
