package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    // Atributo para armazenar as palavras únicas
    private Set<String> palavrasUnicas;

    // Construtor padrão que inicializa o conjunto de palavras únicas como um HashSet vazio.
    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    // Adiciona uma palavra ao conjunto.
    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    // Remove uma palavra do conjunto.
    public void removerPalavra(String palavra) {
        palavrasUnicas.remove(palavra);
    }

    // Verifica se uma palavra está presente no conjunto.
    public boolean verificarPalavra(String palavra) {
        return palavrasUnicas.contains(palavra);
    }

    // Exibe todas as palavras únicas do conjunto.
    public void exibirPalavrasUnicas() {
        System.out.println(palavrasUnicas);
    }

    // Método principal (main) para demonstração.
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();
        conjunto.adicionarPalavra("banana");
        conjunto.adicionarPalavra("maçã");
        conjunto.adicionarPalavra("uva");

        System.out.println("Palavras únicas no conjunto:");
        conjunto.exibirPalavrasUnicas();

        conjunto.removerPalavra("maçã");

        System.out.println("Após remover 'maçã':");
        conjunto.exibirPalavrasUnicas();

        System.out.println("Verificando se 'banana' está presente: " + conjunto.verificarPalavra("banana"));
        System.out.println("Verificando se 'laranja' está presente: " + conjunto.verificarPalavra("laranja"));
    }
}

