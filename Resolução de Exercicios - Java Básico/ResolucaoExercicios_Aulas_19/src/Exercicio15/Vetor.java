package Exercicio15;

import java.text.DecimalFormat;

public class Vetor {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");

        int [] vetorA = new int[10];

        vetorA [0] = 1;
        vetorA [1] = 2;
        vetorA [2] = 3;
        vetorA [3] = 4;
        vetorA [4] = 5;
        vetorA [5] = 6;
        vetorA [6] = 7;
        vetorA [7] = 8;
        vetorA [8] = 9;
        vetorA [9] = 10;

        double divisaoPares = 0;
        double divisaoImpares;
        int somaPares = 0;
        int somaImpares = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                somaPares += vetorA[i];
            }
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                divisaoPares = ((double) vetorA[i] / somaPares) * 100;
                String numeroConvertido = df.format(divisaoPares);

                System.out.println("O valor é " + vetorA[i] + " e representa " + numeroConvertido + "% do valor total de números pares");
            }
        }

        System.out.println();

        for(int i = 0; i < vetorA.length; i++) {

            if (vetorA[i] % 2 != 0) {
                somaImpares += vetorA[i];
            }
        }

        for(int i = 0; i < vetorA.length; i++){
            if(vetorA[i] % 2 != 0){
                divisaoImpares = ((double) vetorA[i]/somaImpares) * 100;
                String numeroConvertido = df.format(divisaoImpares);

                System.out.println("O valor é " + vetorA[i] + " e representa " + numeroConvertido + "% do valor total de numeros Impares");
            }
        }
    }
}
