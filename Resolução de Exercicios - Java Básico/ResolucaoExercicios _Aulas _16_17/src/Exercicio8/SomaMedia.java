package Exercicio8;
import java.util.Scanner;
public class SomaMedia {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número.");
        int primeiro = scan.nextInt();

        System.out.println("Informe o segundo número.");
        int segundo = scan.nextInt();

        System.out.println("Informe o terceiro número.");
        int terceiro = scan.nextInt();

        System.out.println("Informe o quarto número.");
        int quarto = scan.nextInt();

        System.out.println("Informe o quinto número.");
        int quinto = scan.nextInt();

        int soma = primeiro + segundo + terceiro + quarto + quinto;
        int media = soma / 5;

        System.out.println(primeiro + " - " + segundo + " - " + terceiro + " - " + quarto + " - " + quinto);
        System.out.println("Soma dos números é: " + soma + ".");
        System.out.println("A média dos números é: " + media + ".");
    }
}
