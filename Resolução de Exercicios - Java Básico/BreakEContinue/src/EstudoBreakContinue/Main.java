package EstudoBreakContinue;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número");
        int num = scan.nextInt();

        System.out.println("Entre com um limite");
        int max = scan.nextInt();

        for (int i = num; i <= max; i++) {
            System.out.println(i);
            if(i % 7 == 0){
                System.out.println("i = " + i);
                break;
            }
        }

        System.out.println("======================================================");

        for(int i = 0; i <= 4; i++){
            rotulo1:{
                rotulo2:{
                    rotulo3:{
                    if(i == 1) {
                        break rotulo1;
                    }else if( i == 2){
                        break rotulo2;
                    }else if(i == 3){
                        break rotulo3;
                        }
                        System.out.println("Rotulo 3");
                    }
                    System.out.println("Rotulo 2");
                }
                System.out.println("Rotulo 1");
            }
            System.out.println(i);
        }

        System.out.println("======================================================");

        for (int i = num; i <= max; i++) {

            if(i % 7 == 0){
                continue;
            }
            System.out.println(i);
        }


    }
}