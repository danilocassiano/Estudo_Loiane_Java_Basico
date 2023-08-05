package Exercicio7;
import java.util.Scanner;

public class MaiorDeles {

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

        if(primeiro > segundo && primeiro > terceiro && primeiro > quarto && primeiro > quinto){
            System.out.println(primeiro + " - " + segundo + " - " + terceiro + " - " + quarto + " - " + quinto);
            System.out.println("O maior número é: " + primeiro + ".");
        } else if (segundo > primeiro && segundo > terceiro && segundo > quarto && segundo > quinto) {
            System.out.println(primeiro + " - " + segundo + " - " + terceiro + " - " + quarto + " - " + quinto);
            System.out.println("O maior número é: " + segundo + ".");
        } else if (terceiro > primeiro && terceiro > segundo && terceiro > quarto && terceiro > quinto) {
            System.out.println(primeiro + " - " + segundo + " - " + terceiro + " - " + quarto + " - " + quinto);
            System.out.println("O maior número é: " + terceiro + ".");
        } else if (quarto > primeiro && quarto > segundo && quarto >terceiro && quarto > quinto) {
            System.out.println(primeiro + " - " + segundo + " - " + terceiro + " - " + quarto + " - " + quinto);
            System.out.println("O maior número é: " + quarto + ".");
        }else{
            System.out.println(primeiro + " - " + segundo + " - " + terceiro + " - " + quarto + " - " + quinto);
            System.out.println("O maior número é: " + quinto + ".");
        }

        scan.close();
    }
}
