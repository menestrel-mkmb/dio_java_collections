package list.cart;

public class Item {
    private String nome;
    private double precoUnitario;
    private int quantidade;

    public Item(String nome, double precoUnitario, int quantidade) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return precoUnitario;
    }

    public void setPreco(double preco) {
        this.precoUnitario = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + precoUnitario +
                ", quantidade=" + quantidade +
                '}';
    }
}
