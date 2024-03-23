package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
    // Atributos da classe Produto
    private long codigo;
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor da classe Produto
    public Produto(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Método de comparação para ordenação por nome
    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    // Método para obter o código do produto
    public long getCodigo() {
        return codigo;
    }

    // Método para obter o nome do produto
    public String getNome() {
        return nome;
    }

    // Método para obter o preço do produto
    public double getPreco() {
        return preco;
    }

    // Método para obter a quantidade do produto
    public int getQuantidade() {
        return quantidade;
    }

    // Método equals para verificar se dois produtos são iguais com base no código
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCodigo() == produto.getCodigo();
    }

    // Método hashCode para gerar o código hash com base no código do produto
    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    // Método toString para representar o produto como uma string
    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    // Classe interna estática ComparatorPorPreco para comparar produtos com base no preço
    static class ComparatorPorPreco implements Comparator<Produto> {

        // Método de comparação por preço
        @Override
        public int compare(Produto p1, Produto p2) {
            return Double.compare(p1.getPreco(), p2.getPreco());
        }
    }
}
