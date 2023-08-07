package Exercicio18;

import java.util.Random;

public class Numeros {

    public static void main(String[] args) {

        StringBuilder result = new StringBuilder();

        int qtdNumeros = 5;
        int i;
        Random aleatorio = new Random();
        int[] numerosSorteados = new int[qtdNumeros];

        for (i = 0; i < qtdNumeros; i++) {
            numerosSorteados[i] = aleatorio.nextInt(100); // Gerando números aleatórios entre 0 e 99
            result.append(numerosSorteados[i]).append("-");
        }

        if (result.length() > 0) {
            // Remover o último traço
            result.setLength(result.length() - 1);
        }

        int maiorValor = numerosSorteados[0];

        for (i = 0; i < qtdNumeros; i++ ){
            if(numerosSorteados[i] > maiorValor){
                maiorValor = numerosSorteados[i];
            }
        }

        int menorValor = numerosSorteados[0];

        for(i=0; i < qtdNumeros; i++){
            if(numerosSorteados[i] < menorValor){
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

