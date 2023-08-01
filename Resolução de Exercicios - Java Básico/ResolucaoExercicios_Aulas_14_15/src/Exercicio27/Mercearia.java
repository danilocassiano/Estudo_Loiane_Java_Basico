package ResolucaoExercicios_Aulas_14_15.src.Exercicio27;

import java.util.Scanner;
public class Mercearia {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos Kilos de Morango você vai querer?");
        double qtdMorango = scan.nextDouble();

        System.out.println("Quanos Kilos de Maça você vai querer?");
        double qtdMaca = scan.nextDouble();

        double kilosTotal = qtdMorango + qtdMaca;

        double valorMaca =  1.80;
        double precoMaca = qtdMaca * valorMaca;

        double valorMorango = 2.50;
        double precoMorango = qtdMorango * valorMorango;

        double cincoKgMaca = 1.50;
        double precoMacaCincoKg = qtdMaca * cincoKgMaca;

        double cincoKgMorango = 2.20;
        double precoMorangoCincoKg = qtdMorango * cincoKgMorango;

        double precoFinalMaca;
        double precoFinalMorango;

        if(qtdMaca > 5){
           precoFinalMaca = precoMacaCincoKg;
            System.out.println("Preço total da Maça: " + precoMacaCincoKg);
        }else{
           precoFinalMaca = precoMaca;
            System.out.println("Preço total da Maça: " + precoMaca);
        }

        if(qtdMorango > 5){
            precoFinalMorango = precoMorangoCincoKg;
            System.out.println("Preço total do Morango: " + precoMorangoCincoKg);
        }else{
            precoFinalMorango = precoMorango;
            System.out.println("Preço total do Morango: " + precoMorango);
        }

        double somaFrutas = qtdMaca + qtdMorango;
        double somaPrecoTotal = precoFinalMaca + precoFinalMorango;

        if(somaFrutas > 8 || somaPrecoTotal> 20){
            somaPrecoTotal =  somaPrecoTotal * 0.9;
            System.out.println("O valor a pagar é: " + somaPrecoTotal);
        }else{
            System.out.println("O valor a pagar é: " + somaPrecoTotal);
        }
    }

}
