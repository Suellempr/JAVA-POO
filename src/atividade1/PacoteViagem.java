package atividade1;

public class PacoteViagem {

    private Transporte transporte;
    private Hospedagem hospedagem;
    private String destino;
    private int quantidadeDias;

    public PacoteViagem(Transporte transporte, Hospedagem hospedagem,
                        String destino, int quantidadeDias) {
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.quantidadeDias = quantidadeDias;
    }

    public double calcularTotalHospedagem() {
        return quantidadeDias * hospedagem.getValorDiaria();
    }

    public double calcularComLucro(double valor, double margem) {
        double lucro = valor * margem / 100;
        return valor + lucro;
    }

    public double calcularTotal(double margem, double taxasAdicionais) {

        double valorBase = transporte.getValor() + calcularTotalHospedagem();

        double valorComLucro = calcularComLucro(valorBase, margem);

        return valorComLucro + taxasAdicionais;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }

    public String getDestino() {
        return destino;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }
}


 