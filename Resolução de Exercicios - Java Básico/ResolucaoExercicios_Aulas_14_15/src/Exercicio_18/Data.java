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
        try {
            dia = Integer.parseInt(data.substring(0, 2));
            mes = Integer.parseInt(data.substring(3, 5));
            ano = Integer.parseInt(data.substring(6, 10));
        } catch (NumberFormatException e) {
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
