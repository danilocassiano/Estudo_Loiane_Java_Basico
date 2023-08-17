package Exercicio32;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor que deseja ver o Fatorial:");
        int fatorial = scan.nextInt();

        int equacao = 1;

        for (int i = 1; i <= fatorial; i++) {
            equacao *= i;
        }
        System.out.println("O fatorial de " + fatorial + " é: " + equacao);
    }
}
