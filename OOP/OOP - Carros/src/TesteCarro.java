public class TesteCarro {

    public static void main(String[] args) {
        Carro van = new Carro();

        van.marca = "Fiat";
        van.modelo = "Ducanto";
        van.numPassageiro = 10;
        van.capacidadeCombustivel = 100;
        van.consumoCombustivel = 2.0;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia é: " + van.obterAutonomia());
        System.out.println("A autonomia é: " + autonomia);

        double qtdCombustivel10  = van.calcularCombustivel(10);
        double qtdCombustivel15  = van.calcularCombustivel(15);

        System.out.println("qtdCombustivel10: " + qtdCombustivel10);
        System.out.println("qtdCombustivel15: " + qtdCombustivel15);

    }
}
