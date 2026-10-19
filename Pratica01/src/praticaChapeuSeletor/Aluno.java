package praticaChapeuSeletor;

import java.time.LocalDate;
import java.time.Period;

public class Aluno {
    private String nome;
    private int idade;
    private double coragem;
    private double inteligencia;
    private double ambicao;
    private double lealdade;
    private double estrategia;
    private double criatividade;
    private String casa;
    private LocalDate data_nascimento;
    private String codigoMatricula;

    public Aluno(String nome, double coragem, double inteligencia, double ambicao, double lealdade, double estrategia, double criatividade, LocalDate data_nascimento) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.idade = calcularIdade();
        this.coragem = coragem;
        this.inteligencia = inteligencia;
        this.ambicao = ambicao;
        this.lealdade = lealdade;
        this.estrategia = estrategia;
        this.criatividade = criatividade;
        this.casa = calcularCasa();
    }
    
    public String calcularCasa() {
        double grifinoria = 2 * this.coragem + this.lealdade;
        double sonserina = 2 * this.ambicao + this.estrategia;
        double corvinal = 2 * this.inteligencia + this.criatividade;
        double lufalufa = (2 * this.lealdade + this.coragem) / 3.0;

        this.casa = "Grifinória";
        double maiorPontuacao = grifinoria;

        if (sonserina > maiorPontuacao) {
            maiorPontuacao = sonserina;
            this.casa = "Sonserina";
        }

        if (corvinal > maiorPontuacao) {
            maiorPontuacao = corvinal;
            this.casa = "Corvinal";
        }

        if (lufalufa > maiorPontuacao) {
            this.casa = "Lufa-Lufa";
        }

        return this.casa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getCoragem() {
        return coragem;
    }

    public void setCoragem(double coragem) {
        this.coragem = coragem;
    }

    public double getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(double inteligencia) {
        this.inteligencia = inteligencia;
    }

    public double getAmbicao() {
        return ambicao;
    }

    public void setAmbicao(double ambicao) {
        this.ambicao = ambicao;
    }

    public double getLealdade() {
        return lealdade;
    }

    public void setLealdade(double lealdade) {
        this.lealdade = lealdade;
    }

    public double getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(double estrategia) {
        this.estrategia = estrategia;
    }

    public double getCriatividade() {
        return criatividade;
    }

    public void setCriatividade(double criatividade) {
        this.criatividade = criatividade;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getCodigoMatricula() {
        return codigoMatricula;
    }

    public void setCodigoMatricula(String codigoMatricula) {
        this.codigoMatricula = codigoMatricula;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("===============================");
        System.out.println("Características ");
        System.out.println("===============================");
        System.out.println("Coragem: " + this.coragem);
        System.out.println("Inteligência: " + this.inteligencia);
        System.out.println("Ambição: " + this.ambicao);
        System.out.println("Lealdade: " + this.lealdade);
        System.out.println("Estratégia: " + this.estrategia);
        System.out.println("Criatividade: " + this.criatividade);
        System.out.println("Casa: " + this.casa);
    }

    public int calcularIdade(){
        return Period.between(data_nascimento, LocalDate.now()).getYears();
    }

    public boolean verificarMaioridade(){
        if(calcularIdade() >= 17){
            return true;
        }
        return false;
    }

    public String formatarCasa(){
        return this.casa = this.casa.toUpperCase();
    }

    public String gerarLogin(){
        String login;
        char charNome = getNome().strip().charAt(0);
        String[] sobrenome = getNome().strip().split(" ", 2);
        if(sobrenome.length > 1){
            login = charNome + sobrenome[1].toLowerCase().replace(" ", "");
            return login;
        }
        login = sobrenome[0];
        return login;
    }

    public String gerarCodigoMatricula(int posicaoCadastro){
        int ano = LocalDate.now().getYear();
        String[] nome = getNome().strip().split(" ");
        String iniciais = "";
        for(int i = 0; i < nome.length; i++){
            char inicial = nome[i].charAt(0);
            iniciais += inicial;
        }
        return String.format("%s-%d-%02d", iniciais, ano, posicaoCadastro);
    }

    public boolean verificarCasa(String casa){
        return casa.toLowerCase().equals(getCasa().toLowerCase());
    }

    public boolean verificarSobrenome(String stringProcurada){
        String[] nome = getNome().strip().split(" ", 2);
        if(nome.length < 2){
            return false;
        }
        return nome[1].toLowerCase().contains(stringProcurada.toLowerCase());
    } 
}