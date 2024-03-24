package main.java.map.Ordenacao;

import java.util.Comparator;
import java.util.Map;

// Classe representando um livro
public class Livro {
    // Atributos do livro
    private String titulo;
    private String autor;
    private double preco;

    // Construtor da classe Livro
    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    // Método para obter o título do livro
    public String getTitulo() {
        return titulo;
    }

    // Método para obter o autor do livro
    public String getAutor() {
        return autor;
    }

    // Método para obter o preço do livro
    public double getPreco() {
        return preco;
    }

    // Método toString para representar o livro como uma string
    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", preco=" + preco +
                '}';
    }
}

// Comparador personalizado para ordenar por preço
class ComparatorPorPreco implements Comparator<Map.Entry<String, Livro>> {
    // Método de comparação por preço
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return Double.compare(l1.getValue().getPreco(), l2.getValue().getPreco());
    }
}

// Comparador personalizado para ordenar por autor
class ComparatorPorAutor implements Comparator<Map.Entry<String, Livro>> {
    // Método de comparação por autor
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getAutor().compareToIgnoreCase(l2.getValue().getAutor());
    }
}
