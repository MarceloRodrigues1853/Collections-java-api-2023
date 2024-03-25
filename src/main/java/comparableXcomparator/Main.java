package main.java.comparableXcomparator;

import java.util.ArrayList;
import java.util.Collections;

// Classe principal para demonstrar o uso de Comparable e Comparator
public class Main {
    public static void main(String[] args) {
        // Criando uma lista de livros
        ArrayList<Livro> livros = new ArrayList<Livro>() {
            {
                // Adicionando alguns livros à lista
                add(new Livro("Java - Guia do Programador: Atualizado Para Java 16", "Peter Jandl Junior", 2021));
                add(new Livro("Desenvolvimento Real de Software: Um guia de projetos para fundamentos em Java",
                        "Raoul-Gabriel Urma e  Richard Warburton", 2021));
                add(new Livro(
                        "Microsserviços Prontos Para a Produção: Construindo Sistemas Padronizados em uma Organização de Engenharia de Software",
                        "Susan J. Fowler", 2017));
                add(new Livro("Entendendo Algoritmos: Um Guia Ilustrado Para Programadores e Outros Curiosos",
                        "Aditya Y. Bhargava", 2017));
                add(new Livro("Kotlin em Ação", "Dmitry Jemerov e Svetlana Isakova", 2017));
            }
        };

        // Ordenação dos livros pelo título (ordem natural)
        System.out.println("Livros após a ordenação natural (Título): ");
        Collections.sort(livros);
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo() + " - " +
                    livro.getAutor() + " - " +
                    livro.getAno());
        }

        // Separador
        System.out.println("---------------------------------------");

        // Ordenação dos livros por ano, usando Comparator
        System.out.println("Livros após a ordenação por ano: ");
        Collections.sort(livros, new CompararAno());
        for (Livro livro : livros) {
            System.out.println(livro.getAno() + " - " +
                    livro.getTitulo() + " - " +
                    livro.getAutor());
        }

        // Separador
        System.out.println("---------------------------------------");

        // Ordenação dos livros por autor, usando Comparator
        System.out.println("Livros após a ordenação por autor: ");
        Collections.sort(livros, new CompararAutor());
        for (Livro livro : livros) {
            System.out.println(livro.getAutor() + " - " +
                    livro.getTitulo() + " - " +
                    livro.getAno());
        }

        // Separador
        System.out.println("---------------------------------------");

        // Ordenação dos livros por ano, autor e título, usando Comparator
        System.out.println("Livros após a ordenação por ano, autor e título: ");
        Collections.sort(livros, new CompararAnoAutorTitulo());
        for (Livro livro : livros) {
            System.out.println(livro.getAno() + " - " +
                    livro.getAutor() + " - " +
                    livro.getTitulo());
        }
    }
}
