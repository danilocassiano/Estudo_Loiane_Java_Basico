package Exercicio36;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Montar a Tabuada de: ");
        int numero = scan.nextInt();
        System.out.print("Começar por: ");
        int inicio = scan.nextInt();
        System.out.println("Terminar em: ");
        int termino = scan.nextInt();


        int total = numero;

        for (int i = inicio; i <= termino; i++) {
            total = numero * i;
            System.out.println(numero + " x " + i + " = " + total);
        }
    }
}
