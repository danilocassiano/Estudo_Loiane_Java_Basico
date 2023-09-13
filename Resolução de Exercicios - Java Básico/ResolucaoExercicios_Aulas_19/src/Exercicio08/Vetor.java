package Exercicio08;

public class Vetor {
    public static void main(String[] args) {

        int [] vetorA = new int[10];
        int [] vetorB = new int[10];
        int [] vetorC = new int[10];

        vetorA [0] = 1;
        vetorA [1] = 2;
        vetorA [2] = 3;
        vetorA [3] = 4;
        vetorA [4] = 5;
        vetorA [5] = 6;
        vetorA [6] = 7;
        vetorA [7] = 8;
        vetorA [8] = 9;
        vetorA [9] = 10;

        vetorB [0] = 2;
        vetorB [1] = 4;
        vetorB [2] = 6;
        vetorB [3] = 8;
        vetorB [4] = 10;
        vetorB [5] = 12;
        vetorB [6] = 14;
        vetorB [7] = 16;
        vetorB [8] = 18;
        vetorB [9] = 20;

        for(int i = 0; i < vetorA.length; i++){
            vetorC[i] = vetorB[i] / vetorA[i];
        }

        System.out.println("Vetor C:");
        for (int i = 0; i < vetorC.length; i++){
            System.out.println("C[" + i + "] = " + vetorC[i]);
        }
    }
}
