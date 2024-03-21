package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    // Atributo para armazenar os convidados
    private static Set<Convidado> convidadoSet;

    // Construtor padrão que inicializa o conjunto de convidados como um HashSet vazio.
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    // Adiciona um novo convidado ao conjunto.
    public static void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    // Remove um convidado com base no código do convite.
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    // Retorna o número total de convidados no conjunto.
    public int contarConvidados() {
        return convidadoSet.size();
    }

    // Exibe os convidados presentes no conjunto.
    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    // Método principal (main) para demonstração.
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set Convidados");

        ConjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        ConjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        ConjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        ConjuntoConvidados.adicionarConvidado("Convidado 4", 1236);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set Convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set Convidados");

        conjuntoConvidados.exibirConvidados();
    }
}
