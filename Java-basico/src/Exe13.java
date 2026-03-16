import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade =0;
        System.out.println("Informe a idade: ");
        idade = scan.nextInt();
        if(idade <18) {
            System.out.printf("Faltam %d ano(s) para o alistamento.",(18- idade));
        } else {
            System.out.printf("O alistamento foi há %d ano(s).",(idade -18));
        }
        scan.close();
    }
}
