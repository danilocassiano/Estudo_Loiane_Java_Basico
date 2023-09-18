package Exercicio02;

public class Matriz {
    public static void main(String[] args) {

        int[][] matriz = {
                {2, 6, 8, 3, 5, 6, 8, 1, 6, 7},
                {8, 9, 6, 3, 6, 4, 6, 4, 7, 6},
                {5, 4, 6, 8, 2, 0, 1, 2, 3, 4},
                {8, 9, 6, 3, 6, 7, 8, 6, 2, 1},
                {6, 4, 6, 4, 3, 7, 1, 6, 4, 2}, // linha 5
                {7, 6, 5, 4, 7, 8, 6, 4, 6, 7},
                {1, 2, 3, 4, 3, 5, 7, 7, 3, 1},
                {9, 8, 7, 6, 8, 6, 3, 7, 5, 1},
                {5, 4, 6, 8, 2, 4, 8, 3, 7, 0},
                {2, 0, 1, 2, 0, 1, 5, 7, 6, 3}
        };

        int linhaDesejada = 5 - 1;
        int colunaDesejada = 7 - 1;

        int minimoLinha5 = Integer.MAX_VALUE;
        int maximoLinha5 = Integer.MIN_VALUE;

        int minimoColuna7 = Integer.MAX_VALUE;
        int maximoColuna7 = Integer.MIN_VALUE;

        for (int i = 0; i < matriz[linhaDesejada].length; i++) {
            int valorLinha5 = matriz[linhaDesejada][i];


            if (valorLinha5 < minimoLinha5) {
                minimoLinha5 = valorLinha5;
            }

            if (valorLinha5 > maximoLinha5) {
                maximoLinha5 = valorLinha5;
            }

            int valorColuna7 = matriz[i][colunaDesejada]; // Ajuste para acessar a coluna 7


            if (valorColuna7 < minimoColuna7) {
                minimoColuna7 = valorColuna7;
            }

            if (valorColuna7 > maximoColuna7) {
                maximoColuna7 = valorColuna7;
            }
        }

        System.out.println("O valor mínimo na linha 5 é: " + minimoLinha5);
        System.out.println("O valor máximo na linha 5 é: " + maximoLinha5);

        System.out.println("O valor mínimo na coluna 7 é: " + minimoColuna7);
        System.out.println("O valor máximo na coluna 7 é: " + maximoColuna7);
    }
}
