package Exercicio50;
import java.util.Scanner;
public class Termos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos termos você deseja na série?");
        int termos = scan.nextInt();

        int h = 1;
        int n = 0;
        String serie = "";

        for (int i = 0; i < termos; i++){
            n += 1;

            if (i == 0) {
                serie += h + "/" + n;
            } else {
                serie += " + " + h + "/" + n;
            }
        }
        System.out.println("H = " + serie);

    }
}

