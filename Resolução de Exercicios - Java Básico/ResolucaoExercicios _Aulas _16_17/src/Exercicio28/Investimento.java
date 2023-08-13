package Exercicio28;
import java.util.Scanner;

public class Investimento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a quantidade de CDs?");
        int cd = scan.nextInt();

        System.out.println("Qual o valor de cada um deles?");
        double valor = scan.nextDouble();

        double valorInvestido = valor * cd;

        System.out.println("O valor investido na compra de " + cd + " CDs é de: R$ " + valorInvestido);
        System.out.println("O valor médio gasto em cada CD é de: R$ " + (valorInvestido / cd));

        scan.close();

    }
}
