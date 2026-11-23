package GerenciadorDePedidos;

public class PedidoRoupa extends Pedido implements Entregavel {
    public PedidoRoupa(int id, String nomeCliente, double valor)
            throws ValorInvalidoException {
        super(id, nomeCliente, valor, StatusPedido.PENDENTE, Categoria.ROUPA);
    }

    @Override
    public double calcularValorFinal() {
        double valorFinal = getValor();
        if (valorFinal > 200) {
            return valorFinal * 0.8;
        }
        return valorFinal;
    }

    @Override
    public double calcularFrete() {
        return 10 + calcularValorFinal() * 0.05;
    }
}
