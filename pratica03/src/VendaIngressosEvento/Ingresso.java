package VendaIngressosEvento;

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
        System.out.println("CÓDIGO: " + this.codigo + "\n");
        System.out.println("==============================");
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public abstract double calcularValorFinal();
    public abstract String obterBeneficios();
}
