package desafio04;

public class Metro extends Transporte implements Manutencao, HorarioFuncionamento {
    private String linha;

    public Metro(int numeroAssentos, int capacidade, double tarifa, String linha) {
        super(numeroAssentos, capacidade, tarifa);
        this.linha = linha;
    }

    @Override
    public double calcularTarifaTotal(int numeroPassageiros) {
        return numeroPassageiros * tarifa;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Metro - Linha: " + linha + " - Capacidade: " + capacidade + " passageiros");
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Realizando manutencao do metro da linha " + linha);
    }

    @Override
    public void verificarHorarioFuncionamento() {
        System.out.println("Verificando horário de funcionamento da linha " + linha);
    }
}

