package main.java.set.Pesquisa;

import java.util.Objects;

public class Contato {
    // Atributos
    private String nome;
    private int numero;

    public Contato(String nome, int numero) {
        // Construtor para inicializar os atributos
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        // Retorna o nome do contato
        return nome;
    }

    public int getNumero() {
        // Retorna o número de telefone do contato
        return numero;
    }

    public void setNumero(int numero) {
        // Atualiza o número de telefone do contato
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        // Verifica se dois contatos são iguais com base no nome
        if (this == o) return true;
        if (!(o instanceof Contato)) return false;
        Contato contato = (Contato) o;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        // Gera um código hash com base no nome do contato
        return Objects.hash(getNome());
    }

    @Override
    public String toString() {
        // Retorna uma representação em formato de string do contato
        return "{" + nome + "," + numero + "}";
    }
}
