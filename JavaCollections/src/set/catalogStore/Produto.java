package set.catalogStore;

import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome, long codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCodigo() == produto.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    public String getNome() {
        return nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    protected void setPreco(double preco) {
        this.preco = preco;
    }

    protected void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return nome + ": " + quantidade + " em estoque, R$" + preco + " a unidade, código: " + codigo;
    }

    @Override
    public int compareTo(Produto produto) {
        return nome.compareToIgnoreCase(produto.getNome());
    }
}

class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto produto1, Produto produto2) {
        return Double.compare(produto1.getPreco(), produto2.getPreco());
    }
}
