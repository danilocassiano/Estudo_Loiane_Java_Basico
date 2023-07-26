//EXERCICIO 17

import java.util.Scanner;

public class LojaDeTintas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double litroPorMetro = 1.0 / 6.0;
        double capacidadeLata = 18.0;
        double capacidadeGalao = 3.6;
        double precoLata = 80.0;
        double precoGalao = 25.0;

        System.out.print("Informe o tamanho da área a ser pintada (em metros quadrados): ");
        double areaPintada = scan.nextDouble();

        areaPintada = areaPintada * 1.1;

        double quantidadeTinta = areaPintada * litroPorMetro;

        int latasNecessarias = (int) Math.ceil(quantidadeTinta / capacidadeLata);
        int galoesNecessarios = (int) Math.ceil(quantidadeTinta / capacidadeGalao);

        int latasMelhorComb = (int) (quantidadeTinta / capacidadeLata);
        int galoesMelhorComb = (int) Math.ceil((quantidadeTinta - latasMelhorComb * capacidadeLata) / capacidadeGalao);
        double precoMelhorComb = (latasMelhorComb * precoLata) + (galoesMelhorComb * precoGalao);

        double precoTotalcomLatas = Math.ceil(quantidadeTinta / capacidadeLata) * precoLata;

        System.out.println("\nQuantidade de tinta a ser comprada:");
        System.out.println("Comprando apenas latas de 18 litros: " + latasNecessarias + " latas.");
        System.out.println("Comprando apenas galões de 3,6 litros: " + galoesNecessarios + " galões.");

        if (precoMelhorComb < precoTotalcomLatas) {
            System.out.println("Misturando latas e galões (opção mais barata):");
            System.out.println("   Latas: " + latasMelhorComb + " latas.");
            System.out.println("   Galões: " + galoesMelhorComb + " galões.");
            System.out.println("   Preço total: R$ " + precoMelhorComb);
        } else {
            System.out.println("Opção mais barata, apenas latas: R$ " + precoTotalcomLatas);
        }

    }
}