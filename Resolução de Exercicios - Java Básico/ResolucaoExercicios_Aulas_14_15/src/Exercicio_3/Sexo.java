package ResolucaoExercicios_Aulas_14_15.src.Exercicio_3;

import java.util.Scanner;

public class Sexo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Qual o seu sexo? F ou M?");
            String sexo = scan.next();

                //aqualsIgnoreCase serve pra não importar se a letra é minuscula ou maiuscula.

            if (sexo.equalsIgnoreCase("M")) {
                System.out.print("Seu sexo é Masculino");
                break;
            } else if (sexo.equalsIgnoreCase("F")) {
                System.out.print("Seu sexo é Feminino");
                break;
            } else {
                System.out.println("Letra Inválida, tente novamente.");
            }
        }
    }
}