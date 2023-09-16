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
                {1, 2, 3, 4, 3, 5, 7, 7, 3, 1}, // linha 7
                {9, 8, 7, 6, 8, 6, 3, 7, 5, 1},
                {5, 4, 6, 8, 2, 4, 8, 3, 7, 0},
                {2, 0, 1, 2, 0, 1, 5, 7, 6, 3}
        };

        int linhaDesejada1 = 5 - 1;
        int linhaDesejada2 = 7 - 1;

        int minimoLinha5 = Integer.MAX_VALUE;
        int maximoLinha5 = Integer.MIN_VALUE;

        int minimoLinha7 = Integer.MAX_VALUE;
        int maximoLinha7 = Integer.MIN_VALUE;

        for (int j = 0; j < matriz[linhaDesejada1].length; j++) {
            int valor = matriz[linhaDesejada1][j];
            System.out.println(valor);

            if (valor < minimoLinha5) {
                minimoLinha5 = valor;
            }

            if (valor > maximoLinha5) {
                maximoLinha5 = valor;
            }
        }
        System.out.println();

        for (int j = 0; j < matriz[linhaDesejada2].length; j++) {
            int valor = matriz[linhaDesejada2][j];
            System.out.println(valor);

            if (valor < minimoLinha7) {
                minimoLinha7 = valor;
            }

            if (valor > maximoLinha7) {
                maximoLinha7 = valor;
            }
        }

        System.out.println("O valor mínimo na linha " + linhaDesejada1 + " é: " + minimoLinha5);
        System.out.println("O valor máximo na linha " + linhaDesejada1 + " é: " + maximoLinha5);

        System.out.println("O valor mínimo na linha " + linhaDesejada2 + " é: " + minimoLinha7);
        System.out.println("O valor máximo na linha " + linhaDesejada2 + " é: " + maximoLinha7);
    }
}

