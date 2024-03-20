package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

// Classe para representar o catálogo de livros
public class CatalogoLivros {
    // Lista para armazenar os livros
    private List<Livro> livroList;

    // Construtor que inicializa a lista de livros
    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    // Método para adicionar um livro ao catálogo
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    // Método para pesquisar livros por autor
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        for (Livro l : livroList) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
                livrosPorAutor.add(l);
            }
        }
        return livrosPorAutor;
    }

    // Método para pesquisar livros por intervalo de anos de publicação
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        for (Livro l : livroList) {
            if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                livrosPorIntervaloAnos.add(l);
            }
        }
        return livrosPorIntervaloAnos;
    }

    // Método para pesquisar um livro por título
    public Livro pesquisarPorTitulo(String titulo) {
        for (Livro l : livroList) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        return null; // Retorna null se o livro não for encontrado
    }

    // Método principal para testar a classe CatalogoLivros
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        // Pesquisa e exibe livros por autor
        System.out.println("Livros do Autor 2:");
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));

        // Pesquisa e exibe livros por intervalo de anos
        System.out.println("Livros publicados entre 2020 e 2021:");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2021));

        // Pesquisa e exibe um livro por título
        System.out.println("Pesquisa pelo título 'Livro 1':");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
