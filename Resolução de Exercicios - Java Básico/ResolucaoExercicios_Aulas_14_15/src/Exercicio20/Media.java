package ResolucaoExercicios_Aulas_14_15.src.Exercicio20;
import java.util.Scanner;
public class Media {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a Primeira nota");
        double nota1 = scan.nextDouble();
        System.out.println("Informe a Segunda nota");
        double nota2 = scan.nextDouble();
        System.out.println("Informe a Terceira nota");
        double nota3 = scan.nextDouble();


        double media = (nota1 + nota2 + nota3) /3;

        if(media == 10){
            System.out.println("Aprovado com Distinção!");
        }else if(media < 7){
            System.out.println("Reprovado!");
        }else {
            System.out.println("Aprovado!");
        }

    }
}
