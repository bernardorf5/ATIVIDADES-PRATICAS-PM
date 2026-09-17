package praticaCarrinhoCompras;

public class Produto {
    private String nome;
    private int codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome, int codigo, double preco, int quantidade){
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void adicionarEstoque(int valorIncrementado){
        if(valorIncrementado > 0){
            this.quantidade += valorIncrementado;
        }
    }

    public boolean retirarEstoque(int valorRetirado){
        if(valorRetirado > 0){
            if(this.quantidade >= valorRetirado){
                this.quantidade -= valorRetirado;
                return true;
            }
        }
        return false;
    }


}
