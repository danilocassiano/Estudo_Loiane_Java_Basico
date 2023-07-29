package ResolucaoExercicios_Aulas_14_15.src.Exercicio_18;

import java.util.Scanner;

public class Data {

   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Digite uma data no formato dd/mm/aaaa:");
            String dataInput = scan.nextLine();

            if (verificarData(dataInput)) {
                System.out.println("Data válida.");
                break;
            } else {
                System.out.println("Data inválida. Tente novamente no formato correto.");
            }
        }
    }

    public static boolean verificarData(String data) {
        if (data.length() != 10) {
            return false;
        }

        int dia, mes, ano;
        try {// Ele vai testar cada linha dentro do bloco.
            dia = Integer.parseInt(data.substring(0, 2));//Os valores dentro do metodo indica a posição incial e final que passará na converção.
            mes = Integer.parseInt(data.substring(3, 5));// O metodo Integer.parseInt transforma a Strinf em inteiro.
            ano = Integer.parseInt(data.substring(6, 10));
        } catch (NumberFormatException e) {// caso alguma linha der como false, ele vai entrar nesse metodo automaticamente indicando o erro.
            return false;
        }

        if (mes < 1 || mes > 12 || dia < 1) {
            return false;
        }

        if (mes == 2) { // Fevereiro
            if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                // Ano bissexto: fevereiro tem 29 dias.
                if (dia > 29) {
                    return false;
                }
            } else {
                // Ano não bissexto: fevereiro tem 28 dias.
                if (dia > 28) {
                    return false;
                }
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) { // Abril, Junho, Setembro, Novembro
            if (dia > 30) {
                return false;
            }
        } else { // Meses com 31 dias
            if (dia > 31) {
                return false;
            }
        }

        return true;
    }
}
