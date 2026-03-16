import java.util.Scanner;

public class Exe19
 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int largura;
        System.out.println("Informe a largura do terreno: ");
        largura = scan.nextInt();
        int comprimento;
        System.out.println("Informe o comprimento do terreno: ");
        comprimento = scan.nextInt();
        int area = largura * comprimento;

        if (area < 100) {
            System.out.println("O terreno é do tipo POPULAR.");
        } else if (area > 100 && area <= 500) {
            System.out.println("O terreno é do tipo MASTER.");
        } else {
            System.out.println("O terreno é do tipo VIP.");
        }
        scan.close();
    }
}
