package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

// Classe para realizar a contagem de palavras
public class ContagemPalavras {
    // Mapa para armazenar as palavras e suas contagens
    private Map<String, Integer> palavras;

    // Construtor da classe ContagemPalavras
    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    // Método para adicionar uma palavra e sua contagem ao mapa
    public void adicionarPalavras(String linguagem, Integer contagem) {
        palavras.put(linguagem, contagem);
    }

    // Método para remover uma palavra do mapa
    public void removerPalavra(String palavra) {
        if (!palavras.isEmpty()) {
            palavras.remove(palavra);
        } else {
            System.out.println("O Map está vazio.");
        }
    }

    // Método para exibir a contagem total de palavras
    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for (int contagem : palavras.values()) {
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    // Método para encontrar e retornar a palavra mais frequente
    public String encontrarPalavrasMaisFrequente() {
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
            }
        }
        return linguagemMaisFrequente;
    }

    // Método main para testar a classe ContagemPalavras
    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        // Adiciona palavras e suas contagens
        contagemLinguagens.adicionarPalavras("Java", 2);
        contagemLinguagens.adicionarPalavras("Python", 8);
        contagemLinguagens.adicionarPalavras("JavaScript", 1);
        contagemLinguagens.adicionarPalavras("C#", 6);

        // Exibe a contagem total de palavras
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

        // Encontra e exibe a palavra mais frequente
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavrasMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
