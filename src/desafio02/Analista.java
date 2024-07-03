package desafio02;

public class Analista extends Funcionario implements Treinamento {
    public Analista(String nome, int idade, double salario, Departamento departamento) {
        super(nome, idade, salario, departamento);
    }

    @Override
    public double calcularBonusAnual() {
        return salario * 0.10; // Exemplo de 10% de bônus anual
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Analista: " + nome + " - Idade: " + idade + " - Salário: " + salario + " - Departamento: " + departamento);
    }

    @Override
    public String realizarTreinamento() {
        return "Treinamento realizado pelo analista " + nome + ": Análise de Dados.";
    }
}

