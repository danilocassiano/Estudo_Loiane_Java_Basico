package Exercicio37;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Academia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        int codigo;
        int totalClientes = 0;
        double altura, peso, somaAlturas= 0, somaPesos = 0;
        int codigoMaisAlto = -1, codigoMaisBaixo = -1, codigoMaisGordo = -1, codigoMaisMagro = -1;
        double alturaMaisAlto = Double.MIN_VALUE, alturaMaisBaixo = Double.MAX_VALUE;
        double pesoMaisGordo = Double.MIN_VALUE, pesoMaisMagro = Double.MAX_VALUE;

        while (true) {
            System.out.print("Digite o código do cliente (ou 0 para sair): ");
            codigo = scanner.nextInt();

            if (codigo == 0) {
                break;
            }

            System.out.print("Digite a altura do cliente: ");
            altura = scanner.nextDouble();

            System.out.print("Digite o peso do cliente: ");
            peso = scanner.nextDouble();

            if (altura > alturaMaisAlto) {
                alturaMaisAlto = altura;
                codigoMaisAlto = codigo;
            }

            if (altura < alturaMaisBaixo) {
                alturaMaisBaixo = altura;
                codigoMaisBaixo = codigo;
            }

            if (peso > pesoMaisGordo) {
                pesoMaisGordo = peso;
                codigoMaisGordo = codigo;
            }

            if (peso < pesoMaisMagro) {
                pesoMaisMagro = peso;
                codigoMaisMagro = codigo;
            }

            // Atualizar médias
            somaAlturas += altura;
            somaPesos += peso;
            totalClientes++;
        }

        double mediaAlturas = somaAlturas / totalClientes;
        double mediaPesos = somaPesos / totalClientes;

        System.out.println("Cliente mais alto - Código: " + codigoMaisAlto + ", Altura: " + alturaMaisAlto);
        System.out.println("Cliente mais baixo - Código: " + codigoMaisBaixo + ", Altura: " + alturaMaisBaixo);
        System.out.println("Cliente mais gordo - Código: " + codigoMaisGordo + ", Peso: " + pesoMaisGordo);
        System.out.println("Cliente mais magro - Código: " + codigoMaisMagro + ", Peso: " + pesoMaisMagro);
        String mediaAlturasFormatada = decimalFormat.format(mediaAlturas);
        System.out.println("Média de alturas: " + mediaAlturasFormatada);
        String mediaPesosFormatada = decimalFormat.format(mediaPesos);
        System.out.println("Média de pesos: " + mediaPesosFormatada);

        scanner.close();
    }
}
