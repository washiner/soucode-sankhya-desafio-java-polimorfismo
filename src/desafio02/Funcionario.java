package desafio02;

public abstract class Funcionario {
    protected String nome;
    protected int idade;
    protected double salario;
    protected Departamento departamento;

    public Funcionario(String nome, int idade, double salario, Departamento departamento) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.departamento = departamento;
    }

    public abstract double calcularBonusAnual();

    public abstract void imprimirDetalhes();
}

