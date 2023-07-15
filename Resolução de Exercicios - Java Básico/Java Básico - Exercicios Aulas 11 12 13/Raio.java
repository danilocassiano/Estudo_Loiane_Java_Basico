//EXERCICIO 6

import java.util.Scanner;
public class Raio {
    public static void main(String[] args){
        Scanner raio = new Scanner(System.in);

        System.out.println("Qual o Raio do circulo?");
        double valor = raio.nextDouble();
        double areaCirculo = Math.PI*(valor * valor);
        System.out.println("A aréa do circulo é: " + areaCirculo);
    }
}

