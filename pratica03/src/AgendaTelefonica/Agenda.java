package AgendaTelefonica;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;
    private int quantContatos;

    public Agenda(ArrayList<Contato> contatos, int quantContatos){
        this.contatos = contatos;
        this.quantContatos = contatos.size();
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    public int getQuantContatos() {
        return quantContatos;
    }

    public void setQuantContatos(int quantContatos) {
        this.quantContatos = quantContatos;
    }

    public void adicionarContatos(Contato contato){
        this.contatos.add(contato);
        this.quantContatos = this.contatos.size();
    }

    public boolean removerContato(Contato contato){
        if(this.contatos.remove(contato)){
            this.quantContatos = this.contatos.size();
            return true;
        }
        this.quantContatos = this.contatos.size();
        return false;
    }

    public Contato buscarContatoNome(String nomeContato){
        for(int i = 0; i < this.contatos.size(); i++){
            Contato contatoAtual = this.contatos.get(i);
            if(contatoAtual.getNome().toLowerCase().equals(nomeContato.toLowerCase())){
                return contatoAtual;
            }
        }
        return null;
    }

    public Contato buscarContatoEmail(String emailContato){
        for(int i = 0; i < this.contatos.size(); i++){
            Contato contatoAtual = this.contatos.get(i);
            if(contatoAtual.getEmail().toLowerCase().equals(emailContato.toLowerCase())){
                return contatoAtual;
            }
        }
        return null;
    }

    public Contato buscarContatoTelefone(String telefoneContato){
        for(int i = 0; i < this.contatos.size(); i++){
            Contato contatoAtual = this.contatos.get(i);
            if(contatoAtual.getTelefone().equals(telefoneContato)){
                return contatoAtual;
            }
        }
        return null;
    }

}
