package desafio01;

public abstract class Refeicao {
    protected String nome;
    protected double preco;

    public Refeicao(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public abstract double calcularValorTotal();

    public abstract void imprimirDetalhes();
}

