package Exercicio4;

public class TaxasPopulacionais {
    public static void main(String[] args) {

        int habitantesPaisA;
        int habitantesPaisB;
        double taxaPaisA;
        double taxaPaisB;

        habitantesPaisA = 80000;
        taxaPaisA = 0.03;

        habitantesPaisB = 200000;
        taxaPaisB = 0.015;

        int anos = 0;

        while (habitantesPaisA <= habitantesPaisB) {
            habitantesPaisA += (habitantesPaisA * taxaPaisA);
            habitantesPaisB += (habitantesPaisB * taxaPaisB);
            anos++;
        }

        System.out.println("Após " + anos + " anos, a população do país A ultrapassará a população do país B.");
        System.out.println("População do país A: " + habitantesPaisA);
        System.out.println("População do país B: " + habitantesPaisB);

    }
}