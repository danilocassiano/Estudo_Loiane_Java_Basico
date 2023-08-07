package Exercicio19;

import java.util.Random;

public class Numeros {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();

        int qtdNumero = 5;
        int i;

        Random aleatorio = new Random();
        int[] numerosSorteados = new int[qtdNumero];

        for (i = 0; i < qtdNumero; i++) {
            numerosSorteados[i] = aleatorio.nextInt(1000);
            result.append(numerosSorteados[i]).append("-");
        }

        if (result.length() > 0) {
            //Remover o ultimo traço.
            result.setLength(result.length() - 1);
        }

        int maiorValor = numerosSorteados[0];

        for (i = 0; i < qtdNumero; i++) {
            if (numerosSorteados[i] > maiorValor) {
                maiorValor = numerosSorteados[i];
            }
        }

        int menorValor = numerosSorteados[0];

        for (i = 0; i < qtdNumero; i++) {
            if (numerosSorteados[i] < menorValor) {
                menorValor = numerosSorteados[i];
            }
        }

        int soma = maiorValor + menorValor;

        System.out.println("Os números gerados foram: " + result.toString());

        System.out.println("O Maior Valor é: " + maiorValor);

        System.out.println("O Menor Valor é: " + menorValor);

        System.out.println("A Soma do Maior Valor e do Menor valor é de: " + soma);


    }
}
