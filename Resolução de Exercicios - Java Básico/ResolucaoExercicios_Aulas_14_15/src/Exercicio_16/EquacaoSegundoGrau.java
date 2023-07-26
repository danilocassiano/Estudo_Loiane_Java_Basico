package ResolucaoExercicios_Aulas_14_15.src.Exercicio_16;

import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de a:");
        double a = scan.nextDouble();

        if (a == 0) {
            System.out.println("A equação não é do segundo grau. Programa encerrado.");
            scan.close();
            return;
        }

        System.out.println("Digite o valor de b:");
        double b = scan.nextDouble();

        System.out.println("Digite o valor de c:");
        double c = scan.nextDouble();

        // Calculo do Delta (b^2 - 4ac)
        double delta = b * b - 4 * a * c;



        if (delta < 0) {
            System.out.println("A equação não possui raízes reais. Programa encerrado.");
        } else if (delta == 0) {
            double raizUnica = -b / (2 * a);
            System.out.println("A equação possui uma única raiz real: x = " + raizUnica);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação possui duas raízes reais: x1 = " + raiz1 + ", x2 = " + raiz2);
        }

        scan.close();
    }
}
