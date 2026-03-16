import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        final double VELOCIDADE_LIMITE = 80.00; 
        final double VALOR_COBRADO_KM = 5.00; 
        
        System.out.println("Medidor de velocidade");
        
        System.out.print("Informe a velocidade de um carro ");
        double velocidade = scan.nextDouble();

        double multa = (velocidade - VELOCIDADE_LIMITE) * VALOR_COBRADO_KM;

        if(velocidade <= VELOCIDADE_LIMITE){
            System.out.printf("Velocidade %.2f dentro do limite de %.2f", velocidade, VELOCIDADE_LIMITE);
        }else{
            System.out.printf("Velocidade %.2f, acima do limite de %.2f. Multado em RS %.2f", velocidade, VELOCIDADE_LIMITE, multa);
        }     
        scan.close();
    }
}
