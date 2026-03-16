import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Feira de Descontos do Mercado Mix Tadeu");
        System.out.println("Entre com a quantidade de produtos comprados:");
        int qtd = scan.nextInt();

        System.out.println("Entre com o valor total da compra:");
        double valor = scan.nextDouble();
        double valorDesconto = 0;
        double valorFinal;

        if(qtd <= 5){
            valorFinal = valor;
            System.out.printf("Sem desconto - Valor total a pagar: RS%.2f%n", valorFinal);
        } else if (qtd >=6 && qtd <= 10) {
            valorDesconto = (valor * 5) / 100;
            valorFinal = valor - valorDesconto;
            System.out.printf("5%% de desconto aplicado!%n");
            System.out.printf("Valor sem desconto: RS%.2f%n", valor);
            System.out.printf("Valor do desconto: RS%.2f%n", valorDesconto);
            System.out.printf("Valor COM desconto: RS%.2f%n", valorFinal);
        } else { // Para qtd > 10
            valorDesconto = (valor * 10) / 100;
            valorFinal = valor - valorDesconto;
            System.out.printf("10%% de desconto aplicado!%n");
            System.out.printf("Valor sem desconto: RS%.2f%n", valor);
            System.out.printf("Valor do desconto: RS%.2f%n", valorDesconto);
            System.out.printf("Valor COM desconto: RS%.2f%n", valorFinal); // Exibe o VALOR FINAL
        }

        scan.close();
    }
}
