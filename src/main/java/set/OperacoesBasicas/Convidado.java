package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    // Atributos
    private String nome;
    private int codigoConvite;

    // Construtor da classe Convidado.
    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    // Obtém o nome do convidado.
    public String getNome() {
        return nome;
    }

    // Obtém o código do convite do convidado.
    public int getCodigoConvite() {
        return codigoConvite;
    }

    // Verifica se dois objetos Convidado são iguais com base no código do convite.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    // Calcula o hash code com base no código do convite.
    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }

    // Retorna uma representação em string do objeto Convidado.
    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}
