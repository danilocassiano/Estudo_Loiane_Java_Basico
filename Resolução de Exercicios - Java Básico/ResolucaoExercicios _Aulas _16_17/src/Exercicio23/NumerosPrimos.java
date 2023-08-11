package Exercicio23;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número N:");
        int n = scan.nextInt();

        int totalDivisoes = 0;
        int quantidadePrimos = 0;

        for (int i = 2; i <= n; i++) {
            boolean ehPrimo = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                totalDivisoes++;
                if (i % j == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                quantidadePrimos++;
                System.out.println(i + " é um número primo.");
            }
        }

        System.out.println("Quantidade de números primos encontrados: " + quantidadePrimos);
        System.out.println("Número total de divisões realizadas: " + totalDivisoes);

        scan.close();
    }
}
