package ResolucaoExercicios_Aulas_14_15.src.Exercicio_6;

import java.util.Scanner;

public class NumeroMaior {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número");
        double primeiroNumero = scan.nextDouble();
        System.out.println("Informe o segundo número");
        double segundoNumero = scan.nextDouble();
        System.out.println("Informe o terceiro número");
        double terceiroNumero = scan.nextDouble();

        if(primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero){
            System.out.print(primeiroNumero);
        } else if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
            System.out.print(segundoNumero);
        }else{
            System.out.print(terceiroNumero);
        }
    }
}