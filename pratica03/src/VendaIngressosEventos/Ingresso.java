package VendaIngressosEventos;

public abstract class Ingresso {
    private int codigo;
    private String nomeEvento;
    private String setor;
    private double valorBase;

    public Ingresso(int codigo, String nomeEvento, String setor, double valorBase){
        this.codigo = codigo;
        this.nomeEvento = nomeEvento;
        this.setor = setor;
        this.valorBase = valorBase;
    }

    public void exibirDadosIngresso(){
        System.out.println("========== INGRESSO ==========\n");
        System.out.println("EVENTO: " + this.nomeEvento);
        System.out.println("SETOR: " + this.setor);
        System.out.println("VALOR: " + this.valorBase);
        System.out.print("CÓDIGO DO INGRESSO: " + this.codigo);
        System.out.println("==============================\n");
    }

    public abstract double calcularValorFinal();
    public abstract String obterBeneficios();
}   
