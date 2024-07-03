package desafio05;

public class Roupa extends Produto implements Desconto, Frete {
    private String tamanho;

    public Roupa(String nome, double preco, int quantidadeEmEstoque, String tamanho) {
        super(nome, preco, quantidadeEmEstoque);
        this.tamanho = tamanho;
    }

    @Override
    public double calcularValorTotalEstoque() {
        return preco * quantidadeEmEstoque;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Roupa - Tamanho: " + tamanho + " - Nome: " + nome + " - Preco: " + preco + " - Estoque: " + quantidadeEmEstoque);
    }

    @Override
    public double aplicarDesconto(double percentual) {
        return preco - (preco * percentual / 100);
    }

    @Override
    public double calcularFrete(double distancia) {
        return 0.03 * distancia;
    }
}

