import java.util.Scanner;

public class Exe21
 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int lado1;
        int lado2;
        int lado3;
        boolean triangulo = false;

        System.out.println("Informe o valor do primeiro segmento de reta: ");
        lado1 = scan.nextInt();
        System.out.println("Informe o valor do segundo segmento de reta: ");
        lado2 = scan.nextInt();
        System.out.println("Informe o valor do terceiro segmento de reta: ");
        lado3 = scan.nextInt();

        if ((lado1 + lado2 >= lado3) || 
            (lado2 + lado3 >= lado1) || 
            (lado1 + lado3 >= lado2)) {
            System.out.println("É possível formar um triângulo com os três segmentos de reta inseridos.");
            triangulo = true;
        }
        if (triangulo) {
            if (lado1 == lado2 && lado3 == lado1) {
                System.out.println("O triângulo é equilátero.");
            } else if (lado1 == lado2 && lado1 != lado3) {
                System.out.println("O triângulo é isósceles.");
            } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                System.out.println("O triângulo é escaleno.");
            }
        }

        scan.close();
    }
}
