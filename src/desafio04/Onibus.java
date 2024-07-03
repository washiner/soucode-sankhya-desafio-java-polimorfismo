package desafio04;

public class Onibus extends Transporte implements Manutencao, HorarioFuncionamento {
    private String linha;

    public Onibus(int numeroAssentos, int capacidade, double tarifa, String linha) {
        super(numeroAssentos, capacidade, tarifa);
        this.linha = linha;
    }

    @Override
    public double calcularTarifaTotal(int numeroPassageiros) {
        return numeroPassageiros * tarifa;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Onibus - Linha: " + linha + " - Capacidade: " + capacidade + " passageiros");
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Realizando manutencao do onibus da linha " + linha);
    }

    @Override
    public void verificarHorarioFuncionamento() {
        System.out.println("Verificando horario de funcionamento da linha " + linha);
    }
}

