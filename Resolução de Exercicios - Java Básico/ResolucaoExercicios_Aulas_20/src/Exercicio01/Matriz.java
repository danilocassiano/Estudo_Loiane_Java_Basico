package Exercicio01;

import java.text.Format;

public class Matriz {
    public static void main(String[] args) {

        int [] [] matriz = new int[4][4];

        matriz[0][0] = 2;
        matriz[0][1] = 4;
        matriz[0][2] = 5;
        matriz[0][3] = 9;

        matriz[1][0] = 3;
        matriz[1][1] = 8;
        matriz[1][2] = 1;
        matriz[1][3] = 5;

        matriz[2][0] = 4;
        matriz[2][1] = 8;
        matriz[2][2] = 2;
        matriz[2][3] = 7;

        matriz[3][0] = 6;
        matriz[3][1] = 4;
        matriz[3][2] = 1;
        matriz[3][3] = 3;

        int minimo = matriz[0][0];
        int maximo = matriz[0][0];
        int valor =0 ;

        for( int i = 0; i < matriz.length; i++){

            for(int j = 0; j < matriz[i].length; j++){

                valor = matriz [i][j];

                if(valor < minimo){
                    minimo = valor;
                }

                if(valor > maximo){
                    maximo = valor;
                }
            }
        }

        int posI =0;
        int posJ =0;

        System.out.println("O valor máximo na matriz é: " + maximo);

        for( posI = 0; posI < matriz.length; posI++){
            for(posJ = 0; posJ < matriz[posI].length; posJ++ ){
                if(matriz[posI][posJ] == maximo){
                    System.out.println("Está na posição " + "["+posI+"]" + "["+posJ+"]");
                }
            }
        }

        System.out.println("O valor mínimo na matriz é: " + minimo);

        for( posI = 0; posI < matriz.length; posI++){
            for(posJ = 0; posJ < matriz[posI].length; posJ++ ){
                if(matriz[posI][posJ] == minimo){
                    System.out.println("Está na posição " + "["+posI+"]" + "["+posJ+"]");
                }
            }
        }
    }
}


