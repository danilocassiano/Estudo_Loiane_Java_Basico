
public class Carro {

        String marca;
        String modelo;
        double numPassageiro;
        double consumoCombustivel;
        double capacidadeCombustivel;


        void exibirAutonomia() {
            System.out.println("A autonomia do carro é " + (capacidadeCombustivel * consumoCombustivel) + " km.");
        }

        double obterAutonomia(){
            return capacidadeCombustivel * consumoCombustivel;
        }

        double calcularCombustivel(double km){
            double qtdCombustivel = km/consumoCombustivel;
            return qtdCombustivel;
        }

}