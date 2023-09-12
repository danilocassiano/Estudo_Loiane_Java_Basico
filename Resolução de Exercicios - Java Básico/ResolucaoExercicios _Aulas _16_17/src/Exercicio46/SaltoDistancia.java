package Exercicio46;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SaltoDistancia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> saltos = new ArrayList<>();

        while (true) {
            System.out.println("Qual o nome do Atleta? (Digite 'exit' para encerrar)");
            String atleta = scan.nextLine();

            if (atleta.equalsIgnoreCase("exit")) {
                break;
            }

            for (int i = 1; i <= 5; i++) {
                System.out.println("Digite a distância do " + i + "º salto:");
                double salto = scan.nextDouble();
                saltos.add(salto);
            }

            scan.nextLine(); // Limpa a quebra de linha pendente

            Collections.sort(saltos); // Classifica os saltos

            double piorSalto = saltos.get(0);
            double melhorSalto = saltos.get(saltos.size() - 1);

            saltos.remove(0); // Remove o pior salto
            saltos.remove(saltos.size() - 1); // Remove o melhor salto

            double media = 0;
            for (Double salto : saltos) {
                media += salto;
            }
            media /= 3; // Calcula a média dos 3 saltos restantes

            System.out.println("Atleta: " + atleta);
            for (int i = 0; i < saltos.size(); i++) {
                System.out.println("Salto " + (i + 1) + ": " + saltos.get(i) + " m");
            }
            System.out.println("Melhor salto: " + melhorSalto + " m");
            System.out.println("Pior salto: " + piorSalto + " m");
            System.out.println("Média dos demais saltos: " + media + " m");

            saltos.clear(); // Limpa a lista de saltos para o próximo atleta
        }
        scan.close();
    }
}
