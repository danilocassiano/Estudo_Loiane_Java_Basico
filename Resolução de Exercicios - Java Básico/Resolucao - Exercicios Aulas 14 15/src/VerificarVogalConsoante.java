//EXERCICIO 4;
import java.util.Scanner;


public class VerificarVogalConsoante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String input = scanner.nextLine().toLowerCase();

        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
            char letra = input.charAt(0);

            if (isVogal(letra)) {
                System.out.println("A letra digitada é uma vogal.");
            } else {
                System.out.println("A letra digitada é uma consoante.");
            }
        } else {
            System.out.println("Você não digitou uma única letra válida.");
        }

        scanner.close();
    }

    public static boolean isVogal(char letra) {
        letra = Character.toLowerCase(letra);
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }
}
