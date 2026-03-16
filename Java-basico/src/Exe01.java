import java.util.Scanner;
public class Exe01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String resposta;

        System.out.println("Digite a cor do semáforo: ");
        String codSemafro = scan.nextLine().toLowerCase();

        switch (codSemafro){
            case "verde": resposta = "Siga!";
            break;
            case "amarelo": resposta = "Atenção!";
                break;
            case "vermelho": resposta = "Pare!";
                break;
            default: resposta = "Cor não existe";
            break;
        }

        System.out.println(resposta);
        scan.close();
    }
}