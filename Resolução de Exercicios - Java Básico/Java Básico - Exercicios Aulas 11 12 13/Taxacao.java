//EXERCICIO 14

import java.util.Scanner;
public class Taxacao {
    public static void main(String[] args){
        Scanner taxa = new Scanner(System.in);

        System.out.println("Quantos Kilos tem de Peixe?");
        double kilos = taxa.nextDouble();

        if(kilos > 50){
            double taxacao = (kilos - 50) * 4;
            System.out.println("Você precisa pagar uma multa de: " + taxacao + " Reais.");
        }else{
            System.out.println("Não foi gerado multa.");
        }
    }
}