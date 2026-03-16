import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double kmDesejado =0;
        double valor =0;

        System.out.println("Informe quantos quilômetros deseja percorrer: ");
        kmDesejado = scan.nextDouble();

        if(kmDesejado <200) {
            valor = kmDesejado *0.5;
        } else if (kmDesejado >=200) {
            valor = kmDesejado *0.45;
        }
        System.out.printf("O valor total a ser cobrado é de R$ %.2f.",valor);

        scan.close();
    }
}
