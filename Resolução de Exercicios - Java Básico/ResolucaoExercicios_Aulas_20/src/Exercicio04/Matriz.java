package Exercicio04;

import java.util.Scanner;
public class Matriz {
    private static String[][] agendaCompromissos = new String[24][31];
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

            // Falta colocar a opção pra caso o usuario coloque u valor diferente de 1 ou 2.

            if (continuar.equals("1")) {
            } else if (continuar.equals("2")) {
                break;
            }
        }
    }

    private static void adicionarCompromisso() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o dia para adicionar um compromisso:");
        int j = sc.nextInt();

        System.out.println("Informe a hora para adicionar um compromisso:");
        int i = sc.nextInt();

        sc.nextLine(); //Limpar o buffer
        System.out.println("Informe o compromisso para o dia " + j + " às " + i + " horas:");
        String compromisso = sc.nextLine();
        agendaCompromissos[i][j] = compromisso;

        System.out.println("O compromisso: " + agendaCompromissos[i][j]);
        System.out.println("foi adicionado com êxito.");

    }

    private static void consultarCompromisso() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o dia para consultar um compromisso:");
        int j = sc.nextInt();

        System.out.println("Informe a hora para consultar um compromisso:");
        int i = sc.nextInt();

        if (agendaCompromissos[i][j] == null) {
            System.out.println("Não há compromisso agendado para o dia e hora informados.");
        } else {
            System.out.println("O compromisso para o dia " + j + " às " + i + "h é: ");
            System.out.println(agendaCompromissos[i][j]);
        }
    }
}