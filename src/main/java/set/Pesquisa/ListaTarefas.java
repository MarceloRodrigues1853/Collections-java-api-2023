package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>(); // Inicializa um conjunto HashSet para armazenar as tarefas
    }

    // Adiciona uma nova tarefa à lista
    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    // Remove uma tarefa com base na descrição fornecida
    public void removerTarefa(String descricao) {
        tarefas.removeIf(tarefa -> tarefa.getDescricao().equals(descricao));
    }

    // Exibe todas as tarefas presentes na lista
    public void exibirTarefas() {
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }

    // Retorna o número total de tarefas na lista
    public int contarTarefas() {
        return tarefas.size();
    }

    // Retorna um conjunto de tarefas concluídas
    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> concluidas = new HashSet<>();
        for (Tarefa tarefa : tarefas) {
            if (tarefa.isConcluida()) {
                concluidas.add(tarefa);
            }
        }
        return concluidas;
    }

    // Retorna um conjunto de tarefas pendentes
    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> pendentes = new HashSet<>();
        for (Tarefa tarefa : tarefas) {
            if (!tarefa.isConcluida()) {
                pendentes.add(tarefa);
            }
        }
        return pendentes;
    }

    // Marca uma tarefa como concluída com base na descrição fornecida
    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefa.marcarConcluida();
                break;
            }
        }
    }

    // Marca uma tarefa como pendente com base na descrição fornecida
    public void marcarTarefaPendente(String descricao) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefa.marcarPendente();
                break;
            }
        }
    }

    // Remove todas as tarefas da lista, deixando-a vazia
    public void limparListaTarefas() {
        tarefas.clear();
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();
        lista.adicionarTarefa("Estudar Java");
        lista.adicionarTarefa("Fazer compras");
        lista.marcarTarefaConcluida("Fazer compras");

        System.out.println("Tarefas pendentes:");
        lista.exibirTarefas();
    }
}
