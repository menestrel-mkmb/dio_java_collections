package map.contactListMap;

import java.util.HashMap;
import java.util.Map;
public class AgendaContatosMap {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatosMap() {
        this.agendaContatoMap = new HashMap<>();
    }

    public static void main(String[] args) {
        AgendaContatosMap agenda = new AgendaContatosMap();

        agenda.adicionarContato("Joao", 1);
        agenda.adicionarContato("Joao Pedro", 2);
        agenda.adicionarContato("Joao Paulo", 3);
        agenda.adicionarContato("Fernando", 4);
        agenda.adicionarContato("Antonio", 10);

        agenda.exibirContatos();

        System.out.println("Resultado da pesquisa por 'Joao': \n"
                + agenda.pesquisarPorNome("Joao"));

        agenda.removerContato("Fernando");
        agenda.adicionarContato("Joao", 8);
        agenda.adicionarContato("Pedro", 1);
        agenda.adicionarContato("Roberto", 22);
        agenda.exibirContatos();

        agenda.atualizarNumeroContato("Joao", 6);
        agenda.exibirContatos();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(agendaContatoMap.isEmpty()) { return; }

        agendaContatoMap.remove(nome);
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        if(agendaContatoMap.isEmpty()) { return -1; }

        return agendaContatoMap.get(nome);
    }

    public void atualizarNumeroContato(String nome, Integer num) {
        if(agendaContatoMap.isEmpty()) { return; }

        agendaContatoMap.replace(nome, num);
    }
}
