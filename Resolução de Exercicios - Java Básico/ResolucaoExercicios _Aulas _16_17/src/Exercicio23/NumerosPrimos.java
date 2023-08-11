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

            //No Próximo For, será verificado a Raiz Quadrada dos valores entre 2 e N. E depois será verificado
            // a divisões até o Valor Quadrado do número. Por exemplo, se a Raiz Quadrada for 4, então a verificação
            // será até 4. Se o resultado de alguma equação for 0 é porque existem outros numero divisiveis e esse numero
            // não é Primo. Caso os resultados reste qualquer outro valor significa que ele é Primo.
            for (int j = 2; j <= Math.sqrt(i); j++) {
                totalDivisoes++; // Aqui ele adiciona +1 toda vez que ele fizer uma divisão.
                if (i % j == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                quantidadePrimos++; // Aqui ele adiciona +1 toda vez que um numero primo for encontrado dentro do intervalor de 1 a N.
                System.out.println(i + " é um número primo.");
            }
        }

        //Aqui será realizado a impressão dos resultados.
        System.out.println("Quantidade de números primos encontrados: " + quantidadePrimos);
        System.out.println("Número total de divisões realizadas: " + totalDivisoes);

        scan.close();
    }
}
