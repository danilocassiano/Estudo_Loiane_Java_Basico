package Exercicio16;

public class Vetor {
    public static void main(String[] args) {
        int [] vetorA = new int[10];

        vetorA [0] = 1;
        vetorA [1] = 2;
        vetorA [2] = 3;
        vetorA [3] = 4;
        vetorA [4] = 5;
        vetorA [5] = 15;
        vetorA [6] = 20;
        vetorA [7] = 25;
        vetorA [8] = 30;
        vetorA [9] = 15;

        int soma = 0;
        int contador = 0;
        int somaMaiorQuinze = 0;
        int contadorMaior = 0;

        for( int i = 0; i < vetorA.length; i++){
            if(vetorA[i] < 15){
                soma += vetorA[i];
            }

            if(vetorA[i] == 15){
                contador++;
            }

            if( vetorA[i] > 15){
                somaMaiorQuinze += vetorA[i];
                contadorMaior++;
            }
        }

        int media = somaMaiorQuinze / contadorMaior;

        System.out.println("A soma dos valores menores que 15 é de: " + soma);
        System.out.println("Existem " + contador + " Numeros 15 dentro desse Vetor.");
        System.out.println("A média dos números maiores que 15 é de: " + media);
    }
}
