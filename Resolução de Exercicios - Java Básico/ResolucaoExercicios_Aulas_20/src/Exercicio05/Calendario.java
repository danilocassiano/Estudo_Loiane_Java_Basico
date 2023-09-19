package Exercicio05;

import java.util.Scanner;

public class Calendario {
    private static String[][][] agendaCompromissos = new String[12][31][8];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha a opção desejada: ");
            System.out.println("1 - Agendar compromisso");
            System.out.println("2 - Consultar compromisso agendado");

            String escolha = sc.next();

            if (escolha.equals("1")) {
                adicionarCompromisso();
            } else if (escolha.equals("2")) {
                consultarCompromisso();
            }

            System.out.println("Deseja fazer mais alguma alteração/consulta?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            String continuar = sc.next();

            if (continuar.equals("1")) {
            } else if (continuar.equals("2")) {
                break;
            }
        }
    }

    private static void adicionarCompromisso() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o mês para adicionar um compromisso:");
        int i = sc.nextInt();

        System.out.println("Informe o dia para adicionar um compromisso:");
        int j = sc.nextInt();

        System.out.println("Informe a hora (das 8h às 15h) para adicionar um compromisso:");
        int k = sc.nextInt();
        if (k < 8 || k > 15) {
            System.out.println("Hora inválida. Escolha uma hora entre 8h e 15h.");
        } else {
            sc.nextLine(); // Limpar o buffer
        }


        System.out.println("Informe o compromisso para o mês " + i + ", dia " + j + ", às " + k + " horas:");
        String compromisso = sc.nextLine();
        agendaCompromissos[i][j][k-8] = compromisso;

        System.out.println("O compromisso: " + agendaCompromissos[i][j][k-8]);
        System.out.println("foi adicionado com êxito.");

    }
    private static void consultarCompromisso() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o mês para consultar um compromisso:");
        int i = sc.nextInt();

        System.out.println("Informe o dia para consultar um compromisso:");
        int j = sc.nextInt();

        System.out.println("Informe a hora (das 8h às 15h) para consultar um compromisso:");
        int k = sc.nextInt();
        if (k < 8 || k > 15) {
            System.out.println("Hora inválida. Escolha uma hora entre 8h e 15h.");
        } else {
            sc.nextLine(); // Limpar o buffer
        }

        if (agendaCompromissos[i][j][k-8] == null){
            System.out.println("Não há compromisso agendado para o dia e hora informados.");
        } else {
            System.out.println("O compromisso para o mês " + i + ", dia " + j + " às " + k + "h é: ");
            System.out.println(agendaCompromissos[i][j][k-8]);
        }
    }
}