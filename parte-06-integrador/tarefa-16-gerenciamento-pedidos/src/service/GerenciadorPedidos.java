/*
 * Lucas Marques Almeida - 0024283
 * Roberto Carlos Martins - 0023293
 */

package service;

import java.util.ArrayList;
import enums.StatusPedido;
import exceptions.ValidacaoException;
import model.Cliente;
import model.Pedido;
import model.Produto;

public class GerenciadorPedidos {

    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Produto> produtos = new ArrayList<>();
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public Cliente cadastrarCliente(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new ValidacaoException("Informe o nome do cliente.");
        }

        Cliente cliente = new Cliente(clientes.size() + 1, nome.trim());
        clientes.add(cliente);
        return cliente;
    }

    public Produto cadastrarProduto(String descricao, double preco) {
        if (descricao == null || descricao.trim().isEmpty() || preco <= 0 || !Double.isFinite(preco)) {
            throw new ValidacaoException("Informe um produto e um preço válido.");
        }

        Produto produto = new Produto(produtos.size() + 1, descricao.trim(), preco);
        produtos.add(produto);
        return produto;
    }

    public Pedido criarPedido(int codigoCliente, int codigoProduto, int quantidade) {
        if (quantidade <= 0) {
            throw new ValidacaoException("A quantidade deve ser maior que zero.");
        }

        Cliente clienteEncontrado = null;
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo() == codigoCliente) {
                clienteEncontrado = cliente;
                break;
            }
        }
        if (clienteEncontrado == null) {
            throw new ValidacaoException("Cliente não encontrado.");
        }

        Produto produtoEncontrado = null;
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigoProduto) {
                produtoEncontrado = produto;
                break;
            }
        }
        if (produtoEncontrado == null) {
            throw new ValidacaoException("Produto não encontrado.");
        }

        Pedido pedido = new Pedido(pedidos.size() + 1, clienteEncontrado, produtoEncontrado, quantidade);
        pedidos.add(pedido);
        return pedido;
    }

    public int processarPedidos() {
        int iniciados = 0;

        for (Pedido pedido : pedidos) {
            if (pedido.getStatus() == StatusPedido.PENDENTE) {
                pedido.setStatus(StatusPedido.EM_PROCESSAMENTO);
                new ProcessadorPedido(pedido).start();
                iniciados++;
            }
        }

        return iniciados;
    }

    public String listarClientes() {
        if (clientes.isEmpty()) {
            return "Nenhum cliente cadastrado.";
        }

        String lista = "";
        for (Cliente cliente : clientes) {
            lista += cliente.exibirDados() + "\n";
        }
        return lista;
    }

    public String listarProdutos() {
        if (produtos.isEmpty()) {
            return "Nenhum produto cadastrado.";
        }

        String lista = "";
        for (Produto produto : produtos) {
            lista += produto.exibirDados() + "\n";
        }
        return lista;
    }

    public String listarPedidos() {
        if (pedidos.isEmpty()) {
            return "Nenhum pedido cadastrado.";
        }

        String lista = "";
        for (Pedido pedido : pedidos) {
            lista += pedido.exibirDados() + "\n\n";
        }
        return lista;
    }
}
