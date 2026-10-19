package AgendaTelefonica;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agendaContatos = new Agenda();
        Scanner infoScanner = new Scanner(System.in);
        String escolhaScanner = "";

        while(!escolhaScanner.equals("g")){
            System.out.println("MENU\n");
            System.out.println("(a) Adicionar contato");
            System.out.println("(b) Remover contato");
            System.out.println("(c) Buscar contato por nome");
            System.out.println("(d) Buscar contato por email");
            System.out.println("(e) Buscar contato por telefone");
            System.out.println("(f) Consultar tamanho da agenda");
            System.out.println("(g) Finalizar");

            escolhaScanner = infoScanner.nextLine();
            
            if(escolhaScanner.equals("g")){
                System.out.println("Finalizando programa...");
                break;
            }
            else if(escolhaScanner.equals("a")){
                System.out.println("Nome:");
                String nome = infoScanner.nextLine();
                System.out.println("Email:");
                String email = infoScanner.nextLine();
                System.out.println("Telefone:");
                String telefone = infoScanner.nextLine();

                System.out.println("Qual o tipo de contato a ser adicionado?\n1- Contato comum\n2- Contato pessoal\n3- Contato profissional\n4- Contato de emergência");
                int escolhaContato = infoScanner.nextInt();
                infoScanner.nextLine();
                if(escolhaContato == 1){
                    Contato contato = new Contato(nome, email, telefone);
                    agendaContatos.adicionarContatos(contato);
                    System.out.println("Contato adicionado!");
                }
                else if(escolhaContato == 2){
                    System.out.println("Data aniversário:");
                    String dataAniversario = infoScanner.nextLine();
                    System.out.println("Parentesco:");
                    String parentesco = infoScanner.nextLine();
                    ContatoPessoal contatoPessoal = new ContatoPessoal(nome, email, telefone, dataAniversario, parentesco);
                    agendaContatos.adicionarContatos(contatoPessoal);
                    System.out.println("Contato adicionado!");
                }
                else if(escolhaContato == 3){
                    System.out.println("Empresa:");
                    String empresa = infoScanner.nextLine();
                    System.out.println("Cargo:");
                    String cargo = infoScanner.nextLine();
                    ContatoProfissional contatoProfissional = new ContatoProfissional(nome, email, telefone, empresa, cargo);
                    agendaContatos.adicionarContatos(contatoProfissional);
                    System.out.println("Contato adicionado!");
                }
                else if(escolhaContato == 4){
                    System.out.println("Grau de Prioridade(1 a 5):");
                    int grauPrioridade = infoScanner.nextInt();
                    infoScanner.nextLine();
                    while(grauPrioridade < 1 || grauPrioridade > 5){
                        System.out.println("ERROR! Grau de Prioridade inválido");
                        grauPrioridade = infoScanner.nextInt();
                    }
                    infoScanner.nextLine();
                    System.out.println("Observação:");
                    String observacao = infoScanner.nextLine();
                    ContatoEmergencia contatoEmergencia = new ContatoEmergencia(nome, email, telefone, grauPrioridade, observacao);
                    agendaContatos.adicionarContatos(contatoEmergencia);
                    System.out.println("Contato adicionado!");
                }
                else {
                    System.out.println("Opção inválida!");
                    }
            }
            else if(escolhaScanner.equals("b")){
                System.out.println("Deseja remover o contato por qual informação?");
                System.out.println("1- Nome");
                System.out.println("2- E-mail");
                System.out.println("3- Telefone");
                int escolhaRemocao = infoScanner.nextInt();
                infoScanner.nextLine();

                Contato contatoParaRemover = null;

                if(escolhaRemocao == 1){
                    System.out.println("Digite o nome do contato que deseja remover:");
                    String nomeRemover = infoScanner.nextLine();
                    contatoParaRemover = agendaContatos.buscarContatoNome(nomeRemover);
                }
                else if(escolhaRemocao == 2){
                    System.out.println("Digite o email do contato que deseja remover:");
                    String emailRemover = infoScanner.nextLine();
                    contatoParaRemover = agendaContatos.buscarContatoEmail(emailRemover);
                }
                else if(escolhaRemocao == 3){
                    System.out.println("Digite o telefone do contato que deseja remover:");
                    String telefoneRemover = infoScanner.nextLine();
                    contatoParaRemover = agendaContatos.buscarContatoTelefone(telefoneRemover);
                }
                else {
                    System.out.println("ERROR! Opção não existe");
                    continue;
                }

                if(contatoParaRemover != null && agendaContatos.removerContato(contatoParaRemover)){
                    System.out.println("Contato removido com sucesso!");
                } else {
                    System.out.println("ERROR! Contato não encontrado");
                }
            }
            else if(escolhaScanner.equals("c")){
                System.out.println("Digite o nome do contato que deseja buscar:");
                String nome = infoScanner.nextLine();
                Contato contatoAchado = agendaContatos.buscarContatoNome(nome);
                if(contatoAchado != null){
                    System.out.println("Contato achado\n");
                    contatoAchado.exibirDados();
                } else {
                    System.out.println("ERROR! NENHUM CONTATO ENCONTRADO COM ESSE NOME");
                }
            }
            else if(escolhaScanner.equals("d")){
                System.out.println("Digite o email do contato que deseja buscar:");
                String email = infoScanner.nextLine();
                Contato contatoAchado = agendaContatos.buscarContatoEmail(email);
                if(contatoAchado != null){
                    System.out.println("Contato achado!\n");
                    contatoAchado.exibirDados();
                } else {
                    System.out.println("ERROR! NENHUM CONTATO ENCONTRADO COM ESSE EMAIL");
                }
            }
            else if(escolhaScanner.equals("e")){
                System.out.println("Digite o telefone do contato que deseja buscar:");
                String telefone = infoScanner.nextLine();
                Contato contatoAchado = agendaContatos.buscarContatoTelefone(telefone);
                if(contatoAchado != null){
                    System.out.println("Contato achado!\n");
                    contatoAchado.exibirDados();
                } else {
                    System.out.println("ERROR! NENHUM CONTATO ENCONTRADO COM ESSE TELEFONE");
                }
            }
            else if(escolhaScanner.equals("f")){
                System.out.println("A agenda tem atualmente: " + agendaContatos.getQuantContatos() + " contatos");
            }
            else {
                System.out.println("ERROR! Opção inválida no menu");
            }
        }
        infoScanner.close();
    }
}
