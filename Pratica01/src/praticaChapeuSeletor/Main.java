package praticaChapeuSeletor;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        Scanner infoScanner = new Scanner(System.in);

        Aluno[] listaAlunos = new Aluno[10];
        int contadorAlunos = 0;
        int escolhaPainel;

        while (true) {
            System.out.println("\nPainel de dados\n1- Cadastrar Aluno\n2- Exibir dados\n3- Chapéu Seletor\n4- Sair do programa");
            escolhaPainel = infoScanner.nextInt();
            infoScanner.nextLine();

            if (escolhaPainel == 4) {
                System.out.println("\nSaindo do programa.");
                break;
            }

            if (escolhaPainel == 1) {
                System.out.println("\nDigite o nome do aluno:");
                String nome = infoScanner.nextLine();

                System.out.println("Data de nascimento no formato ano-mês-dia(Exemplo: 2026-10-22): ");
                String textoData = infoScanner.nextLine();
                LocalDate dataNascimento = LocalDate.parse(textoData);
                
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

                listaAlunos[contadorAlunos] = (new Aluno(nome, coragem, inteligencia, ambicao, lealdade, estrategia, criatividade, dataNascimento));
                listaAlunos[contadorAlunos].setCodigoMatricula(listaAlunos[contadorAlunos].gerarCodigoMatricula(contadorAlunos + 1));
                contadorAlunos++;
                System.out.println("Aluno registrado com sucesso!");
            }

            if (escolhaPainel == 2) {
                if (contadorAlunos == 0) {
                    System.out.println("\nNenhum dado foi registrado.");
                } else {
                    for (int i = 0; i < contadorAlunos; i++) {
                        listaAlunos[i].exibirInformacoes();
                    }
                }
            }
        }
        
        infoScanner.close();
    }
}