package main.java.list.OperacoesBasicas;

// Classe para representar um item no carrinho de compras
class Item {
    String nome;
    double preco;
    int quantidade;

    // Construtor da classe Item
    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Método para obter o valor total do item (preço * quantidade)
    public double getValorTotal() {
        return preco * quantidade;
    }
}