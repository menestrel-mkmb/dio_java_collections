package map.calendar;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> agendaEventos;

    public AgendaEventos() {
        this.agendaEventos = new HashMap<>();
    }

    public static void main(String[] args) {
        AgendaEventos showsDeRock = new AgendaEventos();

        showsDeRock.adicionarEvento(LocalDate.of(2023,11,15),"RockInRisos","Anitta");
        showsDeRock.adicionarEvento(LocalDate.of(2023, Month.APRIL,15),"LCD","Indiester");
        showsDeRock.adicionarEvento(LocalDate.of(2023, 10,19),"LiveYT","Pancadao");

        showsDeRock.exibirAgenda();
        System.out.println("O próximo evento é: " + showsDeRock.obterProximoEvento());
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        agendaEventos.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> agendaOrdenada = new TreeMap<>(agendaEventos);

        System.out.println(agendaOrdenada);
    }

    public Evento obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> agendaOrdenada = new TreeMap<>(agendaEventos);
        Evento proximoEvento = null;

        for(Map.Entry<LocalDate, Evento> entry : agendaOrdenada.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximoEvento = entry.getValue();
                break;
            }
        }
        return proximoEvento;
    }
}
