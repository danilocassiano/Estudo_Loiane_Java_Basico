//EXERCICIO 10

import java.util.Scanner;

public class Turno {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Que Turno você Estuda?");
        System.out.println("Digite M-matutino  ou  V-Vespertino  ou  N-Noturno");
        String turno = scan.next();

        if(turno.equalsIgnoreCase("M")){
            System.out.println("Bom Dia!");
        }else if(turno.equalsIgnoreCase("V" )){
            System.out.println("Boa Tarde!");
        }else if (turno.equalsIgnoreCase("N")){
            System.out.println("Boa Noite!");
        }else{
            System.out.println("Valor Invalído.");
        }

    }
}