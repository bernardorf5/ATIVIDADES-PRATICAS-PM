package praticaChapeuSeletor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner infoScanner = new Scanner(System.in);

        Aluno aluno = null; 
        int escolhaPainel;

        while (true) {
            System.out.println("\nPainel de dados\n1- Registrar dados\n2- Exibir dados\n3- Chapéu Seletor\n4- Sair do programa");
            escolhaPainel = infoScanner.nextInt();
            infoScanner.nextLine();

            if (escolhaPainel == 4) {
                System.out.println("\nSaindo do programa.");
                break;
            }

            if (escolhaPainel == 1) {
                System.out.println("\nDigite o nome do aluno:");
                String nome = infoScanner.nextLine();
                
                System.out.println("Digite a idade do aluno:");
                int idade = infoScanner.nextInt();
                
                System.out.println("====================================");
                System.out.println("Características Aluno");
                System.out.println("====================================");
                System.out.println("Coragem:");
                double coragem = infoScanner.nextDouble();
                
                System.out.println("Inteligência:");
                double inteligencia = infoScanner.nextDouble();
                
                System.out.println("Ambição:");
                double ambicao = infoScanner.nextDouble();
                
                System.out.println("Lealdade:");
                double lealdade = infoScanner.nextDouble();
                
                System.out.println("Estratégia:");
                double estrategia = infoScanner.nextDouble();
                
                System.out.println("Criatividade:");
                double criatividade = infoScanner.nextDouble();

                aluno = new Aluno(nome, idade, coragem, inteligencia, ambicao, lealdade, estrategia, criatividade);
                System.out.println("Aluno registrado com sucesso!");
            }

            if (escolhaPainel == 2) {
                if (aluno == null) {
                    System.out.println("\nNenhum dado foi registrado.");
                } else {
                    aluno.exibirInformacoes();
                }
            }

            if (escolhaPainel == 3) {
                if (aluno == null) {
                    System.out.println("\nNenhum dado foi registrado.");
                } else {
                    System.out.println("\n====================================");
                    System.out.println("O Chapéu Seletor determinou:");
                    System.out.println(aluno.getNome() + " pertence à casa " + aluno.getCasa() + "!");
                    System.out.println("====================================");
                }
            }
        }
        
        infoScanner.close();
    }
}