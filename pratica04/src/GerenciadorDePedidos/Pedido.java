package GerenciadorDePedidos;

public abstract class Pedido implements Processavel{
    private int id;
    private String nomeCliente;
    private double valor;
    private StatusPedido status;
    private Categoria categoria;

    public Pedido(int id, String nomeCliente, double valor, StatusPedido status, Categoria categoria) throws ValorInvalidoException{
        this.id = id;
        this.nomeCliente = nomeCliente;
        if(valor <= 0){
            throw new ValorInvalidoException("Valor inválido para o pedido");
        }
        this.valor = valor;
        this.status = status;
        this.categoria = categoria;
    }

    public void processarPedido() throws PedidoInvalidoException{
        if(this.status == StatusPedido.CANCELADO) {
            throw new PedidoInvalidoException("O pedido foi cancelado");
        }
        if(this.status == StatusPedido.ENTREGUE) {
            throw new PedidoInvalidoException("O pedido já foi entregue");
        }
        this.status = StatusPedido.PROCESSANDO;
    }

    public abstract double calcularValorFinal();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) throws ValorInvalidoException{
        if(valor <= 0){
            throw new ValorInvalidoException("Valor inválido para o pedido");
        }
        this.valor = valor;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) throws PedidoInvalidoException{
        if(this.status == StatusPedido.CANCELADO) {
            throw new PedidoInvalidoException("O pedido foi cancelado");
        }
        if(this.status == StatusPedido.ENTREGUE) {
            throw new PedidoInvalidoException("O pedido já foi entregue");
        }
        this.status = status;
    }

    public Categoria getCategoria() {
        return categoria;
    }
    
}
