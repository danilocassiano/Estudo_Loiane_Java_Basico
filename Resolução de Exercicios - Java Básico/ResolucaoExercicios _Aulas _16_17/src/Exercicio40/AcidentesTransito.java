package Exercicio40;
import java.util.Scanner;

public class AcidentesTransito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double indiceMaisAlto = Double.MIN_VALUE, indiceMaisBaixo = Double.MAX_VALUE;
        int codigoAlto = -1, codigoBaixo = -1;
        double media = 0, mediaFinal = 0, mediaAcidente = 0, mediaAcidenteFinal = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Qual o Código da cidade?");
            int codigo = scan.nextInt();

            System.out.println("Qual o Número de veículos de passeio (em 1999)?");
            int veiculos = scan.nextInt();

            System.out.println("Qual o Número de acidentes de trânsito com vítimas (em 1999)?");
            int acidentes = scan.nextInt();

            if (acidentes > indiceMaisAlto) {
                indiceMaisAlto = acidentes;
                codigoAlto = codigo;
            }

            if (acidentes < indiceMaisBaixo) {
                indiceMaisBaixo = acidentes;
                codigoBaixo = codigo;
            }

            media += veiculos;

            if (veiculos < 2000) {
                mediaAcidente += acidentes;
                mediaAcidenteFinal = mediaAcidente / i;
            }

        }

        mediaFinal = media / 5;

        System.out.println("O maior índice de Acidentes é na cidade " + codigoAlto + " com " + indiceMaisAlto);
        System.out.println("O menor índice de Acidentes é na cidade " + codigoBaixo + " com " + indiceMaisBaixo);
        System.out.println("A média dos veículos nas 5 cidades é de " + mediaFinal);
        System.out.println("A média de Acidentes nas cidades com menos de 2000 veículos é: " + mediaAcidenteFinal);

        scan.close();
    }
}

