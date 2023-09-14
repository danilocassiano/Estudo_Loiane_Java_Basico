package Exercicio17;

public class Vetor {
    public static void main(String[] args) {
        int[] vetorA = new int[10];

        vetorA[0] = 1;
        vetorA[1] = 2;
        vetorA[2] = 3;
        vetorA[3] = 4;
        vetorA[4] = 5;
        vetorA[5] = 45;
        vetorA[6] = 40;
        vetorA[7] = 25;
        vetorA[8] = 30;
        vetorA[9] = 15;

        int contador = 0;

        for(int i = 0; i < vetorA.length; i++){
            if(vetorA[i] > 35){
                contador ++;
            }
        }
        System.out.println("Existem " + contador + " Pessoas com idade acima de 35 anos.");
    }
}