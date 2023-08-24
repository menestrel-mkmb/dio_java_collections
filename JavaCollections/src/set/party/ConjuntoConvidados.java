package set.party;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados implements Comparable<Convidado> {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public static void main(String[] args) {
        ConjuntoConvidados festa = new ConjuntoConvidados();

        festa.adicionarConvidado("Andrei", 24);
        festa.adicionarConvidado("chiselgrape", 68);
        festa.adicionarConvidado("chiselgrapefake", 24);
        festa.adicionarConvidado("Jão", 1);
        festa.adicionarConvidado("Felipe", 2);

        festa.exibirConvidados();
        System.out.println("Total de Convidados: " + festa.contarConvidados());

        festa.removerConvidadoPorCodigoConvite(2);
        festa.exibirConvidados();
        System.out.println("Total de Convidados: " + festa.contarConvidados());
    }

    @Override
    public int compareTo(Convidado convidado) {
        return 0;
    }

    public void adicionarConvidado(Convidado conv) {
        convidadoSet.add(conv);
    }

    public void adicionarConvidado(String nome, int codigo) {
        convidadoSet.add(new Convidado(nome, codigo));
    }

    public void removerConvidadoPorCodigoConvite(int codigo) {
        Convidado convidadoParaRemover = null;
        for(Convidado conv : convidadoSet) {
            if (conv.getCodigoConvite() == codigo){
                convidadoParaRemover = conv;
                break;
            }
        }
        if(convidadoParaRemover == null){
            System.out.println("Não foi encontrado nenhum convidado com esse código");
            return;
        }

        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }
}
