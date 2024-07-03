package desafio03;

public class Main {
    public static void main(String[] args) {
        ItemBiblioteca livro = new Livro("O Senhor dos Aneis", "J.R.R. Tolkien", 1954, Genero.FICCAO);
        ItemBiblioteca revista = new Revista("National Geographic", "Vários", 2020, 12);
        ItemBiblioteca dvd = new DVD("Matrix", "Wachowski", 1999, 136);

        livro.imprimirDetalhes();
        System.out.println(((Emprestimo) livro).emprestar());
        System.out.println("Multa por atraso (2 dias): R$ " + livro.calcularMultaPorAtraso(5));
        System.out.println(((Devolucao) livro).devolver());

        revista.imprimirDetalhes();
        System.out.println(((Emprestimo) revista).emprestar());
        System.out.println("Multa por atraso (5 dias): R$ " + revista.calcularMultaPorAtraso(3));
        System.out.println(((Devolucao) revista).devolver());

        dvd.imprimirDetalhes();
        System.out.println(((Emprestimo) dvd).emprestar());
        System.out.println("Multa por atraso (6 dias): R$ " + dvd.calcularMultaPorAtraso(7));
        System.out.println(((Devolucao) dvd).devolver());
    }
}

