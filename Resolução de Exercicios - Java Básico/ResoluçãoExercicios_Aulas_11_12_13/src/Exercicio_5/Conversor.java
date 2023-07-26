package ResoluçãoExercicios_Aulas_11_12_13.src.Exercicio_5;

import java.util.Scanner;
public class Conversor {
    public static void main(String[] args){
    Scanner conv = new Scanner(System.in);

    System.out.println("Quantos metros você quer converter para centimentros?");
    int metros = conv.nextInt();

    int resultado = metros * 100;

    System.out.println(metros + " metros são " + resultado + " centimentros");

    }
}