package ResolucaoExercicios_Aulas_14_15.src.Exercicio24;

import java.util.Scanner;

public class Operacao {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número");
        String numeroUm = scan.next();
        decimal(numeroUm);

        System.out.println("Informe o segundo número");
        String numeroDois = scan.next();
        decimal(numeroDois);


    }

    public static void decimal(String numero){

        double solucao = Double.parseDouble(numero) % 2;

        if(solucao == 0 ){
            System.out.println("Esse número é Par!");
        }else{
            System.out.println("Esse número é Impar!");
        }

        double resultado = Double.parseDouble(numero);

        if(resultado < 0){
            System.out.println("Esse número é Negativo!");
        }else{
            System.out.println("Esse número é Positivo!");
        }


        double numeroArredondado = Math.round(Double.parseDouble(numero)); // Converte a string para double e arredonda

        if (Double.parseDouble(numero) == numeroArredondado) {
            System.out.println("O valor informado é Inteiro!");
        } else {
            System.out.println("O valor informado é Decimal!");
        }

    }
}
