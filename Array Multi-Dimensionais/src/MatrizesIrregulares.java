import java.util.Scanner;
public class MatrizesIrregulares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o numero de pessoas que serão entrevistada.");
        int numEntrevistados = scan.nextInt();

        String[][] nomeFilhos =  new String [numEntrevistados][];

        for( int i = 0; i < nomeFilhos.length; i++ ){
            System.out.println("Entre com a quantidade de Filho");
            int qdtFilhos = scan.nextInt();

            nomeFilhos[i] = new String[qdtFilhos];

            for(int j = 0; j < nomeFilhos[i].length; j++){
                System.out.println("Digite o nome do Filho " + nomeFilhos[i][j]);
                nomeFilhos[i][j] = scan.next();
            }
        }

        for( int i = 0; i < nomeFilhos.length; i++ ){
            System.out.println("Pessoa " + (i + 1) + " tem " + nomeFilhos[i].length + " Filhos");
            for(int j = 0; j < nomeFilhos[i].length; j++){
                System.out.println(nomeFilhos[i][j]);
            }
        }
    }
}
