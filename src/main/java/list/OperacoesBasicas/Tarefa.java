package main.java.list.OperacoesBasicas;

public class Tarefa {
    // Atributo para armazenar a descrição da tarefa
    private String descricao;

    // Construtor da classe Tarefa
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    // Método para obter a descrição da tarefa
    public String getDescricao() {
        return descricao;
    }

    // Sobrescrita do método toString para exibir a descrição da tarefa
    @Override
    public String toString() {
        return descricao;
    }
}
