package ResoluçãoExercicios_Aulas_11_12_13.src.Exercicio_12;
import java.util.Scanner;
public class PesoIdeal {
    public static void main(String[] args) {
        Scanner altura = new Scanner(System.in);

        System.out.println("Qual o sua altura?");
        double valor = altura.nextDouble();

        double pesoIdeal = ( 72.7 * valor) - 58;

        System.out.println("Seu peso ideal é: " + pesoIdeal);

    }
}