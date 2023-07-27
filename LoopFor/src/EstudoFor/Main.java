package EstudoFor;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("______________________________________________");
        for (int i = 5; i >= 0; i-- ){
            System.out.println("i = " + i);
        }
        System.out.println("______________________________________________");
        for (int i = 0, j = 10; i <= j ; i++, j--){
            System.out.println("i tem valor: " + i + " e j tem valor: " + j);
        }
    }
}