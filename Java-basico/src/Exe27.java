import java.util.Scanner;

public class Exe27 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int horaMes =1;
        int pontos =1;
        double valorGanho =0;

        System.out.println("Informe quantas horas você fez atividades físicas esse mês: ");
        horaMes = scan.nextInt();

        if(horaMes <=10) {
            pontos = horaMes *2;
            valorGanho = (pontos *0.05);
            System.out.printf("Você marcou %d pontos. ",pontos);
        } else if (horaMes <20) {
            pontos = horaMes *5;
            valorGanho = (pontos *0.05);
            System.out.printf("Você marcou %d pontos. ",pontos);
        } else if (horaMes >20) {
            pontos = horaMes *10;
            valorGanho = (pontos *0.05);
            System.out.printf("Você marcou %d pontos. ",pontos);
        }

        System.out.printf("Você ganhou R$ %.2f!",valorGanho);
        scan.close();
    }
}
