package main.java.set.Pesquisa;

public class Tarefa {
    private String descricao;
    private boolean concluida;

    // Construtor da classe Tarefa
    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false; // Inicialmente, a tarefa não está concluída
    }

    // Método para obter a descrição da tarefa
    public String getDescricao() {
        return descricao;
    }

    // Método para verificar se a tarefa está concluída
    public boolean isConcluida() {
        return concluida;
    }

    // Método para marcar a tarefa como concluída
    public void marcarConcluida() {
        this.concluida = true;
    }

    // Método para marcar a tarefa como pendente
    public void marcarPendente() {
        this.concluida = false;
    }

    // Método para retornar a representação da tarefa como uma string
    @Override
    public String toString() {
        return descricao + (concluida ? " (Concluída)" : " (Pendente)");
    }
}

