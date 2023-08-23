package list.cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> cart;

    public Cart() {
        this.cart = new ArrayList<>();
    }

    public void adicionarItem(Item item){
        cart.add(item);
    }

    public void removerItem(String itemName) {
        List<Item> itemsToRemove = new ArrayList<>();

        for(Item i : cart) {
            if(i.getNome().equalsIgnoreCase(itemName)) itemsToRemove.add(i);
        }

        cart.removeAll(itemsToRemove);
    }

    public double calcularValorTotal() {
        double total = 0;

        for(Item i : cart) total += i.getPreco()*i.getQuantidade();

        return total;
    }

    public void exibirItens() {
        System.out.println(cart);
    }

    public static void main(String[] args) {
        Item papelHigienico = new Item("Papel Neve", 9.00, 3);
        Item cocaCola = new Item("Coca cola", 15.48,4);
        Item celular = new Item("Celular", 1400.00, 1);
        Item cafe = new Item("Café", 18.00, 4);

        Cart cart = new Cart();

        cart.adicionarItem(papelHigienico);
        cart.adicionarItem(cocaCola);
        cart.adicionarItem(celular);
        cart.adicionarItem(cafe);

        System.out.println("Valor total: " + cart.calcularValorTotal());
        cart.exibirItens();

        cart.removerItem("Coca cola");
        cart.removerItem("papel neve"); //testando caseInsensitive

        System.out.println("Valor total: " + cart.calcularValorTotal());
        cart.exibirItens();



    }
}
