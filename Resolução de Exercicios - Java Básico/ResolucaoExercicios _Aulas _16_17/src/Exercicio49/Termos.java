package Exercicio49;
import java.text.DecimalFormat;
public class Termos {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.##");

        //Vou iniciar com os valores iniciando com a serie do exemplo do exercicio.

        int n = 0;
        int m = -1;
        double soma = 0;


        //Coloquei um limitador de 10 pra não ficar uma sequencia infinita.
        for(int i = 0; i < 10; i++){
            n += 1;
            m += 2;
            soma += (double) n/m;

            System.out.println("S = " + n + "/" + m);

        }

        String decimal = df.format(soma);

        System.out.println("O total da série é: " + decimal);
    }
}
