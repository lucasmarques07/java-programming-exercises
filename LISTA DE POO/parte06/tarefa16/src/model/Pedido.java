/*
 * Lucas Marques Almeida - 0024283
 * Roberto Carlos Martins - 0023293
 */

package model;

import enums.StatusPedido;

public class Pedido {

    private int numero;
    private Cliente cliente;
    private Produto produto;
    private int quantidade;
    private StatusPedido status;

    public Pedido(int numero, Cliente cliente, Produto produto, int quantidade) {
        this.numero = numero;
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.status = StatusPedido.PENDENTE;
    }

    public int getNumero() {
        return numero;
    }

    public synchronized StatusPedido getStatus() {
        return status;
    }

    public synchronized void setStatus(StatusPedido status) {
        this.status = status;
    }

    public double calcularTotal() {
        return produto.getPreco() * quantidade;
    }

    public String exibirDados() {
        return "Pedido nº " + numero
                + "\nCliente: " + cliente.getNome()
                + "\nProduto: " + produto.getDescricao()
                + "\nQuantidade: " + quantidade
                + "\nTotal: R$ " + calcularTotal()
                + "\nStatus: " + getStatus();
    }
}
