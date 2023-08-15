import java.util.Random;

public class ForEach {
    public static void main(String[] args) {
        int [] notas = new int[10];

        Random random = new Random();

        for( int i = 0; i < notas.length; i++){
            notas[i] = random.nextInt(10);
        }

        for (int i = 0; i < notas.length; i++){
            int nota = notas[i];
            System.out.println(nota);
        }

        System.out.println("Usando o for each: ");

        for(int nota : notas){
            System.out.println(nota);
        }

        System.out.println("Exemplo 2 de for each");

        double [][] notasAlunos = new double[4][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 8;
        notasAlunos[0][3] = 5;

        notasAlunos[1][0] = 5;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 6;
        notasAlunos[1][3] = 9;

        notasAlunos[2][0] = 10;
        notasAlunos[2][1] = 5;
        notasAlunos[2][2] = 9;
        notasAlunos[2][3] = 9;

        notasAlunos[3][0] = 4;
        notasAlunos[3][1] = 5;
        notasAlunos[3][2] = 9;
        notasAlunos[3][3] = 8;

        for (double[] notasAluno : notasAlunos){
            for (double nota : notasAluno){
                System.out.println(nota + " ");
            }
            System.out.println();
        }
    }
}
