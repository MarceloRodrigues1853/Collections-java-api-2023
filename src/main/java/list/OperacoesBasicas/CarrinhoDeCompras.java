package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

// Classe para representar o carrinho de compras
public class CarrinhoDeCompras {
    // Lista para armazenar os itens do carrinho
    private List<Item> itens;

    // Construtor da classe CarrinhoDeCompras
    public CarrinhoDeCompras() {
        itens = new ArrayList<>();
    }

    // Adiciona um item ao carrinho
    public void adicionarItem(String nome, double preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }

    // Remove um item do carrinho pelo nome
    public void removerItem(String nome) {
        itens.removeIf(item -> item.nome.equalsIgnoreCase(nome));
    }

    // Calcula o valor total do carrinho
    public double calcularValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getValorTotal();
        }
        return total;
    }

    // Exibe todos os itens do carrinho
    public void exibirItens() {
        for (Item item : itens) {
            System.out.println(item.nome + " - Preço: " + item.preco + ", Quantidade: " + item.quantidade);
        }

    }

    public static void main(String[] args) {
        // Criando o carrinho de compras
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinho.adicionarItem("Livro Java", 59.90, 1);
        carrinho.adicionarItem("Mouse sem fio", 120.00, 2);
        carrinho.adicionarItem("Teclado mecânico", 250.00, 1);

        // Exibindo itens do carrinho
        System.out.println("Itens no carrinho:");
        carrinho.exibirItens();

        // Calculando e exibindo o valor total do carrinho
        System.out.println("Valor total do carrinho: R$ " + carrinho.calcularValorTotal());

        // Removendo um item do carrinho
        carrinho.removerItem("Mouse sem fio");

        // Exibindo itens do carrinho após a remoção
        System.out.println("Itens no carrinho após remover um item:");
        carrinho.exibirItens();

        // Calculando e exibindo o valor total do carrinho após a remoção
        System.out.println("Valor total do carrinho após remover um item: R$ " + carrinho.calcularValorTotal());
    }

}
