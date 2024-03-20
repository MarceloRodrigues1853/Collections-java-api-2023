package main.java.list.Ordenacao;

import java.util.Comparator;

// Classe Pessoa com implementação da interface Comparable para ordenação por idade
public class Pessoa implements Comparable<Pessoa> {
    // Atributos da classe Pessoa
    private String nome;
    private int idade;
    private double altura;

    // Construtor da classe Pessoa
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Método sobrescrito de Comparable para comparar pessoas pela idade
    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(this.idade, p.getIdade());
    }

    // Getters para os atributos da classe Pessoa
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    // Método sobrescrito para representação textual do objeto Pessoa
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}

// Classe ComparatorPorAltura para ordenação de objetos Pessoa por altura
class ComparatorPorAltura implements Comparator<Pessoa> {

    // Método sobrescrito de Comparator para comparar pessoas pela altura
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
