package Exercicio41;

import java.util.Scanner;

public class Divida {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor da sua Dívida:");
        double divida = scan.nextDouble();

        System.out.println("Valor da Dívida\tValor dos Juros\tQuantidade de Parcelas\tValor da Parcela");

        int[] jurosValores = { 0, 10, 15, 20, 25 };
        int[] parcelasValores = { 1, 3, 6, 9, 12 };

        for (int i = 0; i < jurosValores.length; i++) {
            int juros = jurosValores[i];
            int parcelas = parcelasValores[i];

            double valorJuros = divida * juros / 100;
            double valorTotal = divida + valorJuros;
            double valorParcela = valorTotal / parcelas;

            System.out.printf("R$ %.2f\t%d\t\t\t%d\t\t\t\tR$ %.2f\n", valorTotal, juros, parcelas, valorParcela);
        }

        scan.close();
    }
}
