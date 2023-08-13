package Exercicio30;

public class LojaPao {

    public static void main(String[] args) {
        System.out.println("Preço do Pão: R$ 0.18");
        System.out.println("Panificadora Pão de Ontem  - Tabela de Preços");

        double preco = 0.18;
        int itens = 50;
        double somaDosQuadrados = 0;
        int i;


        for (i = 1; i <= itens; i++) {
            somaDosQuadrados += preco;

            String numeroFormatado = String.format("%.2f", somaDosQuadrados); // Formata para duas casas decimais

            System.out.println(i + " - R$ " + numeroFormatado);
        }

    }
}


