package Exercicio1;

import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("informe sua nota entre 0 e 10");
            int numero = scan.nextInt();

            if (numero > 0 && numero <= 10) {
                System.out.println("Número Válido!");
                break;
            } else {
                System.out.println("Número Invalido, Tente Novamente!");
            }
        }

    }
}
