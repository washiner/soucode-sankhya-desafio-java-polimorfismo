package desafio01;

public class Main {
    public static void main(String[] args) {
        Refeicao entrada = new Entrada("Sashimi", 20.0);
        PratoPrincipal pratoPrincipal = new PratoPrincipal("Sushi Combo", 35.0);
        Refeicao sobremesa = new Sobremesa("Mochi", 12.0);

        entrada.imprimirDetalhes();
        if (entrada instanceof Desconto) {
            System.out.println("Valor com desconto: " + ((Desconto) entrada).aplicarDesconto());
        }
        if (entrada instanceof OfertaEspecial) {
            System.out.println(((OfertaEspecial) entrada).obterOfertaEspecial());
        }

        pratoPrincipal.imprimirDetalhes();
        if (pratoPrincipal instanceof Desconto) {
            System.out.println("Valor com desconto: " + ((Desconto) pratoPrincipal).aplicarDesconto());
        }
        
        sobremesa.imprimirDetalhes();
    }
}


