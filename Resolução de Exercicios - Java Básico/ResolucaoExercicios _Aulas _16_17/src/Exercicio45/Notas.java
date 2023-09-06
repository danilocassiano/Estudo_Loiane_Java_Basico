package Exercicio45;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int somaRespostasCorretas = 0;
        int totalAlunos = 0;
        int maiorAcerto = -1;
        int menorAcerto = Integer.MAX_VALUE;

        while (true) {
            int numeroQuestoes = 10;
            String[] respostas = new String[numeroQuestoes];

            for (int i = 0; i < numeroQuestoes; i++) {
                System.out.println("Informe qual opção você marcou na " + (i + 1) + "ª Questão?");
                String questao = scan.next();
                respostas[i] = questao;
            }

            String[] respostasCorretas = { "a", "b", "c", "d", "e", "e", "d", "c", "b", "a" };
            int respostasCorretasCount = 0;

            for (int i = 0; i < numeroQuestoes; i++) {
                if (respostas[i].equalsIgnoreCase(respostasCorretas[i])) {
                    respostasCorretasCount++;
                }
            }

            System.out.println("Você acertou " + respostasCorretasCount + " questões.");
            somaRespostasCorretas += respostasCorretasCount;
            totalAlunos++;

            // Atualize o maior e o menor acerto
            if (respostasCorretasCount > maiorAcerto) {
                maiorAcerto = respostasCorretasCount;
            }
            if (respostasCorretasCount < menorAcerto) {
                menorAcerto = respostasCorretasCount;
            }

            String resposta;

            while (true) {
                System.out.println("Outro Aluno deseja verificar quantas questões acertou? \nS - Sim \nN - Não");
                resposta = scan.next();

                if (resposta.equalsIgnoreCase("n") || resposta.equalsIgnoreCase("s")) {
                    break;
                } else {
                    System.out.println("Informe a opção correta!");
                }
            }

            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println(totalAlunos + " Alunos usaram o sistema.");

        if (totalAlunos > 0) {
            int mediaNotas = somaRespostasCorretas / totalAlunos;
            System.out.println("A média das notas é: " + mediaNotas);
            System.out.println("O Maior Acerto é: " + maiorAcerto);
            System.out.println("O Menor Acerto é: " + menorAcerto);
        } else {
            System.out.println("Nenhum aluno usou o sistema.");
        }

        scan.close();
    }
}

