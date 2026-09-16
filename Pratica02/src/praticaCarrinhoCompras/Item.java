public class Item {
    private Produto produtoComprado;
    private int qntComprada;
    private double valorTotalItem;

    public Item(Produto produtoComprado, int qntComprada, double valorTotal){
        this.produtoComprado = produtoComprado;
        this.qntComprada = qntComprada;
        this.valorTotalItem = produtoComprado.getPreco() * qntComprada; 
    }

    public Produto getProdutoComprado() {
        return produtoComprado;
    }

    public void setProdutoComprado(Produto produtoComprado) {
        this.produtoComprado = produtoComprado;
    }

    public int getQntComprada() {
        return qntComprada;
    }

    public void setQntComprada(int qntComprada) {
        this.qntComprada = qntComprada;
    }

    public double getvalorTotalItem() {
        return valorTotalItem;
    }

    public void setvalorTotalItem(double valorTotalItem) {
        this.valorTotalItem = valorTotalItem;
    }

    
}
