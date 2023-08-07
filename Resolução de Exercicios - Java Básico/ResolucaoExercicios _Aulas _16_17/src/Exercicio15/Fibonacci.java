package Exercicio15;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            while (true) {
                System.out.print("Digite o valor de n (número de termos da série de Fibonacci): ");
                int n = scan.nextInt();

                if (n <= 0) {
                    System.out.println("Por favor, insira um número inteiro positivo.");
                    scan.nextLine(); // Consume a nova linha pendente
                    continue; // Retorna ao início do loop
                } else {
                    System.out.print("A série de Fibonacci até o " + n + "º termo é: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(fibonacci(i) + " ");
                    }
                    System.out.println();
                }
                break; // Sai do loop while após o cálculo da série de Fibonacci
            }
        } catch (Exception e) {
            System.out.println("Por favor, insira um número inteiro válido.");
        }
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
