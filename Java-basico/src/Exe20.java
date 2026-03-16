import java.util.Scanner;

public class Exe20
 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        double salario;
        int qtdAnos;
        double reajuste =0;
        double salario_final;

        System.out.println("Informe o nome do funcionário: ");
        nome = scan.nextLine();
        System.out.println("Informe seu salário: ");
        salario = scan.nextDouble();
        System.out.println("Informe quantos anos trabalha na empresa: ");
        qtdAnos = scan.nextInt();

        if(qtdAnos <3) {
            reajuste = (salario *3)/100;

        } else if (qtdAnos >=3 && qtdAnos <=10) {
            reajuste = (salario *12.5)/100;

        } else {
            reajuste = (salario *20)/100;
        }

        salario_final = salario + reajuste;
        System.out.printf("Olá, %s! Pelos %d anos trabalhados na empresa, seu novo salário será de %f.",
                nome,qtdAnos,salario_final);
        scan.close();
    }
}
