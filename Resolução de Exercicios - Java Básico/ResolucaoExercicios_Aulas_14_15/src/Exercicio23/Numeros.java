package ResolucaoExercicios_Aulas_14_15.src.Exercicio23;

import java.util.Scanner;
public class Numeros {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número:");
        double numero = scan.nextDouble();

        double numeroArredondado = Math.round(numero); // Utiliza a função Math.round para arredondar o número

        if (numero == numeroArredondado) {
            System.out.println("O valor informado é Inteiro.");
        } else {
            System.out.println("O valor informado é Decimal.");
        }
    }

}
