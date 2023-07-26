package ResoluçãoExercicios_Aulas_11_12_13.src.Exercicio_8;

import java.util.Scanner;
public class HorasTrabalhadas {
    public static void main(String[] args){
        Scanner trab = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        double valor = trab.nextDouble();
        System.out.println("Quantas horas você trabalha?");
        double hora = trab.nextDouble();

        double valorTotal = (valor * hora);

        System.out.println("Você Ganha " + valorTotal + " Reais.");
    }
}