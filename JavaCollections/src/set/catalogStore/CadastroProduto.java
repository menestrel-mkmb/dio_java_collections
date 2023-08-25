package set.catalogStore;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    Set<Produto> estoque;

    public CadastroProduto() {
        this.estoque = new HashSet<>();
    }

    public static void main(String[] args) {
        CadastroProduto estoqueSupermercado = new CadastroProduto();

        estoqueSupermercado.adicionarProduto("Fruta 1", 1123432, 3, 30);
        estoqueSupermercado.adicionarProduto("Fruta 2", 1127832, 8, 10);
        estoqueSupermercado.adicionarProduto("Fruta 3", 1123454, 4.5, 18);
        estoqueSupermercado.adicionarProduto("Refrigerante", 1763412, 12, 40);

        estoqueSupermercado.adicionarProduto("Invalido", 1123454, 0.4, 1);y

        System.out.println(estoqueSupermercado.exibirProdutosPorNome());

        System.out.println(estoqueSupermercado.exibirProdutosPorPreco());

    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade) {
        estoque.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        return new TreeSet<>(estoque);
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> setOrdenado = new TreeSet<>(new ComparatorPorPreco());

        setOrdenado.addAll(estoque);

        return  setOrdenado;
    }
}
