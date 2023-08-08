package Exercicio21;
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número.");
        int numero = scan.nextInt();
        int i;

        if (numero > 1) {
            int qtdDivisivel = 0;
            for (i = 2; i <= numero; i++) { // Começa a partir de 2
                if (numero % i == 0) {
                    qtdDivisivel++;
                }
            }

            if (qtdDivisivel == 1) { // Verifica se tem exatamente 1 divisor além de 1 (ele mesmo)
                System.out.println("Esse número é Primo.");
            } else {
                System.out.println("Esse número não é Primo.");
            }

        } else {
            System.out.println("Esse número não é Primo.");
        }
    }
}
