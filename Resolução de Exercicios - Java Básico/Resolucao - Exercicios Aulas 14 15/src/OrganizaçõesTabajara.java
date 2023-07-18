//EXERCICIO 11

import java.util.Scanner;

public class OrganizaçõesTabajara {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o salário do Colaborador?");
        double salario = scan.nextDouble();

        double salario280 = (salario * 0.20) + salario;
        double porcentagem280 = (salario -salario280) * (-1);
        double salario700 = (salario * 0.15) + salario;
        double porcentagem700 = (salario - salario700) * (-1);
        double salario1500 = (salario * 0.10) + salario;
        double porcentagem1500 = (salario - salario1500) * (-1);
        double salarioPlus = (salario * 0.05) + salario;
        double porcentagemPlus = (salario - salarioPlus) * (-1);

        if(salario <= 280){
            System.out.println("Seu salário é " + salario + " Reais e passará a ser: " + salario280 + " Reais. Teve um aumento de 20% que se configura em: " + porcentagem280 + " Reais.");
        } else if (salario > 280 && salario < 700) {
            System.out.println("Seu salário é " + salario + " Reais e passará a ser: " + salario700 + " Reais. Teve um aumento de 15% que se configura em: " + porcentagem700 + " Reais.");
        } else if (salario > 700 && salario < 1500) {
            System.out.println("Seu salário é " + salario + " Reais e passará a ser: " + salario1500 + " Reais. Teve um aumento de 10% que se configura em: " + porcentagem1500 + " Reais.");
        }else{
            System.out.println("Seu salário é " + salario + " Reais e passará a ser: " + salarioPlus + " Reais. Teve um aumento de 5% que se configura em: " + porcentagemPlus + " Reais.");
        }

    }
}