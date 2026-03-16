import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double VALOR_BASE_PLANO = 100.00; // R$100,00
        final double PORCENTAGEM_DESCONTO = 0.20; // 20% de desconto

        System.out.println("Cálculo de Desconto do Plano da Academia");
        System.out.println("Valor base do plano: R$ " + String.format("%.2f", VALOR_BASE_PLANO));

        System.out.print("Quantos dias você treina por semana? ");
        int diasTreino = scanner.nextInt();

        double valorFinal = VALOR_BASE_PLANO;
        boolean temDesconto = false; // Flag para indicar se o desconto foi aplicado

        if (diasTreino > 5) {
            temDesconto = true;
            valorFinal = VALOR_BASE_PLANO * (1 - PORCENTAGEM_DESCONTO); // Aplica o desconto de 20%
            System.out.println("Parabéns! Você se qualifica para o desconto de 20%.");
        } else {
            System.out.println("Você treina " + diasTreino + " dias por semana. Nenhum desconto aplicável para esta quantidade de dias.");
        }

        // Exibe o valor final do plano
        System.out.printf("O valor final do seu plano é: R$ %.2f%n", valorFinal);

        // Mensagem adicional caso tenha havido desconto
        if (temDesconto) {
            System.out.println("Você economizou: R$ " + String.format("%.2f", (VALOR_BASE_PLANO - valorFinal)));
        }

        scanner.close();
    }
}
