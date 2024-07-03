package desafio05;

public class Main {
    public static void main(String[] args) {
        Produto eletronico = new Eletronico("Telefone", 1850.0, 10, "Samsung");
        Produto roupa = new Roupa("Calça", 50.0, 10, "G");
        Produto alimento = new Alimento("Feijao", 20.0, 100, "31/10/2024");

        eletronico.imprimirDetalhes();
        System.out.println("Preco total no estoque: " + eletronico.calcularValorTotalEstoque());
        System.out.println("Valor com desconto: " + ((Desconto) eletronico).aplicarDesconto(12));
        System.out.println("Frete para 200 km: " + ((Frete) eletronico).calcularFrete(200));

        roupa.imprimirDetalhes();
        System.out.println("Valor total do estoque: " + roupa.calcularValorTotalEstoque());
        System.out.println("Valor de desconto: " + ((Desconto) roupa).aplicarDesconto(10));
        System.out.println("Frete para 120 km: " + ((Frete) roupa).calcularFrete(120));

        alimento.imprimirDetalhes();
        System.out.println("Valor total em estoque: " + alimento.calcularValorTotalEstoque());
        System.out.println("Preco com desconto: " + ((Desconto) alimento).aplicarDesconto(5));
        System.out.println("Frete para 100 km: " + ((Frete) alimento).calcularFrete(500));
    }
}

