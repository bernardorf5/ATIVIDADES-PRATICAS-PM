package GerenciadorDePedidos;

public class PedidoInvalidoException extends Exception {
    public PedidoInvalidoException(String mensagem) {
        super(mensagem);
    }
}

// Deve ocorrer quando um pedido cancelado tentar ser processado
// e um pedido entregue tentar mudar de status
