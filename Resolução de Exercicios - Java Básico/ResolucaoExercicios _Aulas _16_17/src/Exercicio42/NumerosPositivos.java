package Exercicio42;

import java.util.Random;

public class NumerosPositivos {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[10];
        StringBuilder result = new StringBuilder();

        int contadorAte25 = 0;
        int contador25a50 = 0;
        int contador50a75 = 0;
        int contador75a100 = 0;

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100) + 1; // Gera um número aleatório de 1 a 100
            numerosAleatorios[i] = numero;

            result.append(numero);

            if (numero <= 25) {
                contadorAte25++;
            } else if (numero <= 50) {
                contador25a50++;
            } else if (numero <= 75) {
                contador50a75++;
            } else {
                contador75a100++;
            }

            if (i < numerosAleatorios.length - 1) {
                result.append("-");
            }
        }

        System.out.println(result);

        System.out.println("Quantidade de números até 25: " + contadorAte25);
        System.out.println("Quantidade de números entre 26 e 50: " + contador25a50);
        System.out.println("Quantidade de números entre 51 e 75: " + contador50a75);
        System.out.println("Quantidade de números entre 76 e 100: " + contador75a100);
    }
}
