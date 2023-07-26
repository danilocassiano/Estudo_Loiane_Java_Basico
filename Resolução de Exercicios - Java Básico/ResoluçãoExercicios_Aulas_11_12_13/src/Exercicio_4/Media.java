package ResoluçãoExercicios_Aulas_11_12_13.src.Exercicio_4;
import java.util.Scanner;
public class Media {
    public static void main(String[] args){
        Scanner media = new Scanner(System.in);

        System.out.println("Informe a primeira nota");
        double primeiraNota = media.nextDouble();

        System.out.println("Informe a segunda nota");
        double segundaNota = media.nextDouble();

        System.out.println("Informe a terceira nota");
        double terceiraNota = media.nextDouble();

        System.out.println("Informe a quarta nota");
        double quartaNota = media.nextDouble();

        double mediaNota = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

        System.out.println("Sua média é: " + mediaNota);
    }
}