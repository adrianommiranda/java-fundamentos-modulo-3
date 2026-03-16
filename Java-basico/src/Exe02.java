import java.util.Scanner;
public class Exe02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota musical (A, B, C, D, E ou F):");
        String nota = scan.nextLine().toUpperCase();

        double frequencia = 0;

        switch (nota) {
            case "A":
                frequencia = 440.0;
                break;
            case "B":
                frequencia = 493.88;
                break;
            case "C":
                frequencia = 523.25;
                break;
            case "D":
                frequencia = 587.33;
                break;
            case "E":
                frequencia = 659.25;
                break;
            case "F":
                frequencia = 698.46;
                break;
        }

        if (frequencia != 0) {
            System.out.println("A nota musical " + nota + " tem uma frequência de " + frequencia + " Hz.");
        } else {
            System.out.println("Nota musical inválida.");
        }
        scan.close();
    }
}
