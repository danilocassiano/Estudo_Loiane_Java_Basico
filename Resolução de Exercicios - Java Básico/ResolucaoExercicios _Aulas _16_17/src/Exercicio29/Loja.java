package Exercicio29;

public class Loja {
    public static void main(String[] args) {

        System.out.println("Lojas Quase Dois  - Tabela de Preços");

        double preco = 1.99;
        int itens = 50;
        double somaDosQuadrados = 0;
        int i;


        for (i = 1; i <= itens; i++) {
           somaDosQuadrados += preco;

           String numeroFormatado = String.format("%.2f", somaDosQuadrados); // Formata para duas casas decimais

           System.out.println( i + " - R$ " +numeroFormatado);
        }

    }
}
