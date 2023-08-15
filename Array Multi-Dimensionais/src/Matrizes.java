public class Matrizes {
    public static void main(String[] args) {
        double [][] notasAlunos = new double[4][4];

        notasAlunos [0][0] = 10;
        notasAlunos [0][1] = 7;
        notasAlunos [0][2] = 8;
        notasAlunos [0][3] = 9.5;

        notasAlunos [1][0] = 9;
        notasAlunos [1][1] = 8;
        notasAlunos [1][2] = 7;
        notasAlunos [1][3] = 9;

        notasAlunos [2][0] = 10;
        notasAlunos [2][1] = 5;
        notasAlunos [2][2] = 8;
        notasAlunos [2][3] = 9;

        notasAlunos [3][0] = 9;
        notasAlunos [3][1] = 6;
        notasAlunos [3][2] = 4;
        notasAlunos [3][3] = 10;

        for(int i = 0; i < notasAlunos.length; i++){

            for(int j = 0; j < notasAlunos[i].length; j++){
                System.out.print(notasAlunos[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("Calculando a média de Cada Aluno");

        double soma;

        for(int i = 0; i < notasAlunos.length; i++){

            soma = 0;

            for(int j = 0; j < notasAlunos[i].length; j++){
                soma += notasAlunos[i][j];
            }
            System.out.println("A média do aluno " + i + " é = " + (soma/4));
        }

        //Vetor de apenas 1 aluno.
        double[] notaAlunos1 = {7, 8, 5, 10};

        //Conjunto de vetores de varios alunos.
        double[][] notaAlunos2 = {{7, 8, 5, 10}, {10, 8, 5, 10}, {7, 8, 5, 5}, {7, 8, 5, 10}};

        System.out.println("Output da Matriz");

        for(int i = 0; i < notaAlunos2.length; i++){

            for(int j = 0; j < notaAlunos2[i].length; j++){
                System.out.print(notaAlunos2[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
