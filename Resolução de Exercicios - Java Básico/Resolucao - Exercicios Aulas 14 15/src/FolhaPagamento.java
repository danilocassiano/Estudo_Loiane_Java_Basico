//EXERCICIO 12

import java.util.Scanner;

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
}