package Exercicio6;

public class Numeros {
    public static void main(String[] args){
        StringBuilder result = new StringBuilder();

        int i=0;

        for (i=1 ; i < 21 ; i++ ){
            System.out.println(i);
        }

        System.out.println("___________________________________________");

        for(i=1 ; i < 21 ; i++ ){
            result.append(i).append("-");
        }

        // Removendo o último "-" antes de exibir o resultado
        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }

        System.out.println(result.toString());
    }
}
