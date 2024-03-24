package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    // Mapa para armazenar as palavras e suas definições
    private Map<String, String> dicionario;

    // Construtor da classe Dicionario
    public Dicionario() {
        // Inicializa o mapa do dicionário como um HashMap
        this.dicionario = new HashMap<>();
    }

    // Método para adicionar uma nova palavra e sua definição ao dicionário
    public void adicionarPalavra(String palavra, String definicao) {
        dicionario.put(palavra, definicao);
    }

    // Método para remover uma palavra do dicionário pelo seu nome
    public void removerPalavra(String palavra) {
        if (!dicionario.isEmpty()) {
            dicionario.remove(palavra);
        } else {
            System.out.println("O dicionário está vazio.");
        }
    }

    // Método para pesquisar a definição de uma palavra no dicionário
    public String pesquisarPorPalavra(String palavra) {
        // Obtém a definição da palavra do dicionário
        String definicao = dicionario.get(palavra);
        // Verifica se a definição foi encontrada
        if (definicao != null) {
            return definicao;
        }
        // Retorna uma mensagem indicando que a palavra não foi encontrada no dicionário
        return "Linguagem não encontrada no dicionário.";
    }

    // Método para exibir todas as palavras e suas definições no dicionário
    public void exibirPalavras() {
        if (!dicionario.isEmpty()) {
            // Exibe o dicionário completo
            System.out.println(dicionario);
        } else {
            System.out.println("O dicionário está vazio.");
        }
    }

    // Método main para testar as funcionalidades da classe Dicionario
    public static void main(String[] args) {
        // Criando uma instância de Dicionario
        Dicionario dicionario = new Dicionario();

        // Adicionando palavras (linguagens de programação) ao dicionário
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        // Exibindo todas as palavras do dicionário
        dicionario.exibirPalavras();

        // Pesquisando a definição de palavras no dicionário
        String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);

        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp);

        // Removendo uma palavra do dicionário
        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
    }
}
