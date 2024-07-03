package desafio03;

public class Livro extends ItemBiblioteca implements Emprestimo, Devolucao {
    private Genero genero;

    public Livro(String titulo, String autor, int anoPublicacao, Genero genero) {
        super(titulo, autor, anoPublicacao);
        this.genero = genero;
    }

    @Override
    public double calcularMultaPorAtraso(int diasAtraso) {
        return diasAtraso * 0.20;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Livro: " + titulo + " - Autor: " + autor + " - Ano: " + anoPublicacao + " - Gênero: " + genero);
    }

    @Override
    public String emprestar() {
        return "Livro " + titulo + " emprestado.";
    }

    @Override
    public String devolver() {
        return "Livro " + titulo + " devolvido.";
    }
}

