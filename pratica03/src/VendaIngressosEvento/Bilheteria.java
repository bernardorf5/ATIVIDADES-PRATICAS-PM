package VendaIngressosEvento;

import java.util.ArrayList;

public class Bilheteria {
    private ArrayList<Ingresso> listaIngressos;

    public Bilheteria(){
        this.listaIngressos = new ArrayList<>();
    }

    public ArrayList<Ingresso> getListaIngressos() {
        return listaIngressos;
    }

    public void setListaIngressos(ArrayList<Ingresso> listaIngressos) {
        this.listaIngressos = listaIngressos;
    }

    public void adicionarIngresso(Ingresso ingresso){
        listaIngressos.add(ingresso);
    }

    public boolean removerIngresso(int codigoIngresso){
        for(int i = 0; i < listaIngressos.size(); i++){
            Ingresso ingressoAtual = listaIngressos.get(i);
            if(ingressoAtual.getCodigo() == codigoIngresso){
                return listaIngressos.remove(ingressoAtual);
            }
        }
        return false;
    }

    public Ingresso buscaIngresso(int codigoIngresso){
        for(int i = 0; i < listaIngressos.size(); i++){
            Ingresso ingressoAtual = listaIngressos.get(i);
            if(ingressoAtual.getCodigo() == codigoIngresso){
                return ingressoAtual;
            }
        }
        return null;
    }

    public void listarIngressos(){
        for(Ingresso i: listaIngressos){
            i.exibirDadosIngresso();
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for(Ingresso i: listaIngressos){
            valorTotal += i.calcularValorFinal();
        }
        return valorTotal;
    }

    public void listarBeneficiosIngressos(){
        for(Ingresso i: listaIngressos){
            System.out.println("Benefício(s): " + i.obterBeneficios());
        }
    }
}
