package Exercicio5;

import java.util.Scanner;

public class TaxaPopulacional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double taxaPaisA, taxaPaisB, habitantesPaisA, habitantesPaisB;
        int anos = 0;
        boolean valido = false;

        do {
            System.out.println("Quantos Habitantes possuem o Pais A?");
            habitantesPaisA = scan.nextInt();

            if (habitantesPaisA > 0) {
                valido = true;
            } else {
                System.out.println("Valor dos habitantes deve ser maior que 0.");
            }

        } while (!valido);

        valido = false;

        do {
            System.out.println("Quantos Habitates possuem o Pais B?");
            habitantesPaisB = scan.nextInt();

            if (habitantesPaisB > 0) {
                valido = true;
            } else {
                System.out.println("Valor dos habitantes deve ser maior que 0.");
            }

        } while (!valido);

        valido = false;

        do {
            System.out.println("Qual a taxa de crescimento do Pais A?");
            taxaPaisA = scan.nextDouble();

            if (taxaPaisA > 0) {
                valido = true;
            } else {
                System.out.println("Valor da Taxa de crescimento deve ser maior que 0.");
            }

        } while (!valido);

        valido = false;

        do {
            System.out.println("Qual a taxa de crescimento do Pais B?");
            taxaPaisB = scan.nextDouble();

            if (taxaPaisB > 0) {
                valido = true;
            } else {
                System.out.println("Valor da Taxa de crescimento deve ser maior que 0.");
            }

        } while (!valido);

        while (habitantesPaisA < habitantesPaisB ){
            habitantesPaisA += (habitantesPaisA / 100) * taxaPaisA;
            habitantesPaisB += (habitantesPaisB / 100) * taxaPaisB;
            anos++;
        }

        System.out.println("Após " + anos + " anos, a população do país A ultrapassará a população do país B.");
        System.out.println("População do país A: " + habitantesPaisA);
        System.out.println("População do país B: " + habitantesPaisB);

        scan.close();
    }
}
