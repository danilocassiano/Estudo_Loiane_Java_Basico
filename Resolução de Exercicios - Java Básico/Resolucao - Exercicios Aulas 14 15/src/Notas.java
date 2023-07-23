//EXERCICIO 14

import java.util.Scanner;

public class Notas {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a Primeira Nota");
        double nota1 = scan.nextDouble();
        System.out.println("Informe a Segunda Nota");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if(media < 4 && media >= 0){
            System.out.print("Sua nota foi de: " + media + " e seu Conceito é: E.");
        }else if(media < 6 && media > 4){
            System.out.print("Sua nota foi de: " + media + " e seu Conceito é: D.");
        }else if(media < 7.5 && media > 6){
            System.out.print("Sua nota foi de: " + media + " e seu Conceito é: C.");
        } else if(media < 9 && media > 7.5) {
            System.out.print("Sua nota foi de: " + media + " e seu Conceito é: B.");
        }else{
            System.out.print("Sua nota foi de: " + media + " e seu Conceito é: A.");
        }


    }
}