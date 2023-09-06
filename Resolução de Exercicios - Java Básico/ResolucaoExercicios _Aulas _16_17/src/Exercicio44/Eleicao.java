package Exercicio44;

import java.util.Scanner;

public class Eleicao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lula = 0;
        int color = 0;
        int FH = 0;
        int dilma = 0;
        int votoNulo = 0;
        int votoBranco = 0;
        int i = 1;

        while (true) {
            System.out.println("Qual candidato você deseja votar?\n 1 - Lula \n 2 - Color \n 3 - Fernando Henrique \n 4 - Dilma \n 5 - Voto Nulo \n 6 - Voto em Branco");
            int numeroVotacao = scan.nextInt();


            if (numeroVotacao == 1) {
                    lula += i;
            } else if (numeroVotacao == 2) {
                    color += i;
            } else if (numeroVotacao == 3) {
                    FH += i;
            } else if (numeroVotacao == 4) {
                dilma += i;
            } else if (numeroVotacao == 5) {
                    votoNulo += i;
            } else if (numeroVotacao == 6) {
                    votoBranco += i;
            }else{
                System.out.println("Digite uma opção valida!");
                continue;
            }

            System.out.println("Deseja fazer outro Voto? S - Sim ou N - Não");
            String resposta = scan.next();

            if (resposta.equalsIgnoreCase("n")) {
                break;
            }

        }

        System.out.println("Lula Possui " + lula + " Votos.");
        System.out.println("Color Possui " + color + " Votos.");
        System.out.println("Fernando Henrique Possui " + FH + " Votos.");
        System.out.println("Dilma Possui " + dilma + " Votos.");
        System.out.println("Votos Nulos Possui " + votoNulo + " Votos.");
        System.out.println("Votos em Branco Possui " + votoBranco + " Votos.");

        scan.close();

    }
}
