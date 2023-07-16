//EXERCICIO 18
import java.util.Scanner;

public class Download {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o Tamanho do arquivo para Download em MB?");
        double arquivo = scan.nextDouble();

        System.out.print("Qual a Velocidade do link da internet em MB?");
        double velocidade = scan.nextDouble();

        double baixar = (arquivo / velocidade);

        System.out.println("Você consegue baixar em " + baixar + " Min.");
    }
}