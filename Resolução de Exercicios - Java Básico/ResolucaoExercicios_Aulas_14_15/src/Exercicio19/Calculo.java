package ResolucaoExercicios_Aulas_14_15.src.Exercicio19;

import java.util.Scanner;
public class Calculo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Informe um número menor que Mil");
            String numero = scan.next();

            if(resultado(numero)){
                break;
            }else{
                System.out.println("Número invalido, Tente novamente.");
            }
        }
    }


    public static boolean resultado(String number){
        int centenas, dezenas, unidades;

        if(number.length() == 3){
            try {
                centenas = Integer.parseInt(number.substring(0,1));
                dezenas = Integer.parseInt(number.substring(1,2));
                unidades = Integer.parseInt(number.substring(2,3));
            }catch (NumberFormatException e){
                return false;
            }
            System.out.println(number + " = " + centenas+ " centenas, " + dezenas+ " dezenas e " + unidades + " unidades.");

        }else if(number.length() == 2){
            try {
                dezenas = Integer.parseInt(number.substring(0,1));
                unidades = Integer.parseInt(number.substring(1,2));
            }catch (NumberFormatException e){
                return false;
            }
            System.out.println(number + " = " + dezenas+ " dezenas e " + unidades + " unidades.");

        }else if(number.length()==1){
            try {
                unidades = Integer.parseInt(number.substring(0,1));
            }catch (NumberFormatException e){
                return false;
            }
            System.out.println(number + " = " + unidades + " unidades.");
        }else{
            return false;
        }

        return true;
    }

}

