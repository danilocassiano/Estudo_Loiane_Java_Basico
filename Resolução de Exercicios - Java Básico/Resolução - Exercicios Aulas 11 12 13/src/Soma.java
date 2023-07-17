// EXERCICIO 3
import java.util.Scanner;
public class Soma{
    public static void main(String[] args){
        Scanner soma = new Scanner(System.in);

        //int soma, primeiroNumero, segundoNumero = 0;

        System.out.println("Digite o primeiro número");
        int primeiroNumero = soma.nextInt();

        System.out.println("Digite o segundo número");
        int segundoNumero = soma.nextInt();

        int resultado = primeiroNumero + segundoNumero;

        System.out.println("A soma dos numeros é: " + resultado);
    }
}

