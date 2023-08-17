package Exercicio31;

import java.util.Scanner;

public class LojasTabajaras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Lojas Tabajara");
            double total = 0.0;
            int numProduto = 1;

            while (true) {
                System.out.printf("Produto %d: R$ ", numProduto);
                double preco = scanner.nextDouble();
                if (preco == 0) break;
                total += preco;
                numProduto++;
            }

            System.out.printf("Total: R$ %.2f%n", total);
            System.out.print("Dinheiro: R$ ");
            double dinheiroDado = scanner.nextDouble();
            double troco = dinheiroDado - total;
            System.out.printf("Troco: R$ %.2f%n%n", troco);

            if (troco < 0) System.out.println("Atenção: Dinheiro fornecido insuficiente!\n");

            System.out.print("Registrar outra compra? (s/n): ");
            if (!scanner.next().equalsIgnoreCase("s")) break;
        }
    }
}   
