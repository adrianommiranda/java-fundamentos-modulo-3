import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem-vindo ao Conversor de Unidades de Medida!");
        System.out.println("Por favor, selecione a unidade de entrada:");
        System.out.println("1. Metro (m)  -  2. Centímetro (cm)  -  3. Quilômetro (km)");
        int escolhaEntrada = scan.nextInt();

        System.out.println("Selecione a unidade de saída:");
        System.out.println("1. Metro (m)  -  2. Centímetro (cm)  -  3. Quilômetro (km)");
        int escolhaSaida = scan.nextInt();

        System.out.println("Insira o valor a ser convertido:");
        double valor = scan.nextDouble();

        double resultado = 0;

        if (escolhaEntrada == 1) {
            if (escolhaSaida == 1) {
                resultado = valor;
            } else if (escolhaSaida == 2) {
                resultado = valor * 100;
            } else if (escolhaSaida == 3) {
                resultado = valor / 1000;
            }
        }

        else if (escolhaEntrada == 2) {
            if (escolhaSaida == 1) {
                resultado = valor / 100;
            } else if (escolhaSaida == 2) {
                resultado = valor;
            } else if (escolhaSaida == 3) {
                resultado = valor / 100000;
            }
        }

        else if (escolhaEntrada == 3) {
            if (escolhaSaida == 1) {
                resultado = valor * 1000;
            } else if (escolhaSaida == 2) {
                resultado = valor * 100000;
            } else if (escolhaSaida == 3) {
                resultado = valor;
            }
        }

        if (resultado <= 3 && resultado >= 1) {
            System.out.println("O valor convertido é: " + resultado);
        } else {
            System.out.println("Unidades de medida inválidas. Por favor, tente novamente.");
        }

        scan.close();
    }
}
