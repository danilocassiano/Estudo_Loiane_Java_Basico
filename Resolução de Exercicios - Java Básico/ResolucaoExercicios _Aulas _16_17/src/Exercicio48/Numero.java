package Exercicio48;

import java.util.Scanner;
public class Numero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insire um número interiro positivo:");
        int numero = scan.nextInt();

        String  numeroString = Integer.toString(numero);

        String numeroInvertido = new StringBuilder(numeroString).reverse().toString();

        int numeroInvertidoInt = Integer.parseInt(numeroInvertido);

        System.out.println("O número invertido é: " + numeroInvertidoInt);

    }
}
