import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner infoScanner = new Scanner(System.in);

        String nome, sobrenome, faixaMassa;
        
        int idade;

        double altura, peso, imc = 0.0;

        System.out.println("INFORMAÇÕES");
        System.out.println("================================");

        System.out.println("Digite seu nome:");
        nome = infoScanner.nextLine();
        System.out.println("Digite seu sobrenome:");
        sobrenome = infoScanner.nextLine();
        System.out.println("Digite sua idade:");
        idade = infoScanner.nextInt();
        System.out.println("Digite sua altura:");
        altura = infoScanner.nextDouble();
        System.out.println("Digite seu peso:");
        peso = infoScanner.nextDouble();

        Pessoa individuo = new Pessoa(nome, sobrenome, idade, altura, peso);

        imc = individuo.calculaIMC();

        faixaMassa = individuo.informaObesidade();

        System.out.printf("Valor de IMC: %.2f\nFaixa de massa corporal: %s\n", imc, faixaMassa);

        infoScanner.close();
    }
}