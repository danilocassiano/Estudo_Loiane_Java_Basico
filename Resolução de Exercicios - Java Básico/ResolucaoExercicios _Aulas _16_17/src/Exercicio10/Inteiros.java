package Exercicio10;
import java.util.Scanner;
public class Inteiros {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número.");
        int a = scan.nextInt();

        System.out.println("Informe o segundo número.");
        int b = scan.nextInt();

        System.out.println("Números inteiros entre " + a + " e " + b + ":");

        if(a <= b){
            for(int i = a; i <= b; i++){
                System.out.println(i);
            }
        }else{
            for (int i = a; i >= b; i--){
                System.out.println(i);
            }
        }
        scan.close();
    }
}
