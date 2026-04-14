package Correcao;

public class Main {

    static void main() {

        Pedido pedido = new Pedido(1, "Bixofis",StatusPedido.AGUARDANDO_PAGAMENTO);

        Pedido pedido2 = new Pedido(2, "Camilly",StatusPedido.AGUARDANDO_PAGAMENTO);

        pedido2.canceladoPedido();

        pedido.avancarStatus(pedido);
        IO.println(pedido.getStatus());

        pedido.avancarStatus(pedido);
        IO.println(pedido.getStatus());
    }
}
