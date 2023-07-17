//EXERCÍCIO
import java.util.Scanner;

public class Sexo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o seu sexo? F ou M?");
        String sexo = scan.next();

        //aqualsIgnoreCase serve pra não importar se a letra é minuscula ou maiuscula.
        if (sexo.equalsIgnoreCase("M")) {
            System.out.print("Seu sexo é Masculino");
        } else if (sexo.equalsIgnoreCase("F")) {
            System.out.print("Seu sexo é Feminino");
        } else {
            System.out.print("Sexo Inválido");
        }


    }

}