/*
 * Lucas Marques Almeida - 0024283
 * Roberto Carlos Martins - 0023293
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Código: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        System.out.print("Descrição: ");
        String descricao = sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade em estoque: ");
        int quantidadeEstoque = sc.nextInt();
        sc.nextLine();

        System.out.print("Categoria: ");
        String categoria = sc.nextLine();

        Produto produto = new Produto(codigo, descricao, preco, quantidadeEstoque, categoria);

        System.out.println("\n--- Dados do produto ---");
        produto.exibirDados();
        System.out.println("Valor total em estoque: R$ " + produto.calcularValorTotalEstoque());

        sc.close();
    }
}
