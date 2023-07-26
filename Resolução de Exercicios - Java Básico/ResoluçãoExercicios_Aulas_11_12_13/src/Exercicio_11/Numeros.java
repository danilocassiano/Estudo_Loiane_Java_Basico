package ResoluçãoExercicios_Aulas_11_12_13.src.Exercicio_11;
import java.util.Scanner;
public class Numeros {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Informe um número inteiro");
        int primeiroNumero = number.nextInt();
        System.out.println("Informe um segundo número inteiro");
        int segundoNumero = number.nextInt();
        System.out.println("Informe um terceiro número Real");
        double terceiroNumero = number.nextDouble();

        int produto = ( primeiroNumero * 2 ) * ( segundoNumero / 2 );
        double soma = ( primeiroNumero * 3 ) + terceiroNumero;
        double cubo = Math.pow(terceiroNumero,3);

        System.out.println("A solução da questão 'a' é: " + produto);
        System.out.println("A solução da questão 'b' é: " + soma);
        System.out.println("A solução da questão 'c' é: " + cubo);

    }
}