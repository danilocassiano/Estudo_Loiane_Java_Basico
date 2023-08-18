package Exercicio39;
import java.util.Scanner;
public class AlturaAlunos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double alturaMaisAlto = Double.MIN_VALUE, alturaMaisBaixo = Double.MAX_VALUE;
        int numeroAlto = -1, numeroBaixo = -1;

        while (true) {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Qual o seu número?");
                int numero = scan.nextInt();

                System.out.println("Qual a sua altura?");
                double altura = scan.nextDouble();


                if (altura > alturaMaisAlto) {
                    alturaMaisAlto = altura;
                    numeroAlto = numero;
                }

                if (altura < alturaMaisBaixo) {
                    alturaMaisBaixo = altura;
                    numeroBaixo = numero;
                }
            }

            System.out.println("Aluno mais alto: Número: " + numeroAlto + ", Altura: " + alturaMaisAlto);
            System.out.println("Aluno mais baixo: Número: " + numeroBaixo + ", Altura: " + alturaMaisBaixo);

            scan.close();
        }
    }
}