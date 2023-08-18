package Exercicio38;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Salario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat input = new DecimalFormat("#.##");

        System.out.println("Informe o salário Inicial");
        double salarioInicial = scan.nextDouble();
        double taxaDeAumento = 0.015;

        double salario1996 = salarioInicial + (salarioInicial * taxaDeAumento);

        System.out.println("informe o ano atual: ");
        int anoAtual = scan.nextInt();

        System.out.println("Salario de 1996: " + salario1996);



        for( int i = 1997; i <= anoAtual; i++){
             taxaDeAumento *= 2;

             salario1996 = salario1996 + ( salario1996 * taxaDeAumento);

            System.out.println("Ano do Recebimento: " + i);
            System.out.println("A taxa Aplicada é: " + taxaDeAumento);
            String salarioDecimal = input.format(salario1996);
            System.out.println("R$ " + salarioDecimal);
            System.out.println();

        }
        scan.close();
    }
}
