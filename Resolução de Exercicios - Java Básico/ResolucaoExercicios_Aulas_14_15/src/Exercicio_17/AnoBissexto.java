package ResolucaoExercicios_Aulas_14_15.src.Exercicio_17;
import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um ano por favor.");
        int ano = scan.nextInt();

        float divisao = ano % 4;

        if(divisao == 0){
            System.out.println("O ano é Bissexto!");
        }else{
            System.out.print("O ano não é Bisexto!");
        }

        scan.close();
    }
}