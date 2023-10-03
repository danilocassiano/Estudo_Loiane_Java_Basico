package Exercicio01;

public class ExibirLampada {
    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.garantiaMeses = 36;
        lampada.potencia = 7;
        lampada.cor = "Amarela";
        lampada.tipos = new String[5];
        lampada.tipos[1] = "Abaju";
        lampada.tipos[2] = "Amarela";
    }
}
