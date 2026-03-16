import java.util.Scanner;

public class Exe18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota1 = 0;
        double nota2 = 0;

        System.out.println("Insira o valor da primeira nota: ");
        nota1 = scan.nextDouble();
        System.out.println("Insira o valor da segunda nota: ");
        nota2 = scan.nextDouble();

        double media = (nota1 + nota2) /2;

        if(media <=4.9) {
            System.out.println("Aluno reprovado.");
        } else if (media <=6.9) {
            System.out.println("Aluno em recuperação.");
        } else {
            System.out.println("Aluno aprovado.");
        }

        scan.close();
    }
}
