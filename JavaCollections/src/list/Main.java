package list;

import list.basicOperations.ListaTarefas;

public class Main {
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        lista.obterNumeroTotalTarefas();

        lista.adicionarTarefa("ir ao mercado");
        lista.adicionarTarefa("ir a academia");
        lista.adicionarTarefa("ir ao mercado");
        lista.adicionarTarefa("ir ao mercado");
        lista.adicionarTarefa("upar ficha rpg");

        System.out.println("Tamanho da lista: " + lista.obterNumeroTotalTarefas());
        System.out.println("Remover tarefa do mercado");
        lista.removerTarefa("ir ao mercado");

        lista.obterDescricoesTarefas();
        System.out.println("Tamanho da lista: " + lista.obterNumeroTotalTarefas());

    }
}