package Exercicio2;

import java.util.Scanner;
public class Login {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Digite seu Login");
            String login = scan.nextLine();

            System.out.println("Digite sua Senha");
            String senha = scan.nextLine();

            if(login.equals(senha) ){
                System.out.println("Sua Senha não pode ser identica ao Login. Tente Novamente.");
            }else{
                System.out.println("Autenticação realizada com Sucesso!");
                break;
            }
        }
        scan.close();
    }

}
