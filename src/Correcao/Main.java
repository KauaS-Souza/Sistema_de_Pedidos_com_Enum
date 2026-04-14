package Correcao;

public class Main {

    static void main() {

        Pedido pedido = new Pedido(1, "Bixofis",StatusPedido.AGUARDANDO_PAGAMENTO);

        pedido.avancarStatus(pedido);
        IO.println(pedido.getStatus());

        pedido.avancarStatus(pedido);
        IO.println(pedido.getStatus());
    }
}
