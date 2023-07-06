
public class CuriosidadeInt {

//exemplo de como o Java se comporta quando o valor de um inteiro chega no valor maximo e mesmo assim o usuario solicita uma soma.
    public static void main(String[] args) {
        int var1 = 2147483647;

        int var2 = 1;

        System.out.println(var1 + var2);
        //Mostra que o programa funciona como uma roleta onde irá retornar o menor valor negativo.
        //Que no código retornará o valor -2147483648.
    }
}
