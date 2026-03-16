import java.util.Scanner;

public class Exe25 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double altura = 1;
        double peso = 1;

        System.out.println("Informe o peso do indivíduo em kg: ");
        peso = scan.nextDouble();
        System.out.println("Informe a altura do indivíduo em m: ");
        altura = scan.nextDouble();

        double imc = peso / (Math.pow(altura, 2));

        if (imc < 18.5) {
            System.out.println("O indivíduo está abaixo do peso.");
        } else if (imc >= 18.5 && imc <= 25) {
            System.out.println("O indivíduo está em seu peso ideal.");
        } else if (imc > 25 && imc < 30) {
            System.out.println("O indivíduo está em sobrepeso.");
        } else if (imc >= 30 && imc < 40) {
            System.out.println("O indivíduo está obeso.");
        } else {
            System.out.println("O indivíduo está com obesidade mórbida.");
        }
        scan.close();
    }
}
