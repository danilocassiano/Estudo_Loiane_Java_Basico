//EXERCICIO 1

import java.util.Scanner;

public class MaiorDeles {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe um número");
    int primeiroNumero = scan.nextInt();

    System.out.println("Informe um segundo número");
    int segundoNumero = scan.nextInt();

    if(primeiroNumero > segundoNumero){
        System.out.print("O número maior é: " + primeiroNumero);
    }else{
        System.out.print("O número maior é: " + segundoNumero);
    }
    }
}