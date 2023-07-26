package ResolucaoExercicios_Aulas_14_15.src.Exercicio_2;

import java.util.Scanner;

public class TiposDeNumeros {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número positivo ou negativo");
        int numero = scan.nextInt();

        if(numero >= 0){
            System.out.print("O número é Positivo");
        }else{
            System.out.print("O número é Negativo");
        }
    }
}