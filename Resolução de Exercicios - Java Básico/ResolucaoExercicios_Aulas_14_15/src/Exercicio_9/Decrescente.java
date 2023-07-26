package ResolucaoExercicios_Aulas_14_15.src.Exercicio_9;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Decrescente {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double primeiroNumero, segundoNumero, terceiroNumero;

        System.out.println("Informe o primeiro Número");
        primeiroNumero = scan.nextDouble();
        System.out.println("Informe o segundo Número");
        segundoNumero = scan.nextDouble();
        System.out.println("Informe o terceiro Número");
        terceiroNumero = scan.nextDouble();

        //Peguei os números informados e coloquei dentro de um Array.
        Double[] numeros = {primeiroNumero, segundoNumero, terceiroNumero};

        //No Arrays.sort (usado pra colocar tudo em ordem crescente), foi colocado 2 paramentos, um deles puxando
        //o array criado e o outro chamando o Comparator.reverseOrder para inverter a ordem dos numeros
        // imprimindo assim eles decrescente.
        Arrays.sort(numeros, Comparator.reverseOrder());
        System.out.println(Arrays.toString(numeros));


    }
}