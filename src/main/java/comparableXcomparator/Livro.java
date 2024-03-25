package main.java.comparableXcomparator;

import java.util.Comparator;

// Uma classe 'Livro' que implementa Comparable
class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private int ano;

    // Construtor
    public Livro(String ti, String au, int an) {
        this.titulo = ti;
        this.autor = au;
        this.ano = an;
    }

    // Implementação do método compareTo para comparar livros por título
    public int compareTo(Livro l) {
        return titulo.compareTo(l.titulo);
    }

    // Métodos getters para acessar os dados privados
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }
}

// Classe para comparar Livro por autor
class CompararAutor implements Comparator<Livro> {
    @Override
    public int compare(Livro l1, Livro l2) {
        return l1.getAutor().compareTo(l2.getAutor());
    }
}

// Classe para comparar Livro por ano
class CompararAno implements Comparator<Livro> {
    @Override
    public int compare(Livro l1, Livro l2) {
        return Integer.compare(l1.getAno(), l2.getAno());
    }
}

// Classe para comparar Livro por ano, autor e título
class CompararAnoAutorTitulo implements Comparator<Livro> {
    @Override
    public int compare(Livro l1, Livro l2) {
        // Comparação por ano
        int ano = Integer.compare(l1.getAno(), l2.getAno());
        if (ano != 0) {
            return ano;
        }
        // Se os anos forem iguais, compara por autor
        int autor = l1.getAutor().compareTo(l2.getAutor());
        if (autor != 0) {
            return autor;
        }
        // Se os autores forem iguais, compara por título
        return l1.getTitulo().compareTo(l2.getTitulo());
    }
}
