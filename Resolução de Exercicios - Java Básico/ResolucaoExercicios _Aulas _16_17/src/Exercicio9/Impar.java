package Exercicio9;

public class Impar {
    public static void main(String[] args){
        StringBuilder resultado = new StringBuilder();

        int i = 0;

        for(i = 1; i < 50 ; i++){
            if( i % 2 != 0){
                resultado.append(i).append("-");
                System.out.println(i);
            }
        }
    }
}
