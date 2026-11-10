/*
 * Lucas Marques Almeida - 0024283
 * Roberto Carlos Martins - 0023293
 */

package application;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.entities.Produto;

public class Main {

    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        String[] opcoes = {
            "Cadastrar produto",
            "Listar produtos",
            "Consultar produto",
            "Valor total do estoque",
            "Sair"
        };

        while (true) {
            String opcao = (String) JOptionPane.showInputDialog(
                    null, "Escolha uma opção:", "Controle de Estoque",
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

            if (opcao == null || opcao.equals("Sair")) {
                break;
            }

            try {
                switch (opcao) {
                    case "Cadastrar produto":
                        String codigoTexto = JOptionPane.showInputDialog("Código:");
                        if (codigoTexto == null) break;

                        String descricao = JOptionPane.showInputDialog("Descrição:");
                        if (descricao == null) break;

                        String precoTexto = JOptionPane.showInputDialog("Preço:");
                        if (precoTexto == null) break;

                        String quantidadeTexto = JOptionPane.showInputDialog("Quantidade:");
                        if (quantidadeTexto == null) break;

                        int codigo = Integer.parseInt(codigoTexto);
                        double preco = Double.parseDouble(precoTexto.replace(',', '.'));
                        int quantidade = Integer.parseInt(quantidadeTexto);

                        if (codigo <= 0 || descricao.trim().isEmpty() || preco < 0 || quantidade < 0) {
                            JOptionPane.showMessageDialog(null, "Dados inválidos!");
                            break;
                        }

                        boolean existe = false;
                        for (Produto produto : produtos) {
                            if (produto.getCodigo() == codigo) {
                                existe = true;
                                break;
                            }
                        }
                        if (existe) {
                            JOptionPane.showMessageDialog(null, "Código já cadastrado!");
                            break;
                        }

                        produtos.add(new Produto(codigo, descricao, preco, quantidade));
                        JOptionPane.showMessageDialog(null, "Produto cadastrado!");
                        break;

                    case "Listar produtos":
                        if (produtos.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Nenhum produto cadastrado.");
                        } else {
                            String lista = "";
                            for (Produto produto : produtos) {
                                lista += produto.exibirDados() + "\n\n";
                            }
                            JOptionPane.showMessageDialog(null, lista);
                        }
                        break;

                    case "Consultar produto":
                        String buscaTexto = JOptionPane.showInputDialog("Código do produto:");
                        if (buscaTexto == null) break;

                        int codigoBusca = Integer.parseInt(buscaTexto);
                        Produto encontrado = null;
                        for (Produto produto : produtos) {
                            if (produto.getCodigo() == codigoBusca) {
                                encontrado = produto;
                                break;
                            }
                        }

                        if (encontrado == null) {
                            JOptionPane.showMessageDialog(null, "Produto não encontrado.");
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Produto: " + encontrado.getDescricao()
                                    + "\nPreço: R$ " + encontrado.getPreco()
                                    + "\nQuantidade: " + encontrado.getQuantidade());
                        }
                        break;

                    case "Valor total do estoque":
                        double total = 0;
                        for (Produto produto : produtos) {
                            total += produto.calcularValorTotal();
                        }
                        JOptionPane.showMessageDialog(null, "Valor total: R$ " + total);
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite valores numéricos válidos!");
            }
        }
    }
}
