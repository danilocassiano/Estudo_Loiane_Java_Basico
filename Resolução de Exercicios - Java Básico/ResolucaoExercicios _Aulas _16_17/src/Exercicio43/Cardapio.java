package Exercicio43;

import java.util.Scanner;

public class Cardapio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double totalGeral = 0.0; // Inicialize a variável para o total geral

        while (true) {
            System.out.println("Informe o número do seu Pedido: \n 1 - Cachorro-Quente \n 2 - Bauru Simples \n 3 - Bauru com Ovo \n 4 - Hamburguer \n 5 - Cheeseburguer");
            int pedido = scan.nextInt();

            System.out.println("Qual a Quantidade?");
            int qtd = scan.nextInt();

            double valorPedido = 0.0;

            double cachorroQuente = 1.20;
            double cheeseburguer = 1.30;
            double hamburguer = 1.20;
            double bauruSimples = 1.30;
            double bauruOvo = 1.50;

            if (pedido == 1) {
                valorPedido = cachorroQuente * qtd;
                System.out.println(qtd + " Cachorro Quente fica R$ " + valorPedido + " Reais.");
            } else if (pedido == 2) {
                valorPedido = bauruSimples * qtd;
                System.out.println(qtd + " Bauru Simples fica R$ " + valorPedido + " Reais.");
            } else if (pedido == 3) {
                valorPedido = bauruOvo * qtd;
                System.out.println(qtd + " Bauru com Ovo fica R$ " + valorPedido + " Reais.");
            } else if (pedido == 4) {
                valorPedido = hamburguer * qtd;
                System.out.println(qtd + " Hamburguer fica R$ " + valorPedido + " Reais.");
            } else if (pedido == 5) {
                valorPedido = cheeseburguer * qtd;
                System.out.println(qtd + " Cheeseburguer fica R$ " + valorPedido + " Reais.");
            }


            totalGeral += valorPedido;

            System.out.println("Deseja fazer outro pedido? S - Sim ou N - Não");
            String resposta = scan.next();

            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("Total Geral a Pagar: R$ " + totalGeral + " Reais.");
        scan.close();
    }
}
