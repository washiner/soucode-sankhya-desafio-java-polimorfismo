package desafio02;

public class Gerente extends Funcionario implements AvaliacaoDesempenho, Treinamento {
    public Gerente(String nome, int idade, double salario, Departamento departamento) {
        super(nome, idade, salario, departamento);
    }

    @Override
    public double calcularBonusAnual() {
        return salario * 0.20; // Exemplo de 20% de bônus anual
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Gerente: " + nome + " - Idade: " + idade + " - Salário: " + salario + " - Departamento: " + departamento);
    }

    @Override
    public String avaliarDesempenho() {
        return "Avaliação de desempenho do gerente " + nome + ": Excelente.";
    }

    @Override
    public String realizarTreinamento() {
        return "Treinamento realizado pelo gerente " + nome + ": Gestão de Projetos.";
    }
}

