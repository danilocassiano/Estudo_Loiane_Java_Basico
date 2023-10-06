package Exercicio02;

public class ContaCorrente {

    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    double saldo;

    boolean realizarSaque(double valorSaque){
        //tem saldo na conta.
        if(saldo >= valorSaque){
            saldo -= valorSaque;
            return true;
        } else { // não tem saldo na conta.
          if(especial){
              //verificar se o limite especial tem saldo.
              double limite = limiteEspecial + saldo;
              if(limite >= valorSaque){
                  saldo -= valorSaque;
                  return true;
              }else{
                  return false;
              }
          }else{
              return false; // Não é especial e nem saldo suficiente.
          }
        }
    }

    void depositar(double valorDepositado){
        saldo += valorDepositado;
    }

    void consultarSaldo(){
        System.out.println("Saldo atual de conta = " + saldo);
    }

    boolean verificarUsoChequeEspecial(){
        return saldo < 0;
    }


}
