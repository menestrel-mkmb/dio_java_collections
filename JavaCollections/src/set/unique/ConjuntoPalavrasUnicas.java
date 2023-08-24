package set.unique;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> conjunto;
    public ConjuntoPalavrasUnicas() {
        this.conjunto = new HashSet<>();
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas trivia = new ConjuntoPalavrasUnicas();

        trivia.adicionarPalavra("trivia");
        trivia.adicionarPalavra("teste");
        trivia.adicionarPalavra("abacate");
        trivia.adicionarPalavra("vuvuzela");
        trivia.adicionarPalavra("mouse");

        System.out.println("Verificando palavra trivia: " + trivia.verificarPalavra("trivia"));

        trivia.adicionarPalavra("trivia");

        trivia.exibirPalavrasUnicas();
    }

    public void adicionarPalavra(String palavra) {
        if(!verificarPalavra(palavra)) conjunto.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if(verificarPalavra(palavra)) conjunto.remove(palavra);
    }

    private boolean verificarPalavra(String palavra) {
        return conjunto.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        for(String palavra : conjunto) System.out.println(palavra);
    }

    @Override
    public String toString() {
        return conjunto + "\n";
    }


}
