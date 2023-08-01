package ResolucaoExercicios_Aulas_14_15.src.Exercicio28;

import java.util.Scanner;
public class HiperMercado {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double fileDuplo, alcatra, picanha, cartaoTabajara, valorTotal;

        System.out.println("Qual o tipo de carne você dejesa?");
        String tipoCarne = scan.next();

        System.out.println("Qual a quantidade?");
        double qtdCarne = scan.nextDouble();

        if(qtdCarne <= 5){
            fileDuplo = 4.90;
            alcatra = 5.90;
            picanha = 6.90;
        }else{
            fileDuplo = 5.80;
            alcatra = 6.80;
            picanha = 7.80;
        }


        valorTotal = 0.0;

        System.out.println("Vai pagar com o Cartão Tabajara? (Sim/Não)");
        String card = scan.next();

        if (tipoCarne.equalsIgnoreCase("FileDuplo")) {
            valorTotal = fileDuplo * qtdCarne;
        } else if (tipoCarne.equalsIgnoreCase("Alcatra")) {
            valorTotal = alcatra * qtdCarne;
        } else if (tipoCarne.equalsIgnoreCase("Picanha")) {
            valorTotal = picanha * qtdCarne;
        } else {
            System.out.println("Tipo de carne inválido!");
            return; // Encerra o programa caso o tipo de carne seja inválido.
        }

        if (card.equalsIgnoreCase("Sim")) {
            double conta = valorTotal * 0.95;
            System.out.println("O preço total é: " + conta);
        }else {
            System.out.println("O preço total é: " + valorTotal);
        }

    }
}