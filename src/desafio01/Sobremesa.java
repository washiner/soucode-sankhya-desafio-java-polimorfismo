package desafio01;

public class Sobremesa extends Refeicao {
    public Sobremesa(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularValorTotal() {
        return preco;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Sobremesa: " + nome + " - Preco: " + preco);
    }
}

