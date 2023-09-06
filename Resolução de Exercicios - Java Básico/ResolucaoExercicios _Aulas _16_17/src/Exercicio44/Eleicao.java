package Exercicio44;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Eleicao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        int lula = 0;
        int color = 0;
        int FH = 0;
        int dilma = 0;
        int votoNulo = 0;
        int votoBranco = 0;


        while (true) {
            System.out.println("Qual candidato você deseja votar?\n 1 - Lula \n 2 - Color \n 3 - Fernando Henrique \n 4 - Dilma \n 5 - Voto Nulo \n 6 - Voto em Branco");
            int numeroVotacao = scan.nextInt();


            if (numeroVotacao == 1) {
                    lula += 1;
            } else if (numeroVotacao == 2) {
                    color += 1;
            } else if (numeroVotacao == 3) {
                    FH += 1;
            } else if (numeroVotacao == 4) {
                dilma += 1;
            } else if (numeroVotacao == 5) {
                    votoNulo += 1;
            } else if (numeroVotacao == 6) {
                    votoBranco += 1;
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

        int totalDeVotos = lula + color + FH + dilma + votoBranco + votoNulo;

        String porcentagemLula = df.format((double) lula / totalDeVotos * 100);
        String porcentagemColor = df.format((double) color / totalDeVotos * 100);
        String porcentagemFH = df.format((double) FH / totalDeVotos * 100);
        String porcentagemDilma = df.format((double) dilma / totalDeVotos * 100);
        String porcentagemNulo = df.format((double) votoNulo / totalDeVotos * 100);
        String porcentagemBranco = df.format((double) votoBranco / totalDeVotos * 100);


        System.out.println("Houve um total de " + totalDeVotos + " votos nessa Eleição.");
        System.out.println("Lula Possui " + lula + " Votos. Dando uma porcentagem de " + porcentagemLula + "%.");
        System.out.println("Color Possui " + color + " Votos. Dando uma porcentagem de " + porcentagemColor + "%.");
        System.out.println("Fernando Henrique Possui " + FH + " Votos. Dando uma porcentagem de " + porcentagemFH + "%.");
        System.out.println("Dilma Possui " + dilma + " Votos. Dando uma porcentagem de " + porcentagemDilma + "%.");
        System.out.println("Votos Nulos Possui " + votoNulo + " Votos. Dando uma porcentagem de " + porcentagemNulo + "%.");
        System.out.println("Votos em Branco Possui " + votoBranco + " Votos. Dando uma porcentagem de " + porcentagemBranco + "%.");

        scan.close();

    }
}
