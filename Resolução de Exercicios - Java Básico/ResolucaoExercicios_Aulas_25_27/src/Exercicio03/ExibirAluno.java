package Exercicio03;

import java.util.Scanner;

public class ExibirAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        Scanner scan = new Scanner(System.in);

        System.out.println("Nome do Aluno?");
        aluno.nome = scan.next();

        System.out.println("Qual o nome do Curso?");
        aluno.nomeCurso = scan.next();

        System.out.println("Qual a Matricula?");
        aluno.matricula = scan.next();

        aluno.nomeDisciplinas = new String[3];

        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            System.out.println("Informe a " + (i + 1) + "ª Disciplina:");
            aluno.nomeDisciplinas[i] = scan.next();
        }

        aluno.notasDisciplinas = new double[3][4];

        for ( int i = 0; i < aluno.notasDisciplinas.length; i++ ){
            System.out.println("Obtendo nota da disciplina " + aluno.nomeDisciplinas[i]);
            for ( int j = 0; j < aluno.notasDisciplinas[i].length; j++){
                System.out.println("Informe a " + (j +1) + "º Nota.");
                aluno.notasDisciplinas[i][j] = scan.nextDouble();
            }
        }

        System.out.println();
        aluno.mostrarInfoAluno();

        for( int i = 0; i < aluno.nomeDisciplinas.length; i++){
            if ( aluno.verificarAprovacao(i)){
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - Foi Aprovado.");
            }else {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - Foi Reprovado.");
            }
        }

        // Agora, vamos usar o método obterMedia para obter e imprimir a média de todas as disciplinas
        System.out.println("\nMédias de Todas as Disciplinas:");
        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            double mediaDaDisciplina = aluno.obterMedia(i);
            System.out.println(aluno.nomeDisciplinas[i] + ": " + mediaDaDisciplina);
        }
    }
}
