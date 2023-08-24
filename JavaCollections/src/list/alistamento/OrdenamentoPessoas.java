package list.alistamento;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenamentoPessoas {
    List<Pessoa> lista;

    public static void main(String[] args) {
        OrdenamentoPessoas alistamento = new OrdenamentoPessoas();
        alistamento.adicionarPessoa("João", 18, 1.75);
        alistamento.adicionarPessoa("Enzo", 12, 1.60);
        alistamento.adicionarPessoa("Samuel", 23, 1.95);
        alistamento.adicionarPessoa("José", 20, 1.63);

        System.out.println("Ordenamento por altura: ");
        System.out.println(alistamento.ordenarPorAltura());

        System.out.println("Ordenamento por idade: ");
        System.out.println(alistamento.ordenarPorIdade());
    }

    public OrdenamentoPessoas() {
        this.lista = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        if(pessoa.getIdade() < 18) return;
        lista.add(pessoa);
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        if(idade < 18) return;
        lista.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(lista);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(lista);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
}
