package desafio01;

public class Entrada extends Refeicao implements Desconto, OfertaEspecial {
    public Entrada(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularValorTotal() {
        return preco;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Entrada: " + nome + " - Preço: " + preco);
    }

    @Override
    public double aplicarDesconto() {
        return preco * 0.9; // Exemplo de 10% de desconto
    }

    @Override
    public String obterOfertaEspecial() {
        return "Oferta especial: Entrada com 10% de desconto!";
    }
}
