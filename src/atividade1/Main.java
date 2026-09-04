package atividade1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo do transporte: ");
        String tipoTransporte = scanner.nextLine();

        System.out.println("Digite o valor do transporte: ");
        double valorTransporte = scanner.nextDouble();

        Transporte transporte = new Transporte(tipoTransporte, valorTransporte);

        scanner.nextLine();

        System.out.println("Digite a descricao da hospedagem: ");
        String descricaoHospedagem = scanner.nextLine();

        System.out.println("Digite o valor da diaria: ");
        double valorDiaria = scanner.nextDouble();

        Hospedagem hospedagem = new Hospedagem(descricaoHospedagem, valorDiaria);

        scanner.nextLine();

        System.out.println("Digite o destino: ");
        String destino = scanner.nextLine();

        System.out.println("Digite a quantidade de dias: ");
        int quantidadeDias = scanner.nextInt();

        PacoteViagem pacote = new PacoteViagem(
            transporte,
            hospedagem,
            destino,
            quantidadeDias
        );

        System.out.println("Digite a margem de lucro (%): ");
        double margem = scanner.nextDouble();

        System.out.println("Digite o valor das taxas adicionais: ");
        double taxasAdicionais = scanner.nextDouble();

        double totalPacote = pacote.calcularTotal(margem, taxasAdicionais);

        System.out.println("\n--- INFORMACOES DO PACOTE ---");
        System.out.println("Tipo de transporte: " + transporte.getTipo());
        System.out.println("Valor do transporte: US$ " + transporte.getValor());
        System.out.println("Hospedagem: " + hospedagem.getDescricao());
        System.out.println("Valor da diaria: US$ " + hospedagem.getValorDiaria());
        System.out.println("Destino: " + pacote.getDestino());
        System.out.println("Quantidade de dias: " + pacote.getQuantidadeDias());
        System.out.println("Total do pacote em dolar: US$ " + totalPacote);

        scanner.nextLine();

        System.out.println("\nDigite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite a forma de pagamento: ");
        String formaPagamento = scanner.nextLine();

        Venda venda = new Venda(nomeCliente, formaPagamento, pacote);

        System.out.println("Digite a cotacao do dolar: ");
        double cotacao = scanner.nextDouble();

        System.out.println("\n--- INFORMACOES DA VENDA ---");
        venda.mostrarTotal(margem, taxasAdicionais, cotacao);

        scanner.close();
    }
}
