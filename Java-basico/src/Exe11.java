import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero;

        System.out.println("Entre com um número inteiro: ");
        numero = scan.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("Número %d é par", numero);
        } else {
            System.out.printf("Número %d é impar", numero);
        }
        scan.close();
    }
}
