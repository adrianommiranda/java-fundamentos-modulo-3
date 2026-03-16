import java.util.Scanner;

public class Exe28 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double salarioAtual =0;
        String genero;
        int anosNaEmpresa;
        double novoSalario =0;

        System.out.println("Informe o salário atual do funcionário: ");
        salarioAtual = scan.nextDouble();
        System.out.println("Informe o gênero do funcionário(M/F): ");
        genero = scan.next();
        System.out.println("Por fim, informe há quantos anos o funcionário está na empresa: ");
        anosNaEmpresa = scan.nextInt();

        if (genero.equalsIgnoreCase("m")) {
            if(anosNaEmpresa <=20) {
                novoSalario = salarioAtual + ((salarioAtual *3) /100);
                System.out.printf("O novo salário será de %.2f",novoSalario);
            } else if (anosNaEmpresa <=30) {
                novoSalario += salarioAtual + ((salarioAtual *13) /100);
                System.out.printf("O novo salário será de %.2f",novoSalario);
            } else {
                novoSalario += salarioAtual + ((salarioAtual *25) /100);
                System.out.printf("O novo salário será de %.2f",novoSalario);
            }
        } else if (genero.equalsIgnoreCase("f")) {
            if(anosNaEmpresa <=15) {
                novoSalario += salarioAtual + ((salarioAtual *5) /100);
                System.out.printf("O novo salário será de %.2f",novoSalario);
            } else if (anosNaEmpresa <=20) {
                novoSalario += salarioAtual + ((salarioAtual *12) /100);
                System.out.printf("O novo salário será de %.2f",novoSalario);
            } else {
                novoSalario += salarioAtual + ((salarioAtual *23) /100);
                System.out.printf("O novo salário será de %.2f",novoSalario);
            }
        }

        scan.close();
    }
}
