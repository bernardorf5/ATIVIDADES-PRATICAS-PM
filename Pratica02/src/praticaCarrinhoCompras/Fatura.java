package praticaCarrinhoCompras;

import java.util.ArrayList;

public class Fatura {
    private ArrayList<Item> itens;
    private double valorTotalFatura;

    public Fatura(ArrayList<Item> itens, double valorTotalFatura){
        if(itens != null){
            this.itens = itens;
        } else {
            this.itens = new ArrayList<Item>();
        }
        this.valorTotalFatura = valorTotalFatura;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public double getValorTotalFatura() {
        return valorTotalFatura;
    }

    public void setValorTotalFatura(double valorTotalFatura) {
        this.valorTotalFatura = valorTotalFatura;
    }

    public double calcularValorFatura(){
        this.valorTotalFatura = 0.0;
        for(int i = 0; i < this.itens.size(); i++){
            this.valorTotalFatura += this.itens.get(i).getvalorTotalItem();
        }
        return this.valorTotalFatura;
    }

    public void adicionarItem(Item item){
        this.itens.add(item);
    }

    public void realizarCompra(){
        System.out.println("Compra realizada!\nValor total da compra: " + "R$" + this.valorTotalFatura);
    }
}
