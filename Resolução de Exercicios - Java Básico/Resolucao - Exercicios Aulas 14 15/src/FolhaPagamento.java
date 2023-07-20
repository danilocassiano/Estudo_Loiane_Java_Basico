//EXERCICIO 12

//Exercício a ser corrigido.

/*import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double IR5, IR10, IR20, sindicato, FGTS, salario, INSS, salarioLiquido, salarioSemIR, salarioLiquido5, salarioLiquido10, salarioLiquido20;

        System.out.println("Qual o valor da sua hora trabalhada?");
        double valor = scan.nextDouble();
        System.out.println("Quantas horas você trabalha no mês?");
        double horas = scan.nextDouble();

        salario = (valor * horas);
        System.out.println(salario);
        IR5 = (salario * 0.05);
        System.out.println("IR: " + IR5);
        IR10 = (salario * 0.10);
        System.out.println("IR: " + IR10);
        IR20 = (salario * 0.20);
        System.out.println("IR: " + IR20);
        sindicato = (salario * 0.03);
        System.out.println("sindicato: " + sindicato);
        FGTS = (salario * 0.11);
        System.out.println("FGTS: " + FGTS);
        INSS = (salario * 0.10);
        System.out.println("INSS: " + INSS);


        salarioLiquido5 = salario - IR5 - INSS;
        salarioLiquido10 = salario - IR10 - sindicato - INSS;
        salarioLiquido20 = salario - IR20 - sindicato - INSS;
        salarioSemIR = salario - sindicato - INSS;

        if(salario <= 900){
            System.out.println("Seu salário será de: " + salarioSemIR + " Reais.");
        } else if (salario <= 1500 || salario > 900) {
            System.out.println("Seu salário será de: " + salarioLiquido5 + " Reais.");
        } else if (salario > 1500 || salario <= 2500) {
            System.out.println("Seu salário será de: " + salarioLiquido10 + " Reais.");
        }else{
            System.out.println("Seu salário será de: " + salarioLiquido20 + " Reais.");
        }

    }
}*/


import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double IR5 = 0, IR10 = 0, IR20 = 0, sindicato, FGTS, salario, INSS, salarioLiquido, salarioSemIR, salarioLiquido5, salarioLiquido10, salarioLiquido20;

        System.out.println("Qual o valor da sua hora trabalhada?");
        double valor = scan.nextDouble();
        System.out.println("Quantas horas você trabalha no mês?");
        double horas = scan.nextDouble();

        salario = (valor * horas);

        sindicato = (salario * 0.03);
        FGTS = (salario * 0.11);

        // Cálculo do INSS
        if (salario <= 1100) {
            INSS = (salario * 0.075);
        } else if (salario <= 2203.48) {
            INSS = (salario * 0.09);
        } else if (salario <= 3305.22) {
            INSS = (salario * 0.12);
        } else if (salario <= 6433.57) {
            INSS = (salario * 0.14);
        } else {
            INSS = 751.99; // Teto do INSS em 2021
        }

        salarioSemIR = salario - sindicato - INSS;

        // Cálculo do Imposto de Renda
        if (salario <= 900) {
            // Isento de IR
            salarioLiquido = salarioSemIR;
        } else if (salario <= 1500) {
            IR5 = (salarioSemIR * 0.05);
            salarioLiquido = salarioSemIR - IR5;
        } else if (salario <= 2500) {
            IR10 = (salarioSemIR * 0.10);
            salarioLiquido = salarioSemIR - IR10;
        } else {
            IR20 = (salarioSemIR * 0.20);
            salarioLiquido = salarioSemIR - IR20;
        }

        System.out.println("Salário Bruto: " + salario);
        System.out.println("Desconto do Imposto de Renda (5%): " + IR5);
        System.out.println("Desconto do Imposto de Renda (10%): " + IR10);
        System.out.println("Desconto do Imposto de Renda (20%): " + IR20);
        System.out.println("Desconto do INSS: " + INSS);
        System.out.println("Desconto do Sindicato: " + sindicato);
        System.out.println("Depósito do FGTS: " + FGTS);
        System.out.println("Salário Líquido: " + salarioLiquido);
    }
}
