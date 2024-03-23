package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    // Atributo para armazenar os produtos
    private Set<Produto> produtoSet;

    // Construtor da classe CadastroProdutos
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>(); // Inicializa um HashSet para armazenar os produtos
    }

    // Método para adicionar um novo produto ao cadastro
    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    // Método para exibir os produtos ordenados por nome
    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet); // Cria um TreeSet para ordenar os produtos por nome
        return produtosPorNome;
    }

    // Método para exibir os produtos ordenados por preço
    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new Produto.ComparatorPorPreco()); // Cria um TreeSet com um ComparatorPorPreco para ordenar os produtos por preço
        produtosPorPreco.addAll(produtoSet); // Adiciona todos os produtos ao conjunto ordenado por preço
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        // Adiciona alguns produtos ao cadastro
        cadastroProdutos.adicionarProduto(1L, "Produto 5", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 2", 10d, 10);
        cadastroProdutos.adicionarProduto(3L, "Produto 3", 20d, 3);
        cadastroProdutos.adicionarProduto(4L, "Produto 4", 25d, 7);

        // Exibe os produtos na ordem em que foram adicionados
        System.out.println("Produtos na ordem de adição:");
        System.out.println(cadastroProdutos.produtoSet);

        // Exibe os produtos ordenados por nome
        System.out.println("\nProdutos ordenados por nome:");
        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        // Exibe os produtos ordenados por preço
        System.out.println("\nProdutos ordenados por preço:");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
