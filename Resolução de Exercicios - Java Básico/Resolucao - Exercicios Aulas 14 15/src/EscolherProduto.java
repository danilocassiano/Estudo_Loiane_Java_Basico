// EXERCICIO 8

import java.util.Scanner;

public class EscolherProduto {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double leiteCamponesa, leiteItambe, leitePiracanjuba;

        System.out.println("Qual o preço do Leite Camponesa?");
        leiteCamponesa = scan.nextDouble();

        System.out.println("Qual o preço do Leite Itambé?");
        leiteItambe = scan.nextDouble();

        System.out.println("Qual o preço do Leite Piracanjuba?");
        leitePiracanjuba = scan.nextDouble();

        if(leiteCamponesa < leiteItambe && leiteCamponesa < leitePiracanjuba) {
            System.out.println("Você deve comprar o Leite Camponesa!");
        } else if (leiteItambe < leiteCamponesa && leiteItambe < leitePiracanjuba) {
            System.out.println("Você deve comprar o Leite Itambé!");
        }else {
            System.out.println("Você deve comprar o Leite Piracanjuba!");
        }
    }
}