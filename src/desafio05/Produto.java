package desafio05;

public abstract class Produto {
    protected String nome;
    protected double preco;
    protected int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public abstract double calcularValorTotalEstoque();

    public abstract void imprimirDetalhes();
}

