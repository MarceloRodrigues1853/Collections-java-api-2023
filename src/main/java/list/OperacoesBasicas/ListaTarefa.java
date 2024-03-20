package main.java.list.OperacoesBasicas;

//Essas linhas permitem que você use classes e métodos da biblioteca Java, como listas e arrays.
import java.util.ArrayList;
import java.util.List;

//representa uma lista de tarefas (como uma lista de afazeres).
public class ListaTarefa {
    // Atributo para armazenar a lista de tarefas
    private List<Tarefa> tarefaList;

    // Construtor da classe ListaTarefa
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    // Adiciona uma nova tarefa à lista
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    // Remove uma tarefa com base na descrição
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    // Retorna o número total de tarefas na lista
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    // Exibe as descrições das tarefas na lista
    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de elemntos na lista é: " + listaTarefa.obterNumeroTotalTarefas());


        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elemntos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de elemntos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
