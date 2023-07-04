
import java.util.Scanner;

public class ApenasLetras {

    public boolean checkLetters(String texto) {
        return !texto.matches(".*\\d.*");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine().trim();
        ApenasLetras apenasLetras = new ApenasLetras();

        if (apenasLetras.checkLetters(nome)) {
            System.out.println("Ok! O nome contém apenas letras.");
        } else {
            System.out.println("Neste campo não é permitido números. Tente novamente.");
        }
    }
}
