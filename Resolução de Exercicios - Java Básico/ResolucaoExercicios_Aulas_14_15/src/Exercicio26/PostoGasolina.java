package ResolucaoExercicios_Aulas_14_15.src.Exercicio26;

import java.util.Scanner;
public class PostoGasolina {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Qual o combustivel? A-Alcool e G-Gasolina");
            String combustivel = scan.next();
            System.out.println("Qual o valor para abastecer?");
            double valor = scan.nextDouble();

            double valorGasolina = valor / 2.50;
            double valorAlcool = valor / 1.90;

            double alcoolDesconto = valor - (valor * 0.03);
            double alcoolDesconto2 = valor - (valor * 0.05);
            double gasolinaDesconto = valor - (valor * 0.04);
            double gasolinaDesconto2 = valor - (valor * 0.06);


            if(combustivel.equalsIgnoreCase("A")){
                if(valorAlcool <= 20){
                    System.out.println("O valor total é: " + alcoolDesconto);
                    break;
                } else{
                    System.out.println("O valor total é: " + alcoolDesconto2);
                    break;
                }
            }else if (combustivel.equalsIgnoreCase("G")){
                if(valorGasolina <= 20){
                    System.out.println("O valor total é: " + gasolinaDesconto);
                    break;
                }else{
                    System.out.println("O valor total é: " + gasolinaDesconto2);
                    break;
                }
            }else{
                System.out.println("Opção errada, Tente novamente.");
            }

        }

    }
}
