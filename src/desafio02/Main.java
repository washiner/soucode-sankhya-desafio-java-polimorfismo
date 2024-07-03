package desafio02;

public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Hellen Takeuchi", 27, 12000.0, Departamento.TI);
        Funcionario desenvolvedor = new Desenvolvedor("Washiner Takeuchi", 45, 15000.0, Departamento.TI);
        Funcionario analista = new Analista("Shiro Takeuchi", 22, 6000.0, Departamento.MARKETING);

        gerente.imprimirDetalhes();
        if (gerente instanceof AvaliacaoDesempenho) {
            System.out.println(((AvaliacaoDesempenho) gerente).avaliarDesempenho());
        }
        if (gerente instanceof Treinamento) {
            System.out.println(((Treinamento) gerente).realizarTreinamento());
        }
        System.out.println("Bonus anual: " + gerente.calcularBonusAnual());

        desenvolvedor.imprimirDetalhes();
        if (desenvolvedor instanceof AvaliacaoDesempenho) {
            System.out.println(((AvaliacaoDesempenho) desenvolvedor).avaliarDesempenho());
        }
        System.out.println("Bonus anual: " + desenvolvedor.calcularBonusAnual());

        analista.imprimirDetalhes();
        if (analista instanceof Treinamento) {
            System.out.println(((Treinamento) analista).realizarTreinamento());
        }
        System.out.println("Bonus anual: " + analista.calcularBonusAnual());
    }
}

