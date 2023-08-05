package Exercicio5;

import java.util.Scanner;
public class TaxaPopulacional2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double taxaPaisA, taxaPaisB;
        int anos = 0;

        double habitantesPaisA = lerValorPositivo(scan, "Quantos Habitantes possuem o Pais A?");
        double habitantesPaisB = lerValorPositivo(scan, "Quantos Habitantes possuem o Pais B?");
        taxaPaisA = lerValorPositivo(scan, "Qual a taxa de crescimento do Pais A?");
        taxaPaisB = lerValorPositivo(scan, "Qual a taxa de crescimento do Pais B?");

        while (habitantesPaisA < habitantesPaisB) {
            habitantesPaisA += (habitantesPaisA / 100) * taxaPaisA;
            habitantesPaisB += (habitantesPaisB / 100) * taxaPaisB;
            anos++;
        }

        System.out.println("Após " + anos + " anos, a população do país A ultrapassará a população do país B.");
        System.out.println("População do país A: " + habitantesPaisA);
        System.out.println("População do país B: " + habitantesPaisB);

        scan.close();
    }

    // Função para ler um valor positivo maior que 0
    private static double lerValorPositivo(Scanner scan, String mensagem) {
        double valor;
        do {
            System.out.println(mensagem);
            valor = scan.nextDouble();
            if (valor <= 0) {
                System.out.println("Valor inválido. Deve ser maior que 0.");
            }
        } while (valor <= 0);
        return valor;
    }
}