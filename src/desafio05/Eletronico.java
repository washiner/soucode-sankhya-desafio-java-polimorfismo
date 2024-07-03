package desafio05;

public class Eletronico extends Produto implements Desconto, Frete {
    private String marca;

    public Eletronico(String nome, double preco, int quantidadeEmEstoque, String marca) {
        super(nome, preco, quantidadeEmEstoque);
        this.marca = marca;
    }

    @Override
    public double calcularValorTotalEstoque() {
        return preco * quantidadeEmEstoque;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Eletronico - Marca: " + marca + " - Nome: " + nome + " - Preco: " + preco + " - Estoque: " + quantidadeEmEstoque);
    }

    @Override
    public double aplicarDesconto(double percentual) {
        return preco - (preco * percentual / 100);
    }

    @Override
    public double calcularFrete(double distancia) {
        return 0.05 * distancia;
    }
}

