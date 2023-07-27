package Estudos_SwitchCase;
import java.util.Scanner;

public class DiasSemanas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*while (true) {

            System.out.println("Digite de 1 a 7 pra indicar o dia da semana");
            int diaSemana = scan.nextInt();


            if (diaSemana == 1) {
                System.out.println("Segunda-Feira"); break;
            } else if (diaSemana == 2) {
                System.out.println("Terça-Feira");break;
            } else if (diaSemana == 3) {
                System.out.println("Quarta-Feira");break;
            } else if (diaSemana == 4) {
                System.out.println("Quinta-Feira");break;
            } else if (diaSemana == 5) {
                System.out.println("Sexta-Feira");break;
            } else if (diaSemana == 6) {
                System.out.println("Sábado");break;
            } else if (diaSemana == 7) {
                System.out.println("Domingo");break;
            } else {
                System.out.println("Você digitou o número errado, tente novamente");
            }
        } */


        int dia;

        while (true) {
            System.out.println("Digite de 1 a 7 para indicar o dia da semana:");
            dia = scan.nextInt();

            if (dia >= 1 && dia <= 7) {
                break; // Número válido, sai do loop
            } else {
                System.out.println("Você digitou um número inválido. Digite de 1 a 7.");
            }
        }

            switch (dia) {
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
                    System.out.println("Sexta-Feita");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Você digitou o número errado");
            }
    }
}