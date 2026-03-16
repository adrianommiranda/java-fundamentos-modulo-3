import java.util.Scanner;

public class Exe16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int lado1 = 0;
        int lado2 = 0;
        int lado3 = 0;

        System.out.println("Informe o valor do primeiro segmento de reta: ");
        lado1 = scan.nextInt();
        System.out.println("Informe o valor do segundo segmento de reta: ");
        lado2 = scan.nextInt();
        System.out.println("Informe o valor do terceiro segmento de reta: ");
        lado3 = scan.nextInt();

        if((lado1 + lado2 > lado3) && 
           (lado2 + lado3 > lado1) && 
           (lado1 + lado3 > lado2)) {
            System.out.println("É possível formar um triângulo com os três segmentos de reta inseridos.");
        }
        scan.close();
    }
}
