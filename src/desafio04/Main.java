package desafio04;

public class Main{
    public static void main(String[] args) {
        Transporte onibus = new Onibus(60, 70, 4.2, "Cuiaba Centro");
        Transporte trem = new Trem(300, 560, 9.0, "Centro Norte Pantanal");
        Transporte metro = new Metro(250, 400, 8.5, "Pantanal Shopping Cuiaba");

        onibus.imprimirDetalhes();
        System.out.println("Tarifa para 40 passageiros: R$ " + onibus.calcularTarifaTotal(40));
        ((Manutencao) onibus).realizarManutencao();
        ((HorarioFuncionamento) onibus).verificarHorarioFuncionamento();

        trem.imprimirDetalhes();
        System.out.println("Tarifa para 35 passageiros: R$ " + trem.calcularTarifaTotal(35));
        ((Manutencao) trem).realizarManutencao();
        ((HorarioFuncionamento) trem).verificarHorarioFuncionamento();

        metro.imprimirDetalhes();
        System.out.println("Tarifa para 60 passageiros: R$ " + metro.calcularTarifaTotal(60));
        ((Manutencao) metro).realizarManutencao();
        ((HorarioFuncionamento) metro).verificarHorarioFuncionamento();
    }
}

