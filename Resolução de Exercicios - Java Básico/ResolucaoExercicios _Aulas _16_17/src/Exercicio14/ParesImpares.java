package Exercicio14;
import java.util.Scanner;
public class ParesImpares {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos precisar de 10 números!");
        int[] array = new int[10];

        // Loop para ler e armazenar os 10 números no array
        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º Número:");
            array[i] = scan.nextInt();
        }

        System.out.println("Os Números escolhidos são: ");
        // Loop para imprimir os 10 números do array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nNúmeros ímpares:");
        // Loop para verificar e imprimir os números ímpares do array
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }

        System.out.println("\nNúmeros Pares:");
        // Loop para verificar e imprimir os números ímpares do array
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}


