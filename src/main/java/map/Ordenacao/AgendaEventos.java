package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    // Mapa para armazenar os eventos por data
    private Map<LocalDate, Evento> eventosMap;

    // Construtor da classe AgendaEventos
    public AgendaEventos() {
        // Inicializa o mapa de eventos como um HashMap
        this.eventosMap = new HashMap<>();
    }

    // Método para adicionar um novo evento à agenda
    public void adicionarEvento(LocalDate data, String nomeEvento, String descricaoAtracao) {
        eventosMap.put(data, new Evento(nomeEvento, descricaoAtracao));
    }

    // Método para exibir a agenda completa de eventos, ordenados por data
    public void exibirAgenda() {
        // Cria um TreeMap a partir do mapa de eventos para ordenar os eventos por data
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        // Itera sobre os eventos ordenados e exibe suas informações
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            LocalDate dataEvento = entry.getKey();
            Evento evento = entry.getValue();
            System.out.println("Data: " + dataEvento + ", Evento: " + evento.getNome() + ", Atração: " + evento.getAtracao());
        }
    }

    // Método para obter e exibir o próximo evento na agenda
    public void obterProximoEvento() {
        // Obtém a data atual
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        // Itera sobre os eventos para encontrar o próximo evento que ocorrerá após a data atual
        for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
            LocalDate dataEvento = entry.getKey();
            if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
                proximaData = dataEvento;
                proximoEvento = entry.getValue();
                break;
            }
        }
        // Verifica se há um próximo evento e o exibe, caso contrário, exibe uma mensagem indicando que não há eventos futuros
        if (proximoEvento != null) {
            System.out.println("O próximo evento: " + proximoEvento.getNome() + " acontecerá na data " + proximaData);
        } else {
            System.out.println("Não há eventos futuros na agenda.");
        }
    }

    // Método main para testar as funcionalidades da classe AgendaEventos
    public static void main(String[] args) {
        // Criando uma instância de AgendaEventos
        AgendaEventos agendaEventos = new AgendaEventos();

        // Adicionando eventos à agenda
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

        // Exibindo a agenda completa de eventos
        agendaEventos.exibirAgenda();

        // Obtendo e exibindo o próximo evento na agenda
        agendaEventos.obterProximoEvento();
    }
}

