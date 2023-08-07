package Exercicio16;

public class Fibonacci {
    public static void main(String[] args) {

        int n = 500;

        System.out.print("A série de Fibonacci até o " + n + "º termo é: ");

        for (int i = 0; i <= n; i++) {
            if(fibonacci(i)>500 && fibonacci(i)>700){
                break;
            }
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
