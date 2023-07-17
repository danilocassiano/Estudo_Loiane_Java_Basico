//EXERCICIO 5

import java.util.Scanner;

public class Aprovacao {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a Primeira nota");
        double notaUm = scan.nextDouble();
        System.out.println("Informe a Segunda nota");
        double notaDois = scan.nextDouble();

        Double media = (notaUm + notaDois) / 2;

        if(media >= 7 && media < 10){
            System.out.print("Sua média foi: " + media + ". Você foi Aprovado!");
        }else if (media == 10){
            System.out.print("Sua média foi: " + media + ". Você foi Aprovado com Distinção!");
        }else{
            System.out.println("Sua média foi: " + media + ". Você foi Reprovado!");
        }

    }
}