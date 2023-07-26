package ResoluçãoExercicios_Aulas_11_12_13.src.Exercicio_7;

import java.util.Scanner;
public class AreaQuadrado {
    public static void main(String[] args){
        Scanner area = new Scanner(System.in);

        System.out.println("Qual a medida do lado do Quadrado?");
        int quadrado = area.nextInt();

        int resultado = (int) Math.pow(quadrado,2);

        System.out.println("O valor da área é " + resultado + "!");

        int dobro = resultado * 2;
        System.out.println("E o Dobro dessa área é " + dobro + "!");
    }

}