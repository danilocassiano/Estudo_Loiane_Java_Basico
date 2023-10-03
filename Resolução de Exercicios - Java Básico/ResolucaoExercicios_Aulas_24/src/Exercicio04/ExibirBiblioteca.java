package Exercicio04;

import java.util.Date;

public class ExibirBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca biblioteca = new LivroDeBiblioteca();

        biblioteca.nome = "Harry Potter";
        biblioteca.autor = "Katerine";
        biblioteca.anoLancamento = 2015;
        biblioteca.qtdPaginas = 500;
        biblioteca.preco = 250;

        biblioteca.emprestado = true;
        biblioteca.dataEntrega = new Date();
        biblioteca.pessoaLivro = "Danilo";
    }
}
