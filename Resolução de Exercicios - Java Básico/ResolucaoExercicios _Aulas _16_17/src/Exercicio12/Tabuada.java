package Exercicio12;
import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual Tabuada você deseja?");
        int tabuada = scan.nextInt();

        int multi = 0;
        int i;

        System.out.println("Tabuada de " + tabuada + ":");

        for(i = 0 ; i < 11 ; ++i ){
            multi= tabuada * i;
            System.out.println(tabuada + " x " + i + " = " + multi);
        }



    }
}
