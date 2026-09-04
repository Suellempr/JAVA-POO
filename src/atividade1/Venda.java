package atividade1;

public class Venda {
    private String nomeCliente;
    private String formaPagamento;
    private PacoteViagem pacote;

    public Venda(String nomeCliente, String formaPagamento, PacoteViagem pacote) {
        this.nomeCliente = nomeCliente;
        this.formaPagamento = formaPagamento;
        this.pacote = pacote;
    }

    public double converterParaReais(double valorDolar, double cotacao) {
        return valorDolar * cotacao;
    }

    public void mostrarTotal(double margem, double taxasAdicionais, double cotacao) {

        double totalDolar = pacote.calcularTotal(margem, taxasAdicionais);
        double totalReais = converterParaReais(totalDolar, cotacao);

        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Forma de pagamento: " + formaPagamento);
        System.out.println("Total em dólar: US$ " + totalDolar);
        System.out.println("Total em reais: R$ " + totalReais);
    }
}