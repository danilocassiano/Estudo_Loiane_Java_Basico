//EXERCICIO 13

import java.util.Scanner;

public class Checkup {
    public static void main(String[] args){
        Scanner check = new Scanner(System.in);

        String sexo;
        double altura, pesoIdealM, pesoIdealF, pesoIdeal;

        System.out.println("Qual a sua altura?");
        altura = check.nextDouble();
        while (true) {
            System.out.println("Qual o seu sexo? Digite M para masculino ou F para feminino: ");
            sexo = check.next();
            if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")) {
                break; // Sai do loop se o sexo for válido.
            } else {
                System.out.println("Sexo inválido. Digite M ou F.");
            }
        }

        pesoIdealM =  (72.7 * altura) - 58;
        pesoIdealF =  (62.1 * altura) - 44.7;


        if(sexo.equalsIgnoreCase("M")){
            System.out.println("Seu peso ideal é: " + pesoIdealM);
        }else if (sexo.equalsIgnoreCase("F")){
            System.out.println("Seu peso ideal é: " + pesoIdealF);
        }

        System.out.println("Qual seu peso?");
        pesoIdeal = check.nextDouble();

        if (sexo.equalsIgnoreCase("M")) {
            if (pesoIdeal < pesoIdealM) {
                System.out.println("Você está abaixo do peso!");
            } else if (pesoIdeal > pesoIdealM) {
                System.out.println("Você está acima do peso!");
            } else {
                System.out.println("Você está na média do peso!");
            }
        } else if (sexo.equalsIgnoreCase("F")) {
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