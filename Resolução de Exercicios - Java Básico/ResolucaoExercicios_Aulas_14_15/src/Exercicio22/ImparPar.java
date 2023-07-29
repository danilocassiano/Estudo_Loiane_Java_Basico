package ResolucaoExercicios_Aulas_14_15.src.Exercicio22;

import java.util.Scanner;
public class ImparPar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numero, solucao;

        System.out.println("Digite um número para verificação");
        numero = scan.nextInt();

        solucao = numero % 2;

        if(solucao == 0 ){
            System.out.println("Esse número é Par!");
        }else{
            System.out.println("Esse número é Impar!");
        }
    }
}



