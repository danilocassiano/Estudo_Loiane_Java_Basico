package Exercicio06;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();
        char jogadorAtual = 'X';
        boolean jogoTerminado = false;

        Scanner scanner = new Scanner(System.in);

        while (!jogoTerminado) {
            tabuleiro.exibirTabuleiro();
            System.out.println("É a vez do jogador " + jogadorAtual);
            int linha, coluna;

            do {
                System.out.print("Digite a linha (0, 1, ou 2): ");
                linha = scanner.nextInt();
                System.out.print("Digite a coluna (0, 1, ou 2): ");
                coluna = scanner.nextInt();
            } while (!tabuleiro.fazerJogada(linha, coluna, jogadorAtual));

            jogoTerminado = tabuleiro.verificarResultado() != null;

            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        }

        tabuleiro.exibirTabuleiro();
        String resultado = tabuleiro.verificarResultado();
        if (resultado.equals("Empate")) {
            System.out.println("O jogo terminou em empate!");
        } else {
            System.out.println("O jogador " + resultado + " venceu!");
        }

        scanner.close();
    }
}

class Tabuleiro {
    private char[][] tabuleiro;

    public Tabuleiro() {
        tabuleiro = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    public void exibirTabuleiro() {
        System.out.println("  0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("  ---------");
            }
        }
        System.out.println();
    }

    public boolean fazerJogada(int linha, int coluna, char jogador) {
        if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
            tabuleiro[linha][coluna] = jogador;
            return true;
        } else {
            System.out.println("Jogada inválida. Tente novamente.");
            return false;
        }
    }

    public String verificarResultado() {
        // Verifique as linhas, colunas e diagonais para determinar o resultado do jogo
        for (int i = 0; i < 3; i++) {
            // Verificar linhas
            if (tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2] && tabuleiro[i][0] != ' ') {
                return String.valueOf(tabuleiro[i][0]);
            }
            // Verificar colunas
            if (tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i] && tabuleiro[0][i] != ' ') {
                return String.valueOf(tabuleiro[0][i]);
            }
        }
        // Verificar diagonais
        if (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2] && tabuleiro[0][0] != ' ') {
            return String.valueOf(tabuleiro[0][0]);
        }
        if (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0] && tabuleiro[0][2] != ' ') {
            return String.valueOf(tabuleiro[0][2]);
        }
        // Verificar empate
        boolean empate = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    empate = false;
                    break;
                }
            }
        }
        if (empate) {
            return "Empate";
        }
        return null; // Jogo ainda está em andamento
    }
}
