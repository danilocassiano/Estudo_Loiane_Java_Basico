package Exercicio01;

public class Lampadas {
    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;
    boolean ligada;

    void ligar(){
        ligada = true;
    }

    void desligar(){
        ligada = false;
    }

    void mostrarEstado(){
        if(ligada) {
            System.out.println("A lampada está ligada");
        }else{
            System.out.println("A lampada está Desligada");
        }
    }

    void mudarEstadoO(){
        if(ligada){
            desligar();
        }else{
            ligar();
        }
    }

}
