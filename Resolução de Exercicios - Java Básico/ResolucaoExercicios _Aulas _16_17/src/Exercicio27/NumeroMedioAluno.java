package Exercicio27;
import java.util.Scanner;
public class NumeroMedioAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Me informe o número de Turmas.");
        int turmas = scan.nextInt();

        int totalDeAlunos = 0;

        for(int i=0; i <= turmas; i++){
            System.out.println("Digite a quantidade de alunos na turma " + i + ": ");
            int quantidadeAlunos = scan.nextInt();

            // Verifica se a quantidade de alunos é válida (até 40)
            if(quantidadeAlunos < 40){
                totalDeAlunos+=quantidadeAlunos;
            }else{
                System.out.println("Quantidade de alunos inválida. A turma não pode ter mais de 40 alunos.");
                i--; // Volta para a mesma turma novamente
            }
        }
        scan.close();

        double mediaAlunosPorTurma = (double) totalDeAlunos / turmas;
        System.out.println("A média de alunos por turma é: " + mediaAlunosPorTurma);
    }
}
