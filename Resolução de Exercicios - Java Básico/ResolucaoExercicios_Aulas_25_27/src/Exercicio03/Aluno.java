package Exercicio03;

public class Aluno {

    String nome;
    String matricula;

    String nomeCurso;

    String [] nomeDisciplinas;

    double [] [] notasDisciplinas;


    void mostrarInfoAluno(){
        System.out.println("Nome: " + nome);
        System.out.println("Maticula: " + matricula);
        System.out.println("Nome do Curso: " + nomeCurso);

        for(int i = 0; i < notasDisciplinas.length; i++){
            System.out.println("Notas da Disciplina " + nomeDisciplinas[i]);
            for(int j = 0; j < notasDisciplinas[i].length; j++){
                System.out.println(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean verificarAprovacao(int indice){

        if(obterMedia(indice) >= 7){
            return true;
        }else {
            return false;
        }
    }

    double obterMedia(int indice){
        double soma = 0;

        for (int i =0; i < notasDisciplinas[indice].length; i++){
            soma += notasDisciplinas[indice][i];
        }

        double media = soma /4;

        return media;
    }

}
