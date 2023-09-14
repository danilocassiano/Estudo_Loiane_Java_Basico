package Exercicio18;

public class Vetor {
    public static void main(String[] args) {
        int[] vetorA = new int[10];

        vetorA[0] = 1;
        vetorA[1] = 2;
        vetorA[2] = 3;
        vetorA[3] = 4;
        vetorA[4] = 5;
        vetorA[5] = 15;
        vetorA[6] = 20;
        vetorA[7] = 25;
        vetorA[8] = 30;
        vetorA[9] = 15;

        int numeroMaior = Integer.MIN_VALUE;
        int numeroMenor = Integer.MAX_VALUE;
        int indiceMaior = -1;
        int indiceMenor = -1;


        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] > numeroMaior) {
                numeroMaior = vetorA[i];
                indiceMaior = i;
            }
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] < numeroMenor) {
                numeroMenor = vetorA[i];
                indiceMenor = i;
            }
        }
        System.out.println("O maior número do Array é: " + numeroMaior + " e o indice dele é: " + indiceMaior);
        System.out.println("O menor número do Array é: " + numeroMenor + " e o indice dele é: " + indiceMenor);
    }
}
