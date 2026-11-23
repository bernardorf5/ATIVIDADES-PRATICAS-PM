package GerenciadorDePedidos;

public class PedidoEletronico extends Pedido implements Entregavel {
    public PedidoEletronico(int id, String nomeCliente, double valor)
            throws ValorInvalidoException {
        super(id, nomeCliente, valor, StatusPedido.PENDENTE, Categoria.ELETRONICO);
    }

    @Override
    public double calcularValorFinal() {
        double valorFinal = getValor();
        if (valorFinal > 100) {
            return valorFinal * 0.9;
        }
        return valorFinal;
    }

    @Override
    public double calcularFrete() {
        return 20 + calcularValorFinal() * 0.1;
    }
}
