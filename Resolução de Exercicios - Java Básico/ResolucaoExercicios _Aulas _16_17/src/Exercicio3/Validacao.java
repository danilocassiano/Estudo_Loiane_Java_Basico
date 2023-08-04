package Exercicio3;
import java.util.Scanner;

public class Validacao {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String nome, estadoCivil, sexo;
        int idade;
        double salario;


        while(true) {
            System.out.println("Informe seu nome. [Deve possuir mais de 3 letras]");
            nome = scan.next();

            int contadorLetra = 0;

            for (int i = 0; i < nome.length(); i++){
                char c =  nome.charAt(i);// Metodo que acessa o caractere para poder ser verificado.
                if(Character.isLetter(c)){ // Metodo que verifica que o caracter escrito está no alfabeto.
                    contadorLetra++;
                }
            }

            if( contadorLetra <= 3 ){
                System.out.println("Nome Inválido. Tente Novamente.");
            }else{
                System.out.println("Nome Válido");
                break;
            }
        }

        while(true){
            System.out.println("Informe sua Idade.");
            idade = scan.nextInt();

            if(idade < 0 || idade > 150){
                System.out.println("Idade Inválida. Tente Novamente.");
            }else{
                System.out.println("Idade Válida!");
                break;
            }
        }

        while(true) {
            System.out.println("Qual o seu salário");
            salario = scan.nextDouble();

            if(salario > 0){
                System.out.println("Sálario Válido!");
                break;
            }else {
                System.out.println("Salario não pode ser zerado. Tente Novamente.");
            }
        }

        while(true) {
            System.out.println("Informe seu Sexo. Digite \"M\" ou \"F\".");
            sexo = scan.next();

            if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
                if(sexo.equalsIgnoreCase("f")){
                    sexo = "Feminino";
                }else{
                    sexo = "Masculino";
                }
                System.out.println("Sexo Válido");
                break;
            }else{
                System.out.println("Sexo Inválido. Tente Novamente.");
            }
        }

        while(true) {
            System.out.println("Informe o seu Estado Civil");
            System.out.println("[S-Solteiro; C-Casado; V-Viuvo; D-Divorciado]");
            estadoCivil = scan.next();

            if(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")){
                if(estadoCivil.equalsIgnoreCase("s")){
                    estadoCivil = "Solteiro";
                }else if(estadoCivil.equalsIgnoreCase("c")){
                    estadoCivil = "Casado";
                }else if(estadoCivil.equalsIgnoreCase("v")){
                    estadoCivil = "Viuvo";
                }else if(estadoCivil.equalsIgnoreCase("d")){
                    estadoCivil = "Divorciado";
                }

                System.out.println("Estado Civil Válido");
                break;
            }else {
                System.out.println("Estado Cívil Inválido. Tente Novamente.");
            }
        }

        System.out.println("__________________________________________________________-");
        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Seu salário é: " + salario);
        System.out.println("Seu Sexo é: " + sexo);
        System.out.println("Seu estado cívil é: " + estadoCivil);

        scan.close();

    }
}
