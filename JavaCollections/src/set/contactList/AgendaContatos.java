package set.contactList;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> agenda;

    public AgendaContatos() {
        this.agenda = new HashSet<>();
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Joao", 1);
        agenda.adicionarContato("Joao Pedro", 2);
        agenda.adicionarContato("Joao Paulo", 3);
        agenda.adicionarContato("Fernando", 4);
        agenda.adicionarContato("Antonio", 10);

        agenda.exibirContatos();

        System.out.println("Resultado da pesquisa por 'Joao': \n"
                + agenda.pesquisarPorNome("Joao"));

        agenda.adicionarContato("Joao", 8);
        agenda.adicionarContato("Pedro", 1);
        agenda.adicionarContato("Roberto", 22);
        agenda.exibirContatos();

        agenda.atualizarNumeroContato("Joao", 6);
        agenda.atualizarNomeContato("Ana Paula", 3);
        agenda.atualizarNomeContato("Fernando", 7);
        agenda.exibirContatos();
    }

    public void adicionarContato(Contato pessoa) {
        if(!agenda.isEmpty()){
            for(Contato cont : agenda) {
                if (cont.getNome().equalsIgnoreCase(pessoa.getNome()) || cont.getNumero() == pessoa.getNumero()) {
                    return;
                }
            }
        }
        agenda.add(pessoa);
    }

    public void adicionarContato(String nome, int numero) {
        if(!agenda.isEmpty()){
            for(Contato cont : agenda) {
                if (cont.getNome().equalsIgnoreCase(nome) || cont.getNumero() == numero) {
                    return;
                }
            }
        }
        agenda.add(new Contato(nome, numero));
    }

    public void removerContatoPeloNome(String nome) {
        if(agenda.isEmpty()) { return; }
        Contato contatoParaRemover = null;

        for(Contato cont : agenda) {
            if(cont.getNome().equalsIgnoreCase(nome)) {
                contatoParaRemover = cont;
                break;
            }
        }

        if(contatoParaRemover == null) {
            return;
        }

        agenda.remove(contatoParaRemover);
    }

    public void removerContatoPeloNumero(int num) {
        if(agenda.isEmpty()) { return; }
        Contato contatoParaRemover = null;

        for(Contato cont : agenda) {
            if(cont.getNumero() == num) {
                contatoParaRemover = cont;
                break;
            }
        }

        if(contatoParaRemover == null) {
            return;
        }

        agenda.remove(contatoParaRemover);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> resultadoPesquisa = new HashSet<>();

        for(Contato cont : agenda) {
            if(cont.getNome().startsWith(nome)) {
                resultadoPesquisa.add(cont);
            }
        }

        return resultadoPesquisa;
    }

    public void atualizarNumeroContato(String nome, int numero) {
        if(agenda.isEmpty()) { return; }

        Contato contatoParaAtualizar = null;

        for(Contato cont : agenda) {
            if(cont.getNumero() == numero) { return; }
        }

        for(Contato cont : agenda) {
            if(cont.getNome().equalsIgnoreCase(nome)) {
                cont.setNumero(numero);
                break;
            }
        }
    }

    public void atualizarNomeContato(String nome, int numero) {

        for(Contato cont : agenda) {
            if(cont.getNome().equalsIgnoreCase(nome)) return;
        }

        for(Contato cont : agenda) {
            if(cont.getNumero() == numero) cont.setNome(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agenda);
    }
}
