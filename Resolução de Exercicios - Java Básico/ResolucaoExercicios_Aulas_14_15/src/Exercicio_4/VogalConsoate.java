package ResolucaoExercicios_Aulas_14_15.src.Exercicio_4;//EXERCICIO 4

import java.util.Scanner;
public class VogalConsoate {

public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite uma Letra");
    String letra = scan.next();

    if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
        System.out.print("Essa letra é uma vogal");
    } else if (letra.matches("(?i)[áéíóúâêîôûãõü]")) {
        System.out.print("Essa letra é uma vogal");
    }else if (Character.isLetter(letra.charAt(0))) {
        System.out.print("Essa letra é uma consoante");
    } else {
        System.out.print("Não é vogal nem consoante.");
    }
}
}