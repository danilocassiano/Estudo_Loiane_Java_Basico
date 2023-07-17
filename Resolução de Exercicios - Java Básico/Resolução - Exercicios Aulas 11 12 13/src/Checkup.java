//EXERCICIO 13

import java.util.Scanner;

public class Checkup {
    public static void main(String[] args){
        Scanner check = new Scanner(System.in);

        String sexo;
        double altura, pesoIdealM, pesoIdealF, pesoIdeal;

        System.out.println("Qual a sua altura?");
        altura = check.nextDouble();
        System.out.println("Qual o seu sexo? Digite M para masculino ou F para feminino: ");
        sexo = check.next();


        pesoIdealM =  (72.7 * altura) - 58;
        pesoIdealF =  (62.1 * altura) - 44.7;


        if(sexo.equals("M") || sexo.equals("m")){
            System.out.println("Seu peso ideal é: " + pesoIdealM);
        }else if (sexo.equals("F") || sexo.equals("f")){
            System.out.println("Seu peso ideal é: " + pesoIdealF);
        }else{
            System.out.println("Por favor, Coloque o seu sexo correto.");
        }

        System.out.println("Qual seu peso?");
        pesoIdeal = check.nextDouble();

        if (sexo.equals("M") || sexo.equals("m")) {
            if (pesoIdeal < pesoIdealM) {
                System.out.println("Você está abaixo do peso!");
            } else if (pesoIdeal > pesoIdealM) {
                System.out.println("Você está acima do peso!");
            } else {
                System.out.println("Você está na média do peso!");
            }
        } else if (sexo.equals("F") || sexo.equals("f")) {
            if (pesoIdeal < pesoIdealF) {
                System.out.println("Você está abaixo do peso!");
            } else if (pesoIdeal > pesoIdealF) {
                System.out.println("Você está acima do peso!");
            } else {
                System.out.println("Você está na média do peso!");
            }
        }

    }
}