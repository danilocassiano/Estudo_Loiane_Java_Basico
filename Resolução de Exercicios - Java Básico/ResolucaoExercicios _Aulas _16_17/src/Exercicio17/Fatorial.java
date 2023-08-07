package Exercicio17;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número para o calculo do Fatorial.");
        int numero = scan.nextInt();

        int i;
        int total = 1;


        for (i = 1; i <= numero; i++) {
            total *= i;
            System.out.println(i);
        }
        scan.close();
        int resultadoFinalPositivo = Math.abs(total);
        System.out.println(resultadoFinalPositivo);

    }
}
