package AgendaTelefonica;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;
    private int quantContatos;

    public Agenda(ArrayList<Contato> contatos, int quantContatos){
        this.contatos = contatos;
        this.quantContatos = contatos.size();
    }
}
