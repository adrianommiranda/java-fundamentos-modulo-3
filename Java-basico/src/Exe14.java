import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        String genero = "";
        double valorCompra;
        int desconto;
        double valorDesconto =0;
        System.out.println("Digite seu nome: ");
        nome = scan.nextLine();
        System.out.println("Digite seu gênero (M/F)");
        genero = scan.nextLine();
        System.out.println("Informe o valor total das compras: ");
        valorCompra = scan.nextDouble();

        System.out.printf("Olá, %s! ",nome);
        if(genero.equalsIgnoreCase("m")){
            desconto =5;
            valorDesconto = (valorCompra * desconto) /100;
            valorCompra -= valorDesconto;
            System.out.printf("O valor da compra teve um desconto de %.2f , e fica no total de %.2f",valorDesconto,valorCompra);
        }
        if(genero.equalsIgnoreCase("f")) {
            desconto =13;
            valorDesconto = (valorCompra * desconto) /100;
            valorCompra -= valorDesconto;
            System.out.printf("O valor da compra teve um desconto de %.2f, e fica no total de %.2f",valorDesconto,valorCompra);
        }
        scan.close();
    }
}
