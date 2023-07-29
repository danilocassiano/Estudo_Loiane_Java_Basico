package ResolucaoExercicios_Aulas_14_15.src.Exercicio21;

import java.util.Scanner;
public class CaixaEletronico {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


            System.out.println("Qual o valor do Saque?");
            String saque = scan.next();

            contaBancaria(saque);
    }

    public static boolean contaBancaria(String dinheiro) {
        int nota1 = 0, nota5 = 0, nota10 = 0, nota50 = 0, nota100 = 0, dezenas = 0, centenas = 0, unidades = 0;


        if (dinheiro.length() == 3) {
            try {
                centenas = Integer.parseInt(dinheiro.substring(0, 1));
                dezenas = Integer.parseInt(dinheiro.substring(1, 2));
                unidades = Integer.parseInt(dinheiro.substring(2, 3));

            } catch (NumberFormatException e) {
                return false;
            }

            nota100 = centenas;

            if (dezenas == 5) {
                nota50 = 1;
            } else if (dezenas < 5) {
                nota10 = dezenas;
            } else if (dezenas > 5 && dezenas < 10) {
                nota50 = 1;
                nota10 = dezenas - 5;
            }

            if (unidades >= 5 && unidades < 10) {
                nota5 = 1;
                nota1 = unidades - 5;
            } else if (unidades < 5) {
                nota1 = unidades;
            } else if (unidades == 5) {
                nota5 = 1;
            }

            System.out.println("Contagem de Notas!");
            System.out.println("Nota de 100: " + nota100);
            System.out.println("Nota de 50: " + nota50);
            System.out.println("Nota de 10: " + nota10);
            System.out.println("Nota de 5: " + nota5);
            System.out.println("Nota de 1: " + nota1);

            return true;

        }else if(dinheiro.length() == 2) {
            try {
                dezenas = Integer.parseInt(dinheiro.substring(0,1));
                unidades = Integer.parseInt(dinheiro.substring(1,2));
            }catch (NumberFormatException e){
                return false;
            }

            if (dezenas == 5) {
                nota50 = 1;
            } else if (dezenas < 5) {
                nota10 = dezenas;
            } else if (dezenas > 5 && dezenas < 10) {
                nota50 = 1;
                nota10 = dezenas - 5;
            }

            if (unidades >= 5 && unidades < 10) {
                nota5 = 1;
                nota1 = unidades - 5;
            } else if (unidades < 5) {
                nota1 = unidades;
            } else if (unidades == 5) {
                nota5 = 1;
            }

            System.out.println("Contagem de Notas!");
            System.out.println("Nota de 50: " + nota50);
            System.out.println("Nota de 10: " + nota10);
            System.out.println("Nota de 5: " + nota5);
            System.out.println("Nota de 1: " + nota1);

            return true;

        }else if(dinheiro.length() == 1){
            try{
                unidades = Integer.parseInt(dinheiro.substring(0,1));
            }catch (NumberFormatException e){
                return false;
            }

            if (unidades >= 5 && unidades < 10) {
                nota5 = 1;
                nota1 = unidades - 5;
            } else if (unidades < 5) {
                nota1 = unidades;
            } else if (unidades == 5) {
                nota5 = 1;
            }

            System.out.println("Contagem de Notas!");
            System.out.println("Nota de 5: " + nota5);
            System.out.println("Nota de 1: " + nota1);

            return true;
        }

        return false;
    }

}
