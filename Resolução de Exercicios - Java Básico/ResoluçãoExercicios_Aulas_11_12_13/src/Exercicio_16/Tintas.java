package ResoluçãoExercicios_Aulas_11_12_13.src.Exercicio_16;

import java.util.Scanner;
public class Tintas {
    public static void main(String[] args) {
        // Informações sobre a tinta
        double coberturaLitros = 1;  // 1 litro para cada 3 metros quadrados
        int capacidadeLata = 18;    // litros
        double precoLata = 80.00;   // em reais

        // Entrada do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho da área a ser pintada em metros quadrados: ");
        double areaPintada = scanner.nextDouble();

        // Cálculo da quantidade de latas e preço total
        int litrosNecessarios = (int) Math.ceil(areaPintada / 3);
        int latasNecessarias = (int) Math.ceil(litrosNecessarios / (double) capacidadeLata);
        double precoTotal = latasNecessarias * precoLata;

        // Exibição dos resultados
        System.out.println("\nQuantidade de latas necessárias: " + latasNecessarias);
        //%.2f pra imprimir os dois valore (Flutuantes) antes do ponto.
        System.out.printf("Preço total: R$ %.2f\n", precoTotal);
    }
}
