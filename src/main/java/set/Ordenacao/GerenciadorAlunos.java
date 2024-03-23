package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    // Conjunto para armazenar os alunos
    private Set<Aluno> alunos;

    // Construtor da classe GerenciadorAlunos
    public GerenciadorAlunos() {
        this.alunos = new TreeSet<>();
    }

    // Método para adicionar um novo aluno ao conjunto
    public void adicionarAluno(String nome, Long matricula, double media) {
        alunos.add(new Aluno(nome, matricula, media));
    }

    // Método para remover um aluno do conjunto a partir da matrícula, se estiver presente
    public void removerAluno(long matricula) {
        alunos.removeIf(aluno -> aluno.getMatricula() == matricula);
    }

    // Método para exibir todos os alunos do conjunto em ordem alfabética pelo nome
    public void exibirAlunosPorNome() {
        alunos.forEach(System.out::println);
    }

    // Método para exibir todos os alunos do conjunto em ordem crescente de nota
    public void exibirAlunosPorNota() {
        alunos.stream()
                .sorted(Comparator.comparing(Aluno::getMedia))
                .forEach(System.out::println);
    }

    // Método para exibir todos os alunos do conjunto
    public void exibirAlunos() {
        alunos.forEach(System.out::println);
    }

    // Classe interna Aluno para representar um aluno
    static class Aluno implements Comparable<Aluno> {
        // Atributos da classe Aluno
        private String nome;
        private Long matricula;
        private double media;

        // Construtor da classe Aluno
        public Aluno(String nome, Long matricula, double media) {
            this.nome = nome;
            this.matricula = matricula;
            this.media = media;
        }

        // Método para obter o nome do aluno
        public String getNome() {
            return nome;
        }

        // Método para obter a matrícula do aluno
        public Long getMatricula() {
            return matricula;
        }

        // Método para obter a média do aluno
        public double getMedia() {
            return media;
        }

        // Método equals para verificar se dois alunos são iguais com base na matrícula
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Aluno aluno)) return false;
            return Objects.equals(matricula, aluno.matricula);
        }

        // Método hashCode para gerar o código hash com base na matrícula do aluno
        @Override
        public int hashCode() {
            return Objects.hash(matricula);
        }

        // Método compareTo para comparar alunos por nome
        @Override
        public int compareTo(Aluno aluno) {
            return this.nome.compareTo(aluno.nome);
        }

        // Método toString para representar o aluno como uma string
        @Override
        public String toString() {
            return "Aluno{" +
                    "nome='" + nome + '\'' +
                    ", matricula=" + matricula +
                    ", media=" + media +
                    '}';
        }
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();

        // Adicionando alguns alunos
        gerenciador.adicionarAluno("João", 12345L, 8.5);
        gerenciador.adicionarAluno("Maria", 54321L, 7.8);
        gerenciador.adicionarAluno("Pedro", 98765L, 9.2);

        // Exibindo todos os alunos
        System.out.println("Todos os alunos:");
        gerenciador.exibirAlunos();
        System.out.println();

        // Exibindo os alunos por nome
        System.out.println("Alunos em ordem alfabética pelo nome:");
        gerenciador.exibirAlunosPorNome();
        System.out.println();

        // Exibindo os alunos por nota
        System.out.println("Alunos em ordem crescente de nota:");
        gerenciador.exibirAlunosPorNota();
    }
}
