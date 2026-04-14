package SistemaPedidos;

public class Pedido {

    private int id;
    private String cliente;
    StatusPedido status;

    public Pedido(){}

    public Pedido(int id, String cliente, StatusPedido status) {
        this.id = id;
        this.cliente = cliente;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", status=" + status +
                '}';
    }

    public void avancarStatus(){
        if (status == StatusPedido.AGUARDANDO_PAGAMENTO){
            status = StatusPedido.PROCESSANDO;
            IO.println("Processando");
        } else if (status == StatusPedido.PROCESSANDO) {
            status = StatusPedido.ENVIADO;
            IO.println("Enviado");
        } else if (status == StatusPedido.ENVIADO) {
            status = StatusPedido.ENTREGUE;
            IO.println("Entregue");
        } else {
            IO.println("Finalizado");
        }


    }

    public void cancelarPedido(){
        if (status == StatusPedido.ENTREGUE){
            IO.println("Não é possível cancelar pedido entregue!");
        }else {
            status = StatusPedido.CANCELADO;
            IO.println("Pedido cancelado");
        }

    }
}
