//EXERCICIO 18
import java.util.Scanner;

public class Download {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do arquivo para download (em MB): ");
        double tamanhoArquivoMB = scanner.nextDouble();

        System.out.print("Digite a velocidade do link de Internet (em Mbps): ");
        double velocidadeMbps = scanner.nextDouble();


        double velocidadeMBps = velocidadeMbps / 8;

        double tempoTotal = (tamanhoArquivoMB / velocidadeMBps) / 60;

        System.out.println("Tempo aproximado de download: " + tempoTotal + " minutos");

        scanner.close();

    }
}
