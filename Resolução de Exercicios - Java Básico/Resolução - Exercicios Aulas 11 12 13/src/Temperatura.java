//EXERCICIO 9
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.println("Qual a temperatura em Farenheit?");
        double farenheit = temp.nextDouble();

        double celsius = (farenheit -32)/1.8;

        System.out.println("A temperatura convertida Celsius é " + celsius);
    }
}