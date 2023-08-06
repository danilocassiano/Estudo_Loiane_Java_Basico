package Exercicio11;
import java.util.Scanner;
public class Soma {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número.");
        int a = scan.nextInt();

        System.out.println("Informe o segundo número.");
        int b = scan.nextInt();

        System.out.println("Números inteiros entre " + a + " e " + b + ":");

        int soma = 0;


        if(a <= b){
            for(int i = a; i <= b; i++){
                soma += i;
                System.out.println(i);

            }
            System.out.println("A soma de todos os valor é: " +  soma + ".");
        }else{
            for (int i = a; i >= b; i--){
                System.out.println(i);
                soma += i;
            }
            System.out.println("A soma de todos os valor é: " +  soma + ".");
        }
        scan.close();

    }
}
