package desafio03;

public class Revista extends ItemBiblioteca implements Emprestimo, Devolucao {
    private int edicao;

    public Revista(String titulo, String autor, int anoPublicacao, int edicao) {
        super(titulo, autor, anoPublicacao);
        this.edicao = edicao;
    }

    @Override
    public double calcularMultaPorAtraso(int diasAtraso) {
        return diasAtraso * 0.10;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Revista: " + titulo + " - Autor: " + autor + " - Ano: " + anoPublicacao + " - Edição: " + edicao);
    }

    @Override
    public String emprestar() {
        return "Revista " + titulo + " emprestada.";
    }

    @Override
    public String devolver() {
        return "Revista " + titulo + " devolvida.";
    }
}
