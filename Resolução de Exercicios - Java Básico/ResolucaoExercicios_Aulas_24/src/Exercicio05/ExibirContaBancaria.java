package Exercicio05;

public class ExibirContaBancaria {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldoConta = 10;
    }

}
