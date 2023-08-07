package Exercicio20;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            while (true) {
                System.out.println("Informe um número para o calculo do Fatorial. [ Até 16 ]");
                int numero = scan.nextInt();
                if (numero > 16) {
                    System.out.println("Número Inválido. Tente novamente.");
                } else {
                    int i;
                    int total = 1;


                    for (i = 1; i <= numero; i++) {
                        total *= i;
                    }

                    int resultadoFinalPositivo = Math.abs(total);
                    System.out.println("O valor do Fatorial de " + numero + " é: " + resultadoFinalPositivo);
                    System.out.println("Vamos novamente?");
                }
            }
        }
    }
}

