package SistemaPedidos;

public class Main {

    static void main() {

        Pedido cliente = new Pedido(1,"Logan", StatusPedido.AGUARDANDO_PAGAMENTO);
        IO.println(cliente);
        cliente.avancarStatus();
        IO.println(cliente);
        cliente.cancelarPedido();
        IO.println(cliente);
    }

}
