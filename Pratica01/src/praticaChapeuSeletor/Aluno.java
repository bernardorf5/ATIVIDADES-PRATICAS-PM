package praticaChapeuSeletor;

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

    public Aluno(String nome, int idade, double coragem, double inteligencia, double ambicao, double lealdade, double estrategia, double criatividade) {
        this.nome = nome;
        this.idade = idade;
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

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public double getCoragem() { return coragem; }
    public void setCoragem(double coragem) { 
        this.coragem = coragem; 
    }

    public double getInteligencia() { return inteligencia; }
    public void setInteligencia(double inteligencia) { 
        this.inteligencia = inteligencia; 
    }

    public double getAmbicao() { return ambicao; }
    public void setAmbicao(double ambicao) { 
        this.ambicao = ambicao; 
    }

    public double getLealdade() { return lealdade; }
    public void setLealdade(double lealdade) { 
        this.lealdade = lealdade; 
    }

    public double getEstrategia() { return estrategia; }
    public void setEstrategia(double estrategia) { 
        this.estrategia = estrategia; 
    }

    public double getCriatividade() { return criatividade; }
    public void setCriatividade(double criatividade) { 
        this.criatividade = criatividade; 
    }

    public String getCasa() { return casa; }

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
}