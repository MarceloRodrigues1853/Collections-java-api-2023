package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Classe para gerenciar a ordenação de objetos Pessoa
public class OrdenacaoPessoa {
    // Lista para armazenar os objetos Pessoa
    private List<Pessoa> pessoaList;

    // Construtor que inicializa a lista de pessoas
    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    // Método para adicionar uma pessoa à lista
    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    // Método para ordenar a lista de pessoas por idade
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    // Método para ordenar a lista de pessoas por altura
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        // Cria uma instância da classe OrdenacaoPessoa
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        // Adiciona pessoas à lista de ordenação com nome, idade e altura
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.56);

        // Ordena e imprime a lista de pessoas por idade
        System.out.println("Lista ordenada por idade:");
        System.out.println(ordenacaoPessoa.ordenarPorIdade());

        // Ordena e imprime a lista de pessoas por altura
        System.out.println("Lista ordenada por altura:");
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }

}
