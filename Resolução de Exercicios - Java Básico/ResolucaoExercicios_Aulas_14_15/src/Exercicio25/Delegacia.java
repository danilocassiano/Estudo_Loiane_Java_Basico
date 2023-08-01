package ResolucaoExercicios_Aulas_14_15.src.Exercicio25;

import java.util.Scanner;

public class Delegacia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int contador = 0;

        System.out.println("Telefonou para a vítima? Sim ou Não?");
        String telefone = scan.next();

        System.out.println("Esteve no local do crime? Sim ou Não?");
        String local = scan.next();

        System.out.println("Mora perto da vítima? Sim ou Não?");
        String morou = scan.next();

        System.out.println("Devia para a vítima? Sim ou Não");
        String devia = scan.next();

        System.out.println("Já  trabalhou  com  a  vítima? Sim ou Não?");
        String trabalhou = scan.next();

        if (telefone.equalsIgnoreCase("Sim")) {
            contador++;
        }

        if (local.equalsIgnoreCase("Sim")) {
            contador++;
        }

        if (morou.equalsIgnoreCase("Sim")) {
            contador++;
        }

        if (devia.equalsIgnoreCase("Sim")) {
            contador++;
        }

        if (trabalhou.equalsIgnoreCase("Sim")) {
            contador++;
        }


        if (contador == 2) {
            System.out.println("Você é Suspeito!");
        } else if (contador == 3 || contador == 4) {
            System.out.println("Você é Cumplíce!");
        } else if (contador == 5) {
            System.out.println("Você é Culpado!");
        } else {
            System.out.println("Inocente");
        }

    }

}
