package Exercicio13;
import java.util.Scanner;
public class Potencia {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número para a Base.");
        int base = scan.nextInt();

        System.out.println("Informe um número para o Expoente.");
        int expoente = scan.nextInt();

        int multi = base;
        int i = 1;

        do {
            multi *= base;
            i++;

        }while(i <= expoente);

        System.out.println("O resultado é: " + multi);
    }
}
