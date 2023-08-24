package list.numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
    private List<Integer> list;

    public SomaNumeros() {
        this.list = new ArrayList<>();
    }

    public void adicionarNumero(int num) {
        this.list.add(num);
    }

    public int calcularSoma() {
        int sum = 0;
        for(Integer num : list) sum += num;

        return sum;
    }

    public List<Integer> ordenarCrescente() {
        if(list.isEmpty()) return null;
        List<Integer> listaOrdenada = new ArrayList<>(list);
        Collections.sort(listaOrdenada);
        return  listaOrdenada;
    }

    public List<Integer> ordenarDecrescente() {
        if(list.isEmpty()) return null;
        List<Integer> listaOrdenada = new ArrayList<>(list);
        listaOrdenada.sort(Collections.reverseOrder());
        return  listaOrdenada;
    }

    public static void main(String[] args) {
        SomaNumeros lista = new SomaNumeros();

        lista.adicionarNumero(8);
        lista.adicionarNumero(12);
        lista.adicionarNumero(4);
        lista.adicionarNumero(-3);
        lista.adicionarNumero(32);

        System.out.println("Soma dos números: " + lista.calcularSoma() + "\n");
        System.out.println("Lista em ordem crescente: " + lista.ordenarCrescente() + "\n");
        System.out.println("Lista em ordem decrescente: " + lista.ordenarDecrescente());
    }
}
