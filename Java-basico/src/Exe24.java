import java.util.Scanner;

public class Exe24 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double valorEmprestimo;
        double valorCasa;
        double salario;
        double valorParcela;
        int anos;

        System.out.println("Informe o valor do empréstimo desejado: ");
        valorEmprestimo = scan.nextDouble();
        System.out.println("Informe o valor da casa: ");
        valorCasa = scan.nextDouble();
        System.out.println("Informe o valor do seu salário: ");
        salario = scan.nextDouble();
        System.out.println("Em quantos anos deseja quitar o empréstimo?");
        anos = scan.nextInt();

        valorParcela = valorEmprestimo / (anos * 12);

        if (valorParcela > ((salario * 30) / 100)) {
            System.out.printf("O valor da parcela ficou em R$ %d \n", Math.round(valorParcela));
            System.out.println("Sinto muito, o valor da parcela ultrapassa 30% do seu salário, o empréstimo foi negado.");
        } else {
            System.out.printf("O valor da parcela ficou em R$ %d \n", Math.round(valorParcela));
            System.out.println("Parabéns, o empréstimo foi concedido!");
        }

        scan.close();
    }
}
