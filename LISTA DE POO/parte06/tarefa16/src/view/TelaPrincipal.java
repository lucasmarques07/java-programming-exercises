/*
 * Lucas Marques Almeida - 0024283
 * Roberto Carlos Martins - 0023293
 */

package view;

import javax.swing.JOptionPane;
import exceptions.ValidacaoException;
import model.Cliente;
import model.Pedido;
import model.Produto;
import service.GerenciadorPedidos;

public class TelaPrincipal {

    private GerenciadorPedidos gerenciador = new GerenciadorPedidos();

    public void iniciar() {
        String[] opcoes = {
            "Cadastrar cliente",
            "Cadastrar produto",
            "Listar clientes",
            "Listar produtos",
            "Criar pedido",
            "Processar pedidos",
            "Listar pedidos e status",
            "Sair"
        };

        while (true) {
            String opcao = (String) JOptionPane.showInputDialog(
                    null, "Escolha uma opção:", "Gerenciamento de Pedidos",
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

            if (opcao == null || opcao.equals("Sair")) {
                break;
            }

            try {
                switch (opcao) {
                    case "Cadastrar cliente":
                        cadastrarCliente();
                        break;
                    case "Cadastrar produto":
                        cadastrarProduto();
                        break;
                    case "Listar clientes":
                        JOptionPane.showMessageDialog(null, gerenciador.listarClientes());
                        break;
                    case "Listar produtos":
                        JOptionPane.showMessageDialog(null, gerenciador.listarProdutos());
                        break;
                    case "Criar pedido":
                        criarPedido();
                        break;
                    case "Processar pedidos":
                        int quantidade = gerenciador.processarPedidos();
                        JOptionPane.showMessageDialog(null, quantidade + " pedido(s) iniciado(s).\nConsulte os status no menu.");
                        break;
                    case "Listar pedidos e status":
                        JOptionPane.showMessageDialog(null, gerenciador.listarPedidos());
                        break;
                }
            } catch (ValidacaoException e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite valores numéricos válidos!");
            }
        }
    }

    private void cadastrarCliente() {
        String nome = JOptionPane.showInputDialog("Nome do cliente:");
        if (nome == null) return;

        Cliente cliente = gerenciador.cadastrarCliente(nome);
        JOptionPane.showMessageDialog(null, "Cliente cadastrado! Código: " + cliente.getCodigo());
    }

    private void cadastrarProduto() {
        String descricao = JOptionPane.showInputDialog("Nome do produto:");
        if (descricao == null) return;

        String precoTexto = JOptionPane.showInputDialog("Preço do produto:");
        if (precoTexto == null) return;

        double preco = Double.parseDouble(precoTexto.trim().replace(',', '.'));
        Produto produto = gerenciador.cadastrarProduto(descricao, preco);
        JOptionPane.showMessageDialog(null, "Produto cadastrado! Código: " + produto.getCodigo());
    }

    private void criarPedido() {
        String codigoClienteTexto = JOptionPane.showInputDialog(
                "Clientes:\n" + gerenciador.listarClientes() + "\nCódigo do cliente:");
        if (codigoClienteTexto == null) return;

        String codigoProdutoTexto = JOptionPane.showInputDialog(
                "Produtos:\n" + gerenciador.listarProdutos() + "\nCódigo do produto:");
        if (codigoProdutoTexto == null) return;

        String quantidadeTexto = JOptionPane.showInputDialog("Quantidade desejada:");
        if (quantidadeTexto == null) return;

        int codigoCliente = Integer.parseInt(codigoClienteTexto.trim());
        int codigoProduto = Integer.parseInt(codigoProdutoTexto.trim());
        int quantidade = Integer.parseInt(quantidadeTexto.trim());

        Pedido pedido = gerenciador.criarPedido(codigoCliente, codigoProduto, quantidade);
        JOptionPane.showMessageDialog(null, "Pedido nº " + pedido.getNumero() + " criado!\nStatus: " + pedido.getStatus());
    }
}
