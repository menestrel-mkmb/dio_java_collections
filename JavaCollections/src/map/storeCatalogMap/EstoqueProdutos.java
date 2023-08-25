package map.storeCatalogMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1234, "Produto A", 5.0, 10);
        estoque.adicionarProduto(1235, "Produto B", 10.0, 6);
        estoque.adicionarProduto(1236, "Produto C", 2.0, 15);
        estoque.adicionarProduto(1237, "Produto D", 1.2, 80);

        estoque.exibirProdutos();
        System.out.println("O valor total do estoque: " + estoque.calcularValorTotalEstoque());
        System.out.println("O produto mais caro é: " + estoque.obterProdutoMaisCaro());
        System.out.println("O produto mais barato é: " + estoque.obterProdutoMaisBarato());
        System.out.println("O produto com maior custo rotativo em estoque é: "
                + estoque.produtoMaiorCustoRotativo().getNome() + " com o valor rotativo de R$" +
                estoque.produtoMaiorCustoRotativo().getPreco()*estoque.produtoMaiorCustoRotativo().getQuantidade());
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if(estoqueProdutosMap.isEmpty()) {
            for(Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getPreco()*p.getQuantidade();
            }
        }

        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for(Produto p : estoqueProdutosMap.values()) {
            if(p.getPreco() >= maiorPreco) {
                maiorPreco = p.getPreco();
                produtoMaisCaro = p;
            }
        }

        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisCaro = null;
        double menorPreco = Double.MAX_VALUE;
        for(Produto p : estoqueProdutosMap.values()) {
            if(p.getPreco() <= menorPreco) {
                menorPreco = p.getPreco();
                produtoMaisCaro = p;
            }
        }

        return produtoMaisCaro;
    }

    public Produto produtoMaiorCustoRotativo() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for(Produto p : estoqueProdutosMap.values()) {
            if(p.getPreco()*p.getQuantidade() >= maiorPreco) {
                maiorPreco = p.getPreco()*p.getQuantidade();
                produtoMaisCaro = p;
            }
        }

        return produtoMaisCaro;
    }
}
