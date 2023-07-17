//EXERCICIO 17

import java.util.Scanner;
import java.lang.Math;

public class LojaDeTintas {

    public static void main(String[] args) {
        // Informações sobre a tinta
        double coberturaLitros = 1;  // 1 litro para cada 6 metros quadrados
        int capacidadeLata = 18;    // litros
        double precoLata = 80.00;   // em reais
        double capacidadeGalao = 3.6; // litros
        double precoGalao = 25.00;  // em reais

        // Entrada do Usuário
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tamanho da área a ser pintada em metros quadrados: ");
        double areaPintada = scan.nextDouble();

        // Cálculo da quantidade de latas e preço total (Opção a)
        int latasNecessarias = (int) Math.ceil(areaPintada / (6 * coberturaLitros));
        double precoTotalLatas = latasNecessarias * precoLata;

        // Cálculo da quantidade de galões e preço total (Opção b)
        int galoesNecessarios = (int) Math.ceil(areaPintada / (capacidadeGalao * coberturaLitros));
        double precoTotalGaloes = galoesNecessarios * precoGalao;

        // Cálculo da quantidade de latas e galões, com o menor preço possível (Opção c)
        int quantidadeDeGaloes = (int) Math.ceil((areaPintada * 1.1) / (capacidadeLata * coberturaLitros));
        int quantidadeDeLatas = (int) Math.ceil(((areaPintada * 1.1) - (quantidadeDeGaloes * capacidadeLata * coberturaLitros)) / (capacidadeGalao * coberturaLitros));
        double precoTotal = (quantidadeDeGaloes * precoGalao) + (quantidadeDeLatas * precoLata);

        // Exibição dos resultados
        System.out.println("\nOpção a) Comprar apenas latas de 18 litros:");
        System.out.println("Quantidade de Latas Necessárias: " + latasNecessarias);
        System.out.printf("Preço Total das Latas: R$ %.2f\n", precoTotalLatas);

        System.out.println("\nOpção b) Comprar apenas galões de 3,6 litros:");
        System.out.println("Quantidade de Galões Necessários: " + galoesNecessarios);
        System.out.printf("Preço Total dos Galões: R$ %.2f\n", precoTotalGaloes);

        System.out.println("\nOpção c) Misturar latas e galões para obter o menor preço:");
        System.out.println("Quantidade de Galões Necessários: " + quantidadeDeGaloes);
        System.out.println("Quantidade de Latas Necessárias: " + quantidadeDeLatas);
        System.out.printf("Preço Total: R$ %.2f\n", precoTotal);
    }
}



