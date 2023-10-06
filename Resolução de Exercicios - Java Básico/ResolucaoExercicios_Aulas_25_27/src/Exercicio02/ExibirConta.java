package Exercicio02;

public class ExibirConta {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;
        conta.valorEspecialUsado = 0;

        System.out.println("Saldo da Conta " + conta.numero + " = " + conta.saldo);

        boolean saqueEfetuado = conta. realizarSaque(10);

        if(saqueEfetuado){
            System.out.println("Saque Realizado com sucesso!");
            System.out.println("Saldo atual da conta = " + conta.saldo);
        }else{
            System.out.println("Limite Indisponivel.");
        }

        saqueEfetuado = conta. realizarSaque(500);
        System.out.println("Saque de R$500,00");
        if(saqueEfetuado){
            System.out.println("Saque Realizado com sucesso!");
            System.out.println("Saldo atual da conta = " + conta.saldo);
        }else{
            System.out.println("Limite Indisponivel.");
        }

        System.out.println("Depósito de 500 Reais");
        conta.depositar(500);
        conta.consultarSaldo();

        conta.realizarSaque(600);
        conta.consultarSaldo();
        if(conta.verificarUsoChequeEspecial()){
            System.out.println("Está usando o cheque especial.");
        }else{
            System.out.println("Não está usando o cheque especial.");
        }

    }
}
