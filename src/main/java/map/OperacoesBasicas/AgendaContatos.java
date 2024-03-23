package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // Atributo para armazenar os contatos, com o nome como chave e o telefone como valor
    private Map<String, Integer> agendaContatoMap;

    // Construtor da classe AgendaContatos
    public AgendaContatos() {
        // Inicializa o mapa de contatos como um HashMap
        this.agendaContatoMap = new HashMap<>();
    }

    // Método para adicionar um novo contato à agenda
    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    // Método para remover um contato da agenda pelo nome
    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        } else {
            System.out.println("A agenda de contatos está vazia.");
        }
    }

    // Método para exibir todos os contatos da agenda
    public void exibirContatos() {
        if (!agendaContatoMap.isEmpty()) {
            System.out.println(agendaContatoMap);
        } else {
            System.out.println("A agenda de contatos está vazia.");
        }
    }

    // Método para pesquisar o número de telefone de um contato pelo nome
    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
            if (numeroPorNome == null) {
                System.out.println("Contato não encontrado na agenda.");
            }
        } else {
            System.out.println("A agenda de contatos está vazia.");
        }
        return numeroPorNome;
    }

    // Método main para testar as funcionalidades da classe AgendaContatos
    public static void main(String[] args) {
        // Criando uma instância de AgendaContatos
        AgendaContatos agendaContatos = new AgendaContatos();

        // Adicionando contatos
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("João", 5665);
        agendaContatos.adicionarContato("Carlos", 1111111);
        agendaContatos.adicionarContato("Ana", 654987);
        agendaContatos.adicionarContato("Maria", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);

        // Exibindo todos os contatos
        agendaContatos.exibirContatos();

        // Removendo um contato
        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContatos();

        // Pesquisando número por nome
        String nomePesquisa = "João";
        Integer numeroPesquisa = agendaContatos.pesquisarPorNome("João");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

        String nomePesquisaNaoExistente = "Paula";
        Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
    }
}
