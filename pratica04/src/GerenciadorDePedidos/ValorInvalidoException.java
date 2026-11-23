package GerenciadorDePedidos;

public class ValorInvalidoException extends Exception {
    public ValorInvalidoException(String mensagem) {
        super(mensagem);
    }
}

// Deve ocorrer quando o valor do pedido for menor ou igual a zero