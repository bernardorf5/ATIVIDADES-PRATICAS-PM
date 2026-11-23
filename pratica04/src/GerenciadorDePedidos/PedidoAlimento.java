package GerenciadorDePedidos;

public class PedidoAlimento extends Pedido {
    public PedidoAlimento(int id, String nomeCliente, double valor)
            throws ValorInvalidoException {
        super(id, nomeCliente, valor, StatusPedido.PENDENTE, Categoria.ALIMENTO);
    }

    @Override
    public double calcularValorFinal() {
        return getValor() + 5;
    }
}
