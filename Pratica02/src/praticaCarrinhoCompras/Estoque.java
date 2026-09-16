import java.util.HashMap;

public class Estoque {
    private HashMap<Integer, Produto> estoque;

    public Estoque(){
        this.estoque = new HashMap<>();
    }

    public HashMap<Integer, Produto> getEstoque() {
        return estoque;
    }

    public void setEstoque(HashMap<Integer, Produto> estoque) {
        this.estoque = estoque;
    }

    public boolean adicionarProduto(Produto produto){
        if(estoque.containsKey(produto.getCodigo())){
            return false;
        } else {
            estoque.put(produto.getCodigo(), produto);
            return true;
        }
    }

    public Produto buscarProduto(Produto produto){
        if(this.estoque.containsKey(produto.getCodigo())){
            return this.estoque.get(produto.getCodigo());
        }
        return null;
    }

    public void removerProduto(Produto produto){
        this.estoque.remove(produto.getCodigo());
    }

    public boolean verificarExistencia(Produto produto){
        if(this.estoque.containsKey(produto.getCodigo())){
            return true;
        }
        return false;
    }

    public void listarProdutos(){
        if(estoque.isEmpty()){
            System.out.println("Estoque vazio");
        } else {
            System.out.println("Estoque: ");
            for(Produto produto : estoque.values()){
                System.out.println("Produto: " + produto.getNome() + "\nCódigo: " + produto.getCodigo() + "\nPreço: " + produto.getPreco() + "\nQuantidade: " + produto.getQuantidade());
            }
        }
    }

}
