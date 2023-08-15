public class MatrizTriDimensional {
    public static void main(String[] args) {

        int [][][] matrizTridimensional = new int[3][3][3];

        for (int i = 0; i < matrizTridimensional.length; i++){
            for (int j = 0; j < matrizTridimensional[i].length; j++ ){
                for(int k = 0; k < matrizTridimensional[i][j].length; k++){
                    matrizTridimensional[i][j][k] = i+ j+ k;
                    System.out.print(matrizTridimensional[i][j][k]+ " ");
                }
            }
        }

        System.out.println();

        int soma = 0;
        int somaPares = 0;
        int somaImpares = 0;


        for (int i = 0; i < matrizTridimensional.length; i++){
            for (int j = 0; j < matrizTridimensional[i].length; j++ ){
                for(int k = 0; k < matrizTridimensional[i][j].length; k++){
                    soma += matrizTridimensional[i][j][k];


                    if(matrizTridimensional[i][j][k] % 2 == 0){
                        somaPares += matrizTridimensional[i][j][k];
                    }else{
                        somaImpares += matrizTridimensional[i][j][k];
                    }
                }
            }
        }

        System.out.println("Soma Total: " + soma);
        System.out.println("Soma Pares: " + somaPares);
        System.out.println("Soma Impares: " + somaImpares);
    }
}
