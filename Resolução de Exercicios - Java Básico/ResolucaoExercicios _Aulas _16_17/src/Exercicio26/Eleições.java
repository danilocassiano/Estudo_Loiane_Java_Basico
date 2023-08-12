package Exercicio26;
import java.util.Scanner;
public class Eleições {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos Eleitores tem o Candidato A?");
        int candidatoA = scan.nextInt();
        System.out.println("Quantos Eleitores tem o Candidato B?");
        int candidatoB = scan.nextInt();
        System.out.println("Quantos Eleitores tem o Candidato C?");
        int candidatoC = scan.nextInt();

        if (candidatoA > candidatoB && candidatoA > candidatoC) {
            System.out.println("O Candidato A irá vencer com: " + candidatoA + " votos.");
        } else if (candidatoB > candidatoA && candidatoB > candidatoC) {
            System.out.println("O candidato B irá vencer com: " + candidatoB + " votos.");
        } else if (candidatoC > candidatoA && candidatoC > candidatoB) {
            System.out.println("O candidato C irá vencer com: " + candidatoC + " votos.");
        } else if (candidatoA == candidatoB && candidatoB == candidatoC) {
            System.out.println("Empate de todos os candidatos.");
        } else if (candidatoA == candidatoC) {
            System.out.println("Empate entre o Candidato A e o Candidato C.");
        } else if (candidatoB == candidatoC) {
            System.out.println("Empate entre o Candidato B e o Candidato C.");
        } else if (candidatoA == candidatoB) {
            System.out.println("Empate entre o Candidato A e o Candidato B.");
        }

        scan.close();
    }
}
