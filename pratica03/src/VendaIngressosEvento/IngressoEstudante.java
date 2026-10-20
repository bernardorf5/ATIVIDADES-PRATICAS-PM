package VendaIngressosEvento;

public class IngressoEstudante extends Ingresso{
    private String instituicaoEnsino;

    public IngressoEstudante(int codigo, String nomeEvento, String setor, double valorBase, String instituicaoEnsino){
        super(codigo, nomeEvento, setor, valorBase);
        this.instituicaoEnsino = instituicaoEnsino;
    }

    public double calcularValorFinal(){
        return getValorBase()/2;
    }

    public String obterBeneficios(){
        return "Direito à meia-entrada";
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public void setInstituicaoEnsino(String instituicaoEnsino) {
        this.instituicaoEnsino = instituicaoEnsino;
    }

    
}
