package ResolucaoExercicios_Aulas_14_15.src.Exercicio_12;

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

        sindicato = (salario * 0.03); // Não é descontado.
        FGTS = (salario * 0.11);

        INSS = (salario * 0.10);


        salarioSemIR = salario - INSS;

        // Cálculo do Imposto de Renda
        if (salario <= 900) {
            // Isento de IR
            salarioLiquido = salarioSemIR;
        } else if (salario <= 1500) {
            IR5 = (salario * 0.05);
            salarioLiquido = salarioSemIR - IR5;
        } else if (salario <= 2500) {
            IR10 = (salario * 0.10);
            salarioLiquido = salario - IR10;
        } else {
            IR20 = (salarioSemIR * 0.20);
            salarioLiquido = salario - IR20;
        }

        System.out.println("Salário Bruto: " + salario);
        System.out.println("Desconto do Imposto de Renda (5%): " + IR5);
        System.out.println("Desconto do Imposto de Renda (10%): " + IR10);
        System.out.println("Desconto do Imposto de Renda (20%): " + IR20);
        System.out.println("Desconto do INSS: " + INSS);
        System.out.println("Depósito do FGTS: " + FGTS);
        System.out.println("Depósito do Sindicato: " + sindicato);
        System.out.println("Salário Líquido: " + salarioLiquido);
    }
}

