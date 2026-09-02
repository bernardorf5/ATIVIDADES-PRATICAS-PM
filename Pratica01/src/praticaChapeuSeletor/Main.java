import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner infoScanner = new Scanner(System.in);
        
        String nome;
        int idade, escolhaPainel;
        double coragem, inteligencia, ambicao, lealdade, estrategia, criatividade;

        while(true){
            System.out.println("Painel de dados\n1- Registrar dados\n2- Exibir dados\n3- Sair do programa");
            escolhaPainel = infoScanner.nextInt();
            if(escolhaPainel == 1){
                System.out.println("Digite o nome do aluno:");
                nome = infoScanner.nextLine();
                System.out.println("Digite a idade do aluno:");
                idade = infoScanner.nextInt();
                System.out.println("====================================");
                System.out.println("Características Aluno");
                System.out.println("====================================");
                
            }
        }
    }
}   
