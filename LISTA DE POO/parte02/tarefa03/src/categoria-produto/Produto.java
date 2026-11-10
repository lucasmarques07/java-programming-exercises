/*
 * Lucas Marques Almeida - 0024283
 * Roberto Carlos Martins - 0023293
 */

public class Produto {

    private String descricao;
    private CategoriaProduto categoria;

    public Produto(String descricao, CategoriaProduto categoria) {
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }

    public void exibirDados() {
        System.out.println("Produto: " + descricao);
        System.out.println("Categoria: " + categoria);
    }
}
