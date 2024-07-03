package desafio05;

public class Alimento extends Produto implements Desconto, Frete {
    private String dataValidade;

    public Alimento(String nome, double preco, int quantidadeEmEstoque, String dataValidade) {
        super(nome, preco, quantidadeEmEstoque);
        this.dataValidade = dataValidade;
    }

    @Override
    public double calcularValorTotalEstoque() {
        return preco * quantidadeEmEstoque;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Alimento - Data de Validade: " + dataValidade + " - Nome: " + nome + " - Preco: " + preco + " - Estoque: " + quantidadeEmEstoque);
    }

    @Override
    public double aplicarDesconto(double percentual) {
        return preco - (preco * percentual / 100);
    }

    @Override
    public double calcularFrete(double distancia) {
        return 0.02 * distancia;
    }
}

