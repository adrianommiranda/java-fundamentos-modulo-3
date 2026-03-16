import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre co a sua idade");
        int idade = scan.nextInt();

        if(idade < 12){
            System.out.println("Crianças com idade menor de 12 anos não paga");
        } else if (idade >= 12 && idade <= 60) {
            System.out.println("Paga 20 reais");
        }else {
            System.out.println("Paga metade");
        }

        scan.close();
    }
}
