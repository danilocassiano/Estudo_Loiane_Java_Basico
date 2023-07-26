package ResolucaoExercicios_Aulas_14_15.src.Exercicio_15;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do Primeiro lado do Triângulo");
        double lado1 = scan.nextDouble();
        System.out.println("Informe o valor do Segundo lado do Triângulo");
        double lado2 = scan.nextDouble();
        System.out.println("Informe o valor do Terceiro lado do Triângulo");
        double lado3 = scan.nextDouble();

        // Verificando se é Triângulo
        if ((lado1 + lado2 > lado3) && (lado2 + lado3 > lado1) && (lado1 + lado3 > lado2)) {
            if ((lado1 == lado2) && (lado2 == lado3)) {
                System.out.println("É um Triângulo Equilátero.");
            } else if ((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Não é Triângulo.");
        }

        scan.close();
    }
}
