package Exercicio33;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdTemp = 5;
        double[] temp = new double[qtdTemp];

        for (int i = 0; i < qtdTemp; i++) {
            System.out.println("Digite a temperatura " + (i + 1) + ": ");
            temp[i] = scan.nextDouble();
        }

        int soma = 0;
        double media = 0;


        System.out.println("Temperaturas inseridas:");
        for (int i = 0; i < qtdTemp; i++) {
            soma += temp[i];
            media = (soma) / qtdTemp;
            System.out.println("Temperatura " + (i + 1) + ": " + temp[i]);
        }

        System.out.println("A media das Temperaturas é: " + media);

        double maior = temp[0];
        for(int i = 1; i< qtdTemp; i++){
            if(temp[i] > maior){
                maior = temp[i];
            }
        }

        double menor = temp[0];
        for(int i = 1;i < qtdTemp; i++ ){
            if(temp[i] < menor){
                menor = temp[i];
            }
        }

        System.out.println("Maior temperatura: " + maior);
        System.out.println("Menor temperatura: " + menor);

    }
}
