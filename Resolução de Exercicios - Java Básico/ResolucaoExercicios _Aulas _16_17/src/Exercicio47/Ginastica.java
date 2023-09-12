package Exercicio47;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ginastica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Qual o nome do Atleta? (Digite 'fechar' para encerrar)");
            String atleta = scan.nextLine();

            if (atleta.equalsIgnoreCase("fechar")) {
                break;
            }

            List<Double> notas = new ArrayList<>(); // Lista de notas para cada atleta
            List<Double> notasInseridas = new ArrayList<>(); // Lista para armazenar notas na ordem de inserção

            for (int i = 1; i <= 7; i++) {
                System.out.println("Digite a " + i + "ª Nota:");
                double nota = scan.nextDouble();
                notas.add(nota);
                notasInseridas.add(nota); // Adiciona nota à lista de notas inseridas
            }

            scan.nextLine(); // Limpa a quebra de linha pendente.

            double piorNota = Collections.min(notas); // Encontra a pior nota
            double melhorNota = Collections.max(notas); // Encontra a melhor nota

            notas.remove(piorNota); // Remove a pior nota.
            notas.remove(melhorNota); // Remove a melhor nota.

            double media = 0;
            for (Double nota : notas) {
                media += nota;
            }

            media /= 5; // Calcula a média das 5 notas restantes

            System.out.println("Atleta: " + atleta);

            // Exibe as notas na ordem em que foram inseridas
            System.out.println("Notas inseridas: ");
            for (int i = 0; i < 7; i++) {
                System.out.println("Nota " + (i + 1) + ": " + notasInseridas.get(i));
            }

            System.out.println("Resultado Final: \nAtleta: " + atleta + "\nMelhor Nota: " + melhorNota + "\nPior Nota: " + piorNota + "\nMédia: " + media);
        }
        scan.close();
    }
}


