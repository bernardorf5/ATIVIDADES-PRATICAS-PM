package praticaIMC;
public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private double imc;

    public Pessoa(String nome, String sobrenome, int idade, double altura, double peso){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.imc = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
        calculaIMC();
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        calculaIMC();
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public double calculaIMC() {
        this.imc = (this.peso)/(Math.pow(altura, 2));
        return this.imc;
    }

    public String informaObesidade() {
        if(this.imc == 0){
            calculaIMC();
        }

        if(getImc() <= 18.5){
            return "Abaixo do peso";
        } else if(getImc() <= 24.9){
            return "Peso normal";
        } else if(getImc() <= 29.9){
            return "Sobrepeso";
        } else if(getImc() <= 34.9){
            return "Obesidade Grau 1";
        } else if(getImc() <= 39.9){
            return "Obesidade Grau 2";
        } else {
            return "Obesidade Grau 3";
        }
    }
}