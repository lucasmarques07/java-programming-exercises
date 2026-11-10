/*
 * Lucas Marques Almeida - 0024283
 * Roberto Carlos Martins - 0023293
 */

package model.entities;

public class Produto {

    private int codigo;
    private String descricao;
    private double preco;
    private int quantidade;

    public Produto(int codigo, String descricao, double preco, int quantidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double calcularValorTotal() {
        return preco * quantidade;
    }

    public String exibirDados() {
        return "Código: " + codigo
                + "\nDescrição: " + descricao
                + "\nPreço: R$ " + preco
                + "\nQuantidade: " + quantidade;
    }
}
