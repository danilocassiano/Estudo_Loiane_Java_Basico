package ResoluçãoExercicios_Aulas_11_12_13.src.Exercicio_10;
import java.util.Scanner;
public class TemperaturaCelsius {
    public static void main(String[]args){
    Scanner temp = new Scanner(System.in);

    System.out.println("Qual a temperatura em Celsius?");
    double celsius = temp.nextDouble();

    double farenheit = (celsius * 1.8) + 32;

    System.out.println("A temperatura convertida em Farenheit é " + farenheit);

    }
}
