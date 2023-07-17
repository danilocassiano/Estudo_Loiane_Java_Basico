//EXERCICIO 15

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner renda = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        double ganhaHora = renda.nextDouble();

        System.out.println("Quantas horas você trabalha no mês?");
        double horaMes = renda.nextDouble();

        double salarioTotal = ganhaHora * horaMes;
        System.out.println("Seu salário Bruto é de " + salarioTotal + " Reais.");

        double salarioInss = salarioTotal * 0.08;
        System.out.println("O valor pago para o INSS foi de " + salarioInss + " Reais.");

        double sindicato = salarioTotal * 0.05;
        System.out.println("O valor pago para o Sindicato foi de " + sindicato + " Reais.");

        double importoRenda = salarioTotal * 0.11;
        System.out.println("O valor pago de Imposto de Renda foi de " + importoRenda + " Reais.");

        double salarioLiquido = salarioTotal - salarioInss - sindicato - importoRenda;
        System.out.println("Seu salário Liquido é de  " + salarioLiquido + " Reais.");

        System.out.println("Salario Bruno: RS" + salarioTotal + " - IR (11%): R$" + importoRenda + " - INSS (8%): R$" + salarioInss + " - Sindicato (5%): R$" + sindicato + " = Salário Liquido: R$" + salarioLiquido);

    }
}