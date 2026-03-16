import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o ano: ");
        int ano = scan.nextInt();
        if(ano %400==0 || (ano %4==0&& ano %100!=0)) {
            System.out.printf("O ano %d é bissexto.",ano);
        } else {
            System.out.println("O ano não é bissexto.");
        }

        scan.close();
    }
}
