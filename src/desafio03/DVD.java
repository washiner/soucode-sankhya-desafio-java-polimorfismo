package desafio03;

public class DVD extends ItemBiblioteca implements Emprestimo, Devolucao {
    private int duracao; // Duração em minutos

    public DVD(String titulo, String autor, int anoPublicacao, int duracao) {
        super(titulo, autor, anoPublicacao);
        this.duracao = duracao;
    }

    @Override
    public double calcularMultaPorAtraso(int diasAtraso) {
        return diasAtraso * 1.50;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("DVD: " + titulo + " - Diretor: " + autor + " - Ano: " + anoPublicacao + " - Duração: " + duracao + " minutos");
    }

    @Override
    public String emprestar() {
        return "DVD " + titulo + " emprestado.";
    }

    @Override
    public String devolver() {
        return "DVD " + titulo + " devolvido.";
    }
}

