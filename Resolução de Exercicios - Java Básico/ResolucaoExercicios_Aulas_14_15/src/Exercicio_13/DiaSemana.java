package ResolucaoExercicios_Aulas_14_15.src.Exercicio_13;

import java.util.Scanner;

public class DiaSemana {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número pra ser indicado um dia da semana!");

        while (true) {
            int number = scan.nextInt();

            switch (number) {
                case 1:
                    System.out.println("Segunda-Feira");
                    break;
                case 2:
                    System.out.println("Terça-Feira");
                    break;
                case 3:
                    System.out.println("Quarta-Feira");
                    break;
                case 4:
                    System.out.println("Quinta-Feira");
                    break;
                case 5:
                    System.out.println("Sexta-Feira");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Número Invalido, Tente Novamente.");
            }
        }

    }
}