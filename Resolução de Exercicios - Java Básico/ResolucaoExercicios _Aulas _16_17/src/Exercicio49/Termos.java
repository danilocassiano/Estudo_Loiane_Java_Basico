package Exercicio49;
import java.text.DecimalFormat;
public class Termos {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.##");

        //Vou iniciar com os valores iniciando com a serie do exemplo do exercicio.

        int n = 0;
        int m = -1;
        double soma = 0;
        String serie = "";


        //Coloquei um limitador de 10 pra não ficar uma sequencia infinita.
        for(int i = 0; i < 10; i++){
            n += 1;
            m += 2;
            double termo = (double) n/m;
            soma += termo;

            if (i == 0) {
                serie += n + "/" + m;
            } else {
                serie += " + " + n + "/" + m;
            }

        }

        String decimal = df.format(soma);

        System.out.println("S = " + serie);
        System.out.println("O total da série é: " + decimal);
    }
}
