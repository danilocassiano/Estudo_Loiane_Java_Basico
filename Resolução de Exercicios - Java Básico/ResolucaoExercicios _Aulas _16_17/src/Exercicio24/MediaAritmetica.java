package Exercicio24;

import java.util.Random;
import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        StringBuilder result = new StringBuilder();

        System.out.println("Informe a quantidade de ideda de que o programa terá que gerar:");
        int qtdNotas = scan.nextInt();

        int numeros;
        int soma = 0;

        for (int i = 1; i <= qtdNotas; i++) {
            numeros = random.nextInt(10) + 1;
            soma += numeros;
            result.append(numeros).append("-");
        }

        if(result.length() > 0){
            System.out.println("As notas geradas automaticamente é: " + result.substring(0, result.length() - 1));
        }

        double resultado = (double) soma / qtdNotas;

        System.out.println("A média de " + qtdNotas + " notas aleatórias é: " + resultado);

    }
}
