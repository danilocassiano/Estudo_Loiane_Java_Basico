package Exercicio25;

import java.util.Random;
import java.util.Scanner;

public class MediaIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        StringBuilder result = new StringBuilder();

        System.out.println("Informe a quantidade de ideda de que o programa terá que gerar:");
        int qtdIdades = scan.nextInt();

        int numeros;
        int soma = 0;

        for (int i = 1; i <= qtdIdades; i++) {
            numeros = random.nextInt(100) + 1;
            soma += numeros;
            result.append(numeros).append("-");
        }

        if (result.length() > 0) {
            System.out.println("As Idades geradas automaticamente são: " + result.substring(0, result.length() - 1));
        }

        double resultado = (double) soma / qtdIdades;

        if (resultado == 0 || resultado <= 25) {
            System.out.println("A turma é Jovem.");
        } else if (resultado >= 26 || resultado <= 60) {
            System.out.println("A turma é Adulta.");
        } else {
            System.out.println("A turma é Idosa.");
        }

    }
}
