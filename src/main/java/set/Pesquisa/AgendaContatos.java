package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    // Atributo para armazenar os contatos
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        // Inicializa o conjunto de contatos
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        // Cria um novo contato e adiciona ao conjunto
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        // Exibe todos os contatos no conjunto
        for (Contato c : contatoSet) {
            System.out.println(c);
        }
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        // Cria um conjunto para armazenar contatos com nomes correspondentes
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        // Atualiza o número de telefone de um contato específico
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe AgendaContatos
        AgendaContatos agendaContatos = new AgendaContatos();

        // Adiciona alguns contatos
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Maria Silva", 1111111);

        // Exibe todos os contatos
        agendaContatos.exibirContatos();

        // Pesquisa contatos com nome iniciando por "Camila"
        System.out.println("Contatos com nome iniciando por 'Camila': " + agendaContatos.pesquisarPorNome("Camila"));

        // Atualiza o número de telefone de um contato
        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Maria Silva", 5555555);
        System.out.println("Contato atualizado: " + contatoAtualizado);
    }
}
